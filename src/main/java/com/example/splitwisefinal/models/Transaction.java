package com.example.splitwisefinal.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
// No @entity  because  no tale for this mode  since  we  are  using  it for entring the  transaction
public class Transaction{
    private  String from;
    private  String to;
    private  int amount;


    @Override
    public String toString() {
        return from +" should pay "+ amount + " to " + to +"\n";
    }
}
