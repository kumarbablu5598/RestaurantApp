package com.geekster.RestaurantApp.controller;

import com.geekster.RestaurantApp.dto.SignInInput;
import com.geekster.RestaurantApp.dto.SignInOutput;
import com.geekster.RestaurantApp.dto.SignUpInput;
import com.geekster.RestaurantApp.dto.SignUpOutput;
import com.geekster.RestaurantApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurant")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public SignUpOutput signUp(@RequestBody SignUpInput signUpDto){
        return userService.signUp(signUpDto);

    }

    //sign in
    @PostMapping("/signin")
    public SignInOutput signIn(@RequestBody SignInInput signInDto){

        return userService.signIn(signInDto);
    }

}
