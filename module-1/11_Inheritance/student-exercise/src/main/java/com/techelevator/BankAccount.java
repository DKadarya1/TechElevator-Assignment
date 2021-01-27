package com.techelevator;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {

	 private String accountNumber;
	 private BigDecimal balance = new BigDecimal("0");
	 private String accountHolderName;
	 int amountToDeposit;
	 int amountToWithdraw;
	

	
	public String getAccountHolderName() {
		return accountHolderName;
	}


	public BankAccount() {
		balance = new BigDecimal ("0.00");
		accountNumber = "unknown";
		accountHolderName = "unknown";
		
	}
	
	public BankAccount(String accountNumber, BigDecimal balance, String accountHolderName) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountHolderName = accountHolderName;
	}
		
// getters & setters		
	
	public String getAccountNumber() {
		return accountNumber;
	}

	
	public  List<BankAccount> getAccounts() {
		return null;
	}
	
	public BigDecimal getBalance() {
		
		return balance;
	}

	
	private void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
	
// Methods
	
	public BigDecimal deposit(BigDecimal amountToDeposit) {
		balance = balance.add(amountToDeposit);
		this.setBalance(balance);
		return balance;
		
	}

	public BigDecimal withdraw(BigDecimal amountToWithdraw) {
		
		balance = balance.subtract(amountToWithdraw);
		this.setBalance(balance);
		return balance;
	}

public String toString() {
	return accountNumber;
}
}
