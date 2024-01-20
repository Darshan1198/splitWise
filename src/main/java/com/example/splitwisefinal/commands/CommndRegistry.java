package com.example.splitwisefinal.commands;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


// inorder  to make  all the  comomand  availble here we  can call this  ad  collection of  all the  command

@Component
public class CommndRegistry {
    private List<Command>  registeredCommand = new ArrayList<>();
//    @Autowired
//    private  GetUserCommand  getUserCommand; this is  also possible  to auto aire th  induividual component

    @Autowired
    public CommndRegistry(GetUserCommand getUserCommand,RegisterUserCommand registerUserCommand,SettleGroupCommand settleGroupCommand){
        registeredCommand.add(getUserCommand);
        registeredCommand.add(registerUserCommand);
        registeredCommand.add(settleGroupCommand);
    }


    public  void process(String  input){
        for(Command  registeredCommand : registeredCommand){
            if (registeredCommand.canExecute(input) == true){
                registeredCommand.execute(input);
                break;
            }

        }
    }


}
