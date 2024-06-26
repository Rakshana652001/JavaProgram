package com.chainsys.project.copy;

import java.sql.SQLException;

public interface LeaveManagementSystemInterface 
{
	//all methods call
	public boolean implementation() throws ClassNotFoundException, SQLException;
	
	public void delete() throws ClassNotFoundException, SQLException;
	public void apply();
	public void signUp();
	public String employeeName();
	public int employeeID();
	public long contactNumber();
	public long emergencyNumber();
	public void notSameNumber();
	public void emailId();
	public String createPassword();
	public int login();
	public void password();
	public String reasonOfLeave();
	public int numberOfDays();
	public long payOff();
	public String department();
	public long totalSalary();
	public String dateOfLeave();
	public void endDate();
	public void endDateE();
	public void endDateMatertiny();

}
