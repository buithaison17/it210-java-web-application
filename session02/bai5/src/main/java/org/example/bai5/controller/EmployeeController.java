package org.example.bai5.controller;

import jakarta.servlet.http.HttpSession;
import org.example.bai5.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private final List<Employee> list = new ArrayList<>();

    public EmployeeController() {
        list.add(new Employee("001", "Nguyen Van A", "Phong IT", 1000000, new Date(10, 10, 1999), "active"));
        list.add(new Employee("002", "Nguyen Van B", "Phong IT", 2000000, new Date(11, 11, 1999), "active"));
        list.add(new Employee("003", "Nguyen Van C", "Phong IT", 3000000, new Date(12, 12, 1999), "active"));
        list.add(new Employee("004", "Nguyen Van D", "Phong IT", 4000000, new Date(13, 13, 1999), "active"));
        list.add(new Employee("005", "Nguyen Van E", "Phong IT", 5000000, new Date(14, 14, 1999), "active"));
    }

    @GetMapping
    public String employees(Model model, HttpSession session) {

        String username = (String) session.getAttribute("username");
        if (username == null) {
            return "redirect:/login";
        }

        model.addAttribute("list", list);
        return "employees";
    }

    @GetMapping("/{id}")
    public String employeeDetail(@PathVariable(value = "id") String id,
                                 HttpSession session,
                                 Model model) {
        Employee employee = list.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);

        String username = (String) session.getAttribute("username");
        if (username == null) {
            return "redirect:/login";
        }

        if (employee == null) {
            return "redirect:/not-found";
        }

        model.addAttribute("employee", employee);
        return "employee-detail";
    }
}
