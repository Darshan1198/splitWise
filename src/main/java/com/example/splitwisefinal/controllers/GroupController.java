package com.example.splitwisefinal.controllers;


import com.example.splitwisefinal.dtos.ResponseStatus;
import com.example.splitwisefinal.dtos.SettleGroupRequestDto;
import com.example.splitwisefinal.dtos.SettleGroupResponseDto;
import org.springframework.stereotype.Controller;

@Controller
public class GroupController {

    public  SettleGroupResponseDto settleGroup(SettleGroupRequestDto requestDto){
        SettleGroupResponseDto  responseDto  = new SettleGroupResponseDto();
        responseDto.setResponseStatus(ResponseStatus.FAILURE);
        responseDto.setMessage("not  implemented  yet");
        return  responseDto;
    }
}
