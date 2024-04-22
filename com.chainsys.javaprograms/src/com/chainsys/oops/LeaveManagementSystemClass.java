package com.chainsys.oops;


public class LeaveManagementSystemClass {
	int employeeID;
	String dateOfLeave;
	String reasonOfLeave;
	int numberOfDays;
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getDateOfLeave() {
		return dateOfLeave;
	}
	public void setDateOfLeave(String dateOfLeave) {
		this.dateOfLeave = dateOfLeave;
	}
	public String getReasonOfLeave() {
		return reasonOfLeave;
	}
	public void setReasonOfLeave(String reasonOfLeave) {
		this.reasonOfLeave = reasonOfLeave;
	}
	public int getNumberOfDays() {
		return numberOfDays;
	}
	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	@Override
	public String toString() {
		return "LeaveManagementSystemClass [employeeID=" + employeeID + ", dateOfLeave=" + dateOfLeave
				+ ", reasonOfLeave=" + reasonOfLeave + ", numberOfDays=" + numberOfDays + "]";
	}
	
}
