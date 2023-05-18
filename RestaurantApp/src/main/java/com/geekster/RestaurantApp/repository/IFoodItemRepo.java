package com.geekster.RestaurantApp.repository;

import com.geekster.RestaurantApp.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodItemRepo extends JpaRepository<FoodItem,Long> {
}
