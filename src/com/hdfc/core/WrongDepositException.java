package com.hdfc.core;

public class WrongDepositException extends Exception{
	
	public WrongDepositException(){
	}
	
	public WrongDepositException(String msg){
		super(msg);
	}
}