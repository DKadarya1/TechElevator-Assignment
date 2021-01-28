package com.techelevator;

public class CreditCardAccount implements Accountable {
	
	private String accountHolder;
	private String accountNumber;
	private int debt;
	private int balance;
	public CreditCardAccount(String accountHolder, String accountNumber) {
		
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.debt=0;
	}
	
	public int pay(int amountToPay) {
		this.debt = debt - amountToPay;
		return debt;
	}
	public int charge(int amountToCharge) {
		this.debt = debt + amountToCharge;
		return debt;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getDebt() {
		return debt;
	}

	public void setDebt(int debt) {
		this.debt = debt;
	}
    public int getBalance() {
      return balance;
}
    
}
