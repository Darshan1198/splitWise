package com.example.splitwisefinal;

import com.example.splitwisefinal.commands.CommndRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SplitwiseFInalApplication  implements CommandLineRunner {

	private CommndRegistry  commndRegistry;

	@Autowired
	public  SplitwiseFInalApplication(CommndRegistry commndRegistry){
		this.commndRegistry = commndRegistry;
	}

	public static void main(String[] args) {
		SpringApplication.run(SplitwiseFInalApplication.class, args);
	}


//	input of  application
//	exit
//	settleGroup <groupId>
//  registerUser <<name>> <<phone>> <<pwd>>
//	getUser  <<userId>>



	// all the  inputs are coming  thorugh this  run method
	@Override
	public void run(String... args) throws Exception {
		Scanner sc  = new Scanner(System.in);
		while (true){
			String  input  = sc.nextLine();
			commndRegistry.process(input);
		}

	}
}
