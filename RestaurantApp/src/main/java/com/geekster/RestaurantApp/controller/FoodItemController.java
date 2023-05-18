package com.geekster.RestaurantApp.controller;

import com.geekster.RestaurantApp.dto.SignUpInput;
import com.geekster.RestaurantApp.model.FoodItem;
import com.geekster.RestaurantApp.services.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restaurant")
public class FoodItemController {

    @Autowired
    private FoodItemService foodItemService;

    @PostMapping("/createFoodItem")
    public FoodItem createFoodItem(@RequestBody FoodItem foodItem, @RequestParam String role) throws IllegalAccessException {

        FoodItem returnFoodItem=foodItemService.createFoodItem(foodItem,role);
        return returnFoodItem;
    }
}