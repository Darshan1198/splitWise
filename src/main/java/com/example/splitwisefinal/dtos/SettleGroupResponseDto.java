package com.example.splitwisefinal.dtos;

import com.example.splitwisefinal.models.Transaction;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SettleGroupResponseDto {
    private List<Transaction> transactions;
    private  ResponseStatus responseStatus;
    private  String message;
}
