package com.techelevator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SavingsAccount extends BankAccount {


	public SavingsAccount() {
		super();

	}

	public SavingsAccount(String accountHolder, String accountNumber) {
		super (accountHolder, accountNumber);
		int balance = 0;
	
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

	
	
	