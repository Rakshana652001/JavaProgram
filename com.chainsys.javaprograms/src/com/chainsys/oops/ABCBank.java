package com.chainsys.oops;

public class ABCBank 
{
	String userName;
	long phoneNumber;
	String accountNumber;
	int amountToDeposite;
	public String getUserName() {
		return userName;
	}
	public String setUserName(String userName) {
		return this.userName = userName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAmountToDeposite() {
		return amountToDeposite;
	}
	public void setAmountToDeposite(int amountToDeposite) {
		this.amountToDeposite = amountToDeposite;
	}
	@Override
	public String toString() {
		return "ABCBank [userName=" + userName + ", phoneNumber=" + phoneNumber + ", accountNumber=" + accountNumber
				+ ", amountToDeposite=" + amountToDeposite + "]";

	}
}