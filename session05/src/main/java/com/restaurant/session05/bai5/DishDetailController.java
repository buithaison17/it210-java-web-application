package com.restaurant.session05.bai5;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bai5/dish")
public class DishDetailController {

    private final OrderService service;

    public DishDetailController(OrderService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public String detail(@PathVariable("id") String id, Model model) {
        model.addAttribute("dish", service.getDishById(id));
        return "bai5/detail";
    }
}