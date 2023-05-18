package com.geekster.RestaurantApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignUpInput {

    private String userFirstName;
    private String userLastName;
    private Integer userAge;
    private String userEmail;
    private String userPassword;
    private String userContact;
    private String userRole;
}
