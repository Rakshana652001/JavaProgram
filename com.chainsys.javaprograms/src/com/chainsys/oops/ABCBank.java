package com.chainsys.oops;

public class ABCBank 
{
	String userName;
	long phoneNumber;
	String accountNumber;
	int amountToDeposite;
	char getLoan;
	long loanAmount,monthlyPay;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public char getGetLoan() {
		return getLoan;
	}
	public void setGetLoan(char getLoan) {
		this.getLoan = getLoan;
	}
	public long getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}
	public long getMonthlyPay() {
		return monthlyPay;
	}
	public void setMonthlyPay(long monthlyPay) {
		this.monthlyPay = monthlyPay;
	}
	@Override
	public String toString() {
		return "ABCBank [userName=" + userName + ", phoneNumber=" + phoneNumber + ", accountNumber=" + accountNumber
				+ ", amountToDeposite=" + amountToDeposite + ", getLoan=" + getLoan + ", loanAmount=" + loanAmount
				+ ", monthlyPay=" + monthlyPay + "]";
	}
	
}