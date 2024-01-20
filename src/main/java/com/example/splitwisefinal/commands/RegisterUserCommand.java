package com.example.splitwisefinal.commands;

import com.example.splitwisefinal.controllers.GroupController;
import com.example.splitwisefinal.controllers.UserController;
import com.example.splitwisefinal.dtos.*;
import com.example.splitwisefinal.models.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
//registeruserCommand will have controller
//registerUser <<name>> <<phone>> <<pwd>>
public class RegisterUserCommand implements  Command{
    private UserController userController;

    @Autowired
    //@repository @serice  @restcontroller  @component  at application  start spring will create one  object
    public  RegisterUserCommand(UserController userController) { // what ever  object  created in the  groupcontroller will be passed over  here  by spring  Dependency injection( topoogical sort
        this.userController = userController;
    }
    @Override
    public boolean canExecute(String input) {
        if  (!input.startsWith("registerUser")){
            return  false;
        }
        if  (input.split(" ").length!=4){
            return false;
        }

        return  true;
    }

    @Override
    public void execute(String input) {
        String [] arr = input.split(" ");
        RegisterUserRequestDto requestDto = new RegisterUserRequestDto();
        requestDto.setUserName(arr[1]);
        requestDto.setPhone(arr[2]);
        requestDto.setPassword(arr[3]);


        RegisterUserResponseDto responseDto = userController.registerUser(requestDto);

        if (responseDto.getResponseStatus() == ResponseStatus.SUCCESS){
            System.out.println("user created  with  id"+ responseDto.getUserId());
        }
        else {
            System.out.println("getUser  failed  with message= "+ responseDto.getMessage());
        }

    }
}
