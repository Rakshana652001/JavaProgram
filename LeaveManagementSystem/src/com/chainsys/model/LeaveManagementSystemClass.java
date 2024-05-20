package com.chainsys.model;

public class LeaveManagementSystemClass 
{
	int employeeID;
	String passWord;
	String dateOfLeave;
	String reasonOfLeave;
	int numberOfDays;
	String employeeName;
	long contactNumber, emergencyContact;
	String department;
	int managerID;
	String managerPassword;
	
	public LeaveManagementSystemClass()
	{
		
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
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

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public long getEmergencyContact() {
		return emergencyContact;
	}

	public void setEmergencyContact(long emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getManagerID() {
		return managerID;
	}

	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}

	public String getManagerPassword() {
		return managerPassword;
	}

	public void setManagerPassword(String managerPassword) {
		this.managerPassword = managerPassword;
	}

	@Override
	public String toString() {
		return "LeaveManagementSystemClass [employeeID=" + employeeID + ", passWord=" + passWord + ", dateOfLeave="
				+ dateOfLeave + ", reasonOfLeave=" + reasonOfLeave + ", numberOfDays=" + numberOfDays
				+ ", employeeName=" + employeeName + ", contactNumber=" + contactNumber + ", emergencyContact="
				+ emergencyContact + ", department=" + department + ", managerID=" + managerID + ", managerPassword="
				+ managerPassword + "]";
	}			
	
	
	
}
