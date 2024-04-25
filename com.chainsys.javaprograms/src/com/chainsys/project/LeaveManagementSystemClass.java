package com.chainsys.project;

public class LeaveManagementSystemClass {
	int employeeID;
	String dateOfLeave;
	String reasonOfLeave;
	int numberOfDays;
	String employeeName;
	long contactNumber, emergencyContact;
	String department;
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
	@Override
	public String toString() {
		return "LeaveManagementSystemClass [employeeID=" + employeeID + ", dateOfLeave=" + dateOfLeave
				+ ", reasonOfLeave=" + reasonOfLeave + ", numberOfDays=" + numberOfDays + ", employeeName="
				+ employeeName + ", contactNumber=" + contactNumber + ", emergencyContact=" + emergencyContact
				+ ", department=" + department + "]";
	}
	
	
	
}
