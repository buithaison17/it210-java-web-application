package com.restaurant.session05.bai3.controller;

import com.restaurant.session05.bai3.service.AdminDishService;
import com.restaurant.session05.common.Dish;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminDishController {
    private AdminDishService adminDishService;

    public AdminDishController(AdminDishService adminDishService) {
        this.adminDishService = adminDishService;
    }

    @GetMapping("/bai3/edit/{id}")
    public String showFormEdit(@PathVariable("id") String id,
                               Model model) {
        Dish dish = adminDishService.findById(id);
        if (dish == null) {
            model.addAttribute("error", "Dish not found");
            return "redirect:/bai3/dish-list";
        }
        model.addAttribute("dish", dish);
        return "edit-dish";
    }

    @PostMapping("/bai3/update")
    public String editDish(@ModelAttribute("dish") Dish dish,
                           Model model) {
        adminDishService.updateDish(dish);
        return "redirect:/bai2/dish-list";
    }

}
