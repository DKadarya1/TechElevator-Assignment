package com.techelevator;


import java.math.RoundingMode;

public class SavingsAccount extends BankAccount {

	int amountToDeposit = 2;
	private BankAccount checkingAccount;
	int newBalance = checkingAccount.deposit(amountToDeposit); `

	public SavingsAccount() {
		super();

	}

	public SavingsAccount(String accountHolder, String accountNumber) {
		super (accountHolder, accountNumber);
		
	
	}
	
	public SavingsAccount(String accountHolder, String accountNumber, int balance ) {
		super (accountHolder, accountNumber);
		
		
		
	}

	
	public int withdraw(int amountToWithdraw) {

		if (super.getBalance().doubleValue() > 150) {

			super.withdraw(amountToWithdraw);

		} else {
			if (((super.getBalance().doubleValue() < 150) && (super.getBalance().doubleValue() >= 0))&&
					amountToWithdraw.doubleValue() <= super.getBalance().doubleValue()) {
				super.withdraw(amountToWithdraw.add (new int("2.00")));
			} else {

				return super.getBalance();
			}

		}
		return super.getBalance();
	}
}

	
	
	