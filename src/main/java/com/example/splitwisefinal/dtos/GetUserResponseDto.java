package com.example.splitwisefinal.dtos;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetUserResponseDto {

    private  Long userId;
    private String userName;
    private  String  phone;
    //password  skippped i dont want to show it  sow insted of  showing  coplete  user model we  are just presenting the required details

    private  ResponseStatus responseStatus;
    private  String message;
}
