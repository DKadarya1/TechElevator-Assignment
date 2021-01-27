package com.techelevator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SavingsAccount extends BankAccount {


	public SavingsAccount() {
		super();

	}

	public SavingsAccount(String accountNumber, BigDecimal balance) {

		super(accountNumber, balance, accountNumber);

	}

	
	public BigDecimal withdraw(BigDecimal amountToWithdraw) {

		if (super.getBalance().doubleValue() > 150) {

			super.withdraw(amountToWithdraw);

		} else {
			if (((super.getBalance().doubleValue() < 150) && (super.getBalance().doubleValue() >= 0))&&
					amountToWithdraw.doubleValue() <= super.getBalance().doubleValue()) {
				super.withdraw(amountToWithdraw.add(new BigDecimal("2.00")));
			} else {

				return super.getBalance();
			}

		}
		return super.getBalance();
	}
}

	
	
	