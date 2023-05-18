package com.geekster.RestaurantApp.repository;

import com.geekster.RestaurantApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Long> {
    User findFirstByEmail(String userEmail);
}
