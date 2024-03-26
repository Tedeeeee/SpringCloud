package com.example.userservice.vo;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class RequestUser {

    @NotNull(message = "Email cannot be null")
    @Size(min = 2, message = "Email not be less than two characters")
    @Email
    private String email;

    @NotNull(message = "name cannot be null")
    @Size(min = 2, message = "Name not be less than two characters")
    private String name;

    @NotNull(message = "pwd cannot be null")
    @Size(min = 8, message = "password must be equal or grater than 8 characters")
    private String pwd;
}
