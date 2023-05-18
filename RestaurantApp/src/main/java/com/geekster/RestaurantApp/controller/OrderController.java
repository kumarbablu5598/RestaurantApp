package com.geekster.RestaurantApp.controller;

import com.geekster.RestaurantApp.model.Order;
import com.geekster.RestaurantApp.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restaurant")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/createOrder")
    public Order createOrder(@RequestBody Order order, @RequestParam String role) throws IllegalAccessException {
        Order returnOrder=orderService.createOrder(order,role);
        return returnOrder;
    }


}
