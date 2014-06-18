package com.hdfc.core;

import org.junit.*;
import static org.junit.Assert.*;


public class AccountServiceTest{


	@Test(expected=WrongDepositException.class)	
	public void testInvalidDeposit() throws WrongDepositException{
		AccountService accountService=new AccountService(1000,"Laden","S",12000);
		accountService.deposit(-5000);
	}


	@Test	
	public void testDeposit()  throws WrongDepositException{
		AccountService accountService=new AccountService(1000,"Laden","S",12000);
		accountService.deposit(4000);
		assertTrue(accountService.balance()==16000);	
	}

	@Test	
	public void testWithdraw()  throws WrongDepositException{
		AccountService accountService=new AccountService(1000,"Laden","S",12000);
		accountService.withdraw(4000);
		assertTrue(accountService.balance()==8000);	
	}

	@Test	
	public void testAccountType()  throws WrongDepositException{
		AccountService accountService=new AccountService(1000,"Laden","S",12000);
		assertEquals("S",accountService.accountType());	
	}

	@Test	
	public void testDetails()  throws WrongDepositException{
		AccountService accountService=new AccountService(1000,"Laden","S",12000);
		accountService.details();	
	}

	@Test	
	public void testZeroBalance(){
		AccountService accountService=new AccountService();
		assertTrue(accountService.balance()==0);	
	}

	@Test	
	public void testBalance(){
		AccountService accountService=new AccountService(1000,"Laden","S",12000);
		assertTrue(accountService.balance()==12000);	
	}
	
}