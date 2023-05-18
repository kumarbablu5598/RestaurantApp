package com.geekster.RestaurantApp.services;

import com.geekster.RestaurantApp.dto.SignUpInput;
import com.geekster.RestaurantApp.model.FoodItem;
import com.geekster.RestaurantApp.repository.IFoodItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodItemService {

    @Autowired
    private IFoodItemRepo iFoodItemRepo;
    public FoodItem createFoodItem(FoodItem foodItem,String hasRole) throws IllegalAccessException {


        if(hasRole.equalsIgnoreCase("admin")){
            iFoodItemRepo.save(foodItem);
            return foodItem;
        }
        else{
            throw  new IllegalAccessException("Access denied due to access by another user");
        }
    }
}
