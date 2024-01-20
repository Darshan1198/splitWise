package com.example.splitwisefinal.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegisterUserResponseDto {
    private  Long userId;
    private  ResponseStatus responseStatus;
    private  String message;

}
