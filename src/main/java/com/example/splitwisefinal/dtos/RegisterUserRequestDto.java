package com.example.splitwisefinal.dtos;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegisterUserRequestDto {
    private  String userName;
    private String phone;
    private String password;

}
