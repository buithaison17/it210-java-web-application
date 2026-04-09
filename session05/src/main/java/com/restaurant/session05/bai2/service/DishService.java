package com.restaurant.session05.bai2.service;

import com.restaurant.session05.common.Dish;
import com.restaurant.session05.bai2.repository.DishRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService {
    private DishRepository dishRepository;

    public DishService(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    public List<Dish> findAll() {
        return dishRepository.findAll();
    }

}
