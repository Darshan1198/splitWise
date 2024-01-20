package com.example.splitwisefinal.models;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User extends BaseModel{
    private  String  userName;
    private  String phone;
    private  String password;

}
