package com.geekster.RestaurantApp.repository;

import com.geekster.RestaurantApp.model.AuthenticationToken;
import com.geekster.RestaurantApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITokenRepo extends JpaRepository<AuthenticationToken,Long> {

    AuthenticationToken findByUser(User user);
}
