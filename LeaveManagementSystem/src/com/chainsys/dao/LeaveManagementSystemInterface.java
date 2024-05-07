package com.chainsys.dao;

import java.sql.SQLException;

public interface LeaveManagementSystemInterface 
{
	//all methods call
	public boolean getterSetter() throws ClassNotFoundException, SQLException;
	public void implementation() throws ClassNotFoundException, SQLException;
	public void signUp();
	public String employeeName();
	public int employeeID();
	public long contactNumber();
	public long emergencyNumber();
	public void notSameNumber();
	public void emailId();
	public String createPassword();
	public int login()throws ClassNotFoundException, SQLException;
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
