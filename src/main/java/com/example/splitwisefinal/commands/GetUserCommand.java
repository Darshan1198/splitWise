package com.example.splitwisefinal.commands;

import com.example.splitwisefinal.controllers.GroupController;
import com.example.splitwisefinal.controllers.UserController;
import com.example.splitwisefinal.dtos.*;
import com.example.splitwisefinal.models.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
//getUser command will have user controller
// getUser  <<userId>>
public class GetUserCommand implements  Command{
    private UserController userController;

    @Autowired
    //@repository @serice  @restcontroller  @component  at application  start spring will create one  object
    public  GetUserCommand(UserController userController) { // what ever  object  created in the  groupcontroller will be passed over  here  by spring  Dependency injection( topoogical sort
        this.userController = userController;
    }
    @Override
    public boolean canExecute(String input) {
        if  (!input.startsWith("getUser")){
            return  false;
        }
        if  (input.split(" ").length!=2){
            return false;
        }
        String[] arr  = input.split(" ");
        try {
            long  groupId = Long.parseLong(arr[1]);
        }
        catch (NumberFormatException numberFormatException){
            return false;

        }
        return  true;
    }

    @Override
    public void execute(String input) {
        String [] arr = input.split(" ");
        long  userId  = Long.parseLong(arr[1]);
        GetUserRequestDto requestDto = new GetUserRequestDto();
        requestDto.setUserId(userId);
//        GetUserResponseDto responseDto = userController.getUser(requestDto);// before  using the  get mapping and  requstparam
        GetUserResponseDto responseDto = userController.getUser(userId);
        if (responseDto.getResponseStatus() == ResponseStatus.SUCCESS){
            System.out.println("User Id = "+responseDto.getUserId());
            System.out.println("User name = "+responseDto.getUserName());
            System.out.println("User phone= "+responseDto.getPhone());

        }
        else {
            System.out.println("getUser  failed  with message= "+ responseDto.getMessage());
        }

    }
}
