package com.restaurant.session05.bai3.service;

import com.restaurant.session05.bai2.repository.DishRepository;
import com.restaurant.session05.common.Dish;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminDishService {
    private DishRepository dishRepository;

    public AdminDishService(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    public List<Dish> findAll() {
        return dishRepository.findAll();
    }

    public Dish findById(String id) {
        return dishRepository.findAll()
                .stream()
                .filter(d -> d.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void updateDish(Dish dish) {
        dishRepository.update(dish);
    }
}
