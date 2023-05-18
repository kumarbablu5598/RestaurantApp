package com.geekster.RestaurantApp.repository;

import com.geekster.RestaurantApp.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepo extends JpaRepository<Order,Long> {
}
