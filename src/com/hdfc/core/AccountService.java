package com.hdfc.core;

public class AccountService{
	
	int id;
	String name;
	String type;
	long funds;

	public AccountService(){
	}

	public AccountService(int id,String name,String type,long funds){
		this.id=id;
		this.name=name;
		this.type=type;
		this.funds=funds;
	}

	public long balance(){
		return this.funds;
	}

	public void withdraw(long amount){
		this.funds=this.funds-amount;	
	}

	public void deposit(long amount) throws WrongDepositException{
		if(amount<=0){
			throw new WrongDepositException("Invalid Numeric Value!");
		}
		this.funds=this.funds+amount;	
	}

	public String accountType(){
		return this.type;
	}

	public void details(){
		System.out.println("ID : "+this.id);
		System.out.println("Name : "+this.name);
		System.out.println("Type : "+this.type);
		System.out.println("Funds : "+this.funds);
	}

}