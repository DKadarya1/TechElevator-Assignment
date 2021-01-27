package com.techelevator;


public class CheckingAccount extends BankAccount {

	public CheckingAccount() {
		super();
		}
	
	
	public CheckingAccount(String accountHolder, String accountNumber) {
		super (accountHolder, accountNumber);
		int balance = 0;
		
	}
	
	public CheckingAccount(String accountHolder, String accountNumber, int balance ) {
		super (accountHolder, accountNumber);
	
	}

	public int withdraw(int amountToWithdraw) {
		//if balance < 0
		//$10.00 overdraft fee
		//then  overdraft up to $100
		//if overdraft > 100 then transfer fails balance = balance	
		
	
	if( super.getBalance().doubleValue() >= amountToWithdraw.doubleValue()) {
		super.withdraw(amountToWithdraw);
	}	
		else {
			if(super.getBalance().doubleValue() - amountToWithdraw.doubleValue() >= -100) {
				super.withdraw(amountToWithdraw.add(new int ("10")));
			}
			else {
				return super.getBalance();
			}
		}
	
	return super.getBalance();
	
}
	
	
	
	

}