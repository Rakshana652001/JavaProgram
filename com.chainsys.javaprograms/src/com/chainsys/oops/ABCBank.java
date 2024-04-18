package com.chainsys.oops;

public class ABCBank 
{
	String userName;
	long phoneNumber;
	String accountNumber;
	int amountToDeposite;
	int getLoan,time;
	long loanAmount,monthlyPay,total,intrest;
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
	public int getGetLoan() {
		return getLoan;
	}
	public int setGetLoan(int getLoan) {
		return this.getLoan = getLoan;
	}
	public int getTime() {
		return time;
	}
	public int setTime(int time) {
		return this.time = time;
	}
	public long getLoanAmount() {
		return loanAmount;
	}
	public long setLoanAmount(long loanAmount) {
		return this.loanAmount = loanAmount;
	}
	public long getMonthlyPay() {
		return monthlyPay;
	}
	public long setMonthlyPay(long monthlyPay) {
		return this.monthlyPay = monthlyPay;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public long getIntrest() {
		return intrest;
	}
	public long setIntrest(long intrest) {
		return this.intrest = intrest;
	}
	@Override
	public String toString() {
		return "ABCBank [userName=" + userName + ", phoneNumber=" + phoneNumber + ", accountNumber=" + accountNumber
				+ ", amountToDeposite=" + amountToDeposite + ", getLoan=" + getLoan + ", time=" + time + ", loanAmount="
				+ loanAmount + ", monthlyPay=" + monthlyPay + ", total=" + total + ", intrest=" + intrest + "]";
	}
	
	
	
	
}