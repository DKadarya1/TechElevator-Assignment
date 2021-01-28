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