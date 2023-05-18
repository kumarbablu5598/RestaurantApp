package com.geekster.RestaurantApp.services;

import com.geekster.RestaurantApp.model.AuthenticationToken;
import com.geekster.RestaurantApp.model.User;
import com.geekster.RestaurantApp.repository.ITokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    @Autowired
    private ITokenRepo iTokenRepo;

    public void saveToken(AuthenticationToken token){
        iTokenRepo.save(token);
    }

    public AuthenticationToken getToken(User user) {
        return iTokenRepo.findByUser(user);
    }
}
