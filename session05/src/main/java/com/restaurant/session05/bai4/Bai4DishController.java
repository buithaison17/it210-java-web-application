package com.restaurant.session05.bai4;

import com.restaurant.session05.bai2.service.DishService;
import com.restaurant.session05.bai3.service.AdminDishService;
import com.restaurant.session05.common.Dish;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Bai4DishController {
    private AdminDishService dishService;

    public Bai4DishController(AdminDishService dishService) {
        this.dishService = dishService;
    }

    @GetMapping("/dish")
    public String dish(Model model) {
        model.addAttribute("dishes", dishService.findAll());
        return "dishes";
    }

    @GetMapping("/dish/{id}")
    public String dishDetail(@PathVariable("id") String id,
                             Model model) {
        Dish dish = dishService.findById(id);
        model.addAttribute("item", dish);
        return "dish-detail";
    }
}
