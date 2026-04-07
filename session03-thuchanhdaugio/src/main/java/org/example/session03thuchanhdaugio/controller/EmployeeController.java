package org.example.session03thuchanhdaugio.controller;

import org.example.session03thuchanhdaugio.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    @GetMapping
    public String employee(Model model) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee("NV01", "Trôn", "Lao công", 20000));
        list.add(new Employee("NV02", "Công", "Bảo vệ", 2000));
        list.add(new Employee("NV03", "Kiên", "Bảo vệ", 10000));
        list.add(new Employee("NV04", "Sơn Bùi", "IT", 25000));
        list.add(new Employee("NV05", "Văn Kiên", "Lao công", 1500));
        list.add(new Employee("NV06", "Trôn Trôn", "Lao công", 1000));

        model.addAttribute("employees", list);

        return "employee-list";
    }
}
