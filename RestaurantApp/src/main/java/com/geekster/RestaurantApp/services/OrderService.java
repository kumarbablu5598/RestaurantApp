package com.geekster.RestaurantApp.services;

import com.geekster.RestaurantApp.model.Order;
import com.geekster.RestaurantApp.repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private IOrderRepo iOrderRepo;
    public Order createOrder(Order order, String hasRole) throws IllegalAccessException {


        if(hasRole.equalsIgnoreCase("normal")){
            iOrderRepo.save(order);
            return order;
        }else{
            throw  new IllegalAccessException(" Access Denied !!! only normal user is allowed to create");
        }
    }
}
