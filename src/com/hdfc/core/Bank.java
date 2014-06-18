package com.hdfc.core;

public class Bank{
	
	public static void main(String s[]){
		AccountService accountService=new AccountService(1000,"Laden","S",12000);
		accountService.details();
	}	
}