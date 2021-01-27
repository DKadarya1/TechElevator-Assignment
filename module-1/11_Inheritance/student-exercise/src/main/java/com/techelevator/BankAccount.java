package com.techelevator;

import java.util.List;

public class BankAccount {

	 private String accountNumber;
	 private int balance = 0;
	 private String accountHolderName;
	 int amountToDeposit;
	 int amountToWithdraw;
	

	
	


	public BankAccount() {
		balance = 0;
		accountNumber = "unknown";
		accountHolderName = "unknown";
		
	}
	
	public BankAccount(String accountHolder, String accountNumber) {
		this.accountHolderName = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = 0;
	}
	
	public BankAccount(String accountHolder, String accountNumber, int balance ) {
		this.accountHolderName = accountHolder;
		this.balance = balance;
		this.accountNumber = accountNumber;
		
		
	}
		
// getters & setters		
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	
	public  List<BankAccount> getAccounts() {
		return null;
	}
	
	public int getBalance() {
		
		return balance;
	}

	
	private void setBalance(int balance) {
		this.balance = balance;
	}
	
	
// Methods
	
	public int deposit(int amountToDeposit) {
		balance = balance + amountToDeposit;
		this.setBalance(balance);
		return balance;
		
	}

	public int withdraw(int amountToWithdraw) {
		
		balance = balance - amountToWithdraw;
		this.setBalance(balance);
		return balance;
	}

public String toString() {
	return accountNumber;
}
}
