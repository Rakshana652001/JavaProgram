package com.chainsys.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import com.chainsys.model.LeaveManagementSystemClass;
import com.chainsys.util.JdbcConnection;

public class LeaveManagementSystemImplementation implements LeaveManagementSystemInterface
{
	LeaveManagementSystemClass objectForPojo = new LeaveManagementSystemClass(); //for get set
	Scanner scan = new Scanner(System.in);
	static int numberOfDays, numberofDaysEmergency, months, number, stringToInt, 
	dayss=5, enterDepartment, pdNumber, number1ToString;
	static String id, idCheck, passWord, passWordC, rePassword, leaveDate, 
	format,	leaveReason, employeeName, lastName,devoloper, admin, security, 
	accounts, marketing, gmail, concat, phoneNumber, emergencyContact, salary;
	static Date dateOfLeave; static long  perDaySalary;	static long stringToint1, stringToint2;
	static LeaveManagementSystemImplementation objectForimplementation = new LeaveManagementSystemImplementation();

	
	@Override
	public boolean implementation() throws ClassNotFoundException, SQLException 
	{
		
		Connection getConnection = JdbcConnection.getConnection();
		System.out.println("Table Connected.    "+getConnection);
		
		objectForimplementation.apply();
		objectForPojo.setEmployeeName(concat);
		objectForPojo.setEmployeeID(stringToInt);
		objectForPojo.setContactNumber(stringToint1);
		objectForPojo.setEmergencyContact(stringToint2);
		objectForPojo.setDateOfLeave(objectForimplementation.dateOfLeave());
		objectForPojo.setReasonOfLeave(leaveReason);
		objectForPojo.setNumberOfDays(objectForimplementation.numberOfDays());
		objectForPojo.setDepartment(objectForimplementation.department());
		System.out.println("\nEmployeeName: "+objectForPojo.getEmployeeName());
		System.out.println("EmployeeID: "+(objectForPojo.getEmployeeID()));
		System.out.println("Contact Number: "+(objectForPojo.getContactNumber()));
		System.out.println("Emergency Contact: "+(objectForPojo.getEmergencyContact()));
		System.out.println("Department: "+(objectForPojo.getDepartment()));
		System.out.println("Applied on: "+(objectForPojo.getDateOfLeave()));
		System.out.println("Leave Reason: "+(objectForPojo.getReasonOfLeave()));
		System.out.println("Number of days leave: "+(objectForPojo.getNumberOfDays()));	
		objectForimplementation.payOff();
		return false;	
				
	}
	
	
	public void impl() throws ClassNotFoundException, SQLException
	{
		ArrayList existingList = new ArrayList();
		Connection getConnection = JdbcConnection.getConnection();
		System.out.println("Table Connected.    "+getConnection);
		String selectEmployeeName = "select employeeName from leaveManagement";
		PreparedStatement prepareStatement = getConnection.prepareStatement(selectEmployeeName);
		System.out.println("Enter(1.Register\n2.Update\n3.Delete\n4.Retrive\n5.Login): ");
		String enter = scan.next();
		Pattern p = Pattern.compile("^[1-5]*$");
		Matcher m = p.matcher(enter);
		while(m.find())
		{
			int enterto = Integer.parseInt(enter);
			switch(enterto)
			{
				case 1:
					ResultSet resultSet = prepareStatement.executeQuery(); //registration
					while(resultSet.next())
					{
						String name = resultSet.getString(1);
			            existingList.add(name);
					}
					if(existingList.contains(objectForPojo.getEmployeeName()))
					{
						 System.out.println("User already exist");
					}
					else
					{
						System.out.println("Registration Successfull..");
						String insertStatement = "insert into leaveManagement(employeeID, employeeName, contactNumber, emergencyContact, department, dateOfLeave, reasonOfLeave, numberOfDays)values(?,?,?,?,?,?,?,?)";
						PreparedStatement prepareStatement1 = getConnection.prepareStatement(insertStatement);
						
						prepareStatement1.setInt(1, objectForPojo.getEmployeeID());
						prepareStatement1.setString(2, objectForPojo.getEmployeeName());
						prepareStatement1.setLong(3, objectForPojo.getContactNumber());
						prepareStatement1.setLong(4, objectForPojo.getEmergencyContact());
						prepareStatement1.setString(5, objectForPojo.getDepartment());
						prepareStatement1.setString(6, objectForPojo.getDateOfLeave());
						prepareStatement1.setString(7, objectForPojo.getReasonOfLeave());
						prepareStatement1.setInt(8, objectForPojo.getNumberOfDays());
						
						int rows = prepareStatement1.executeUpdate();
					}
					break;
				case 2:
					java.sql.Statement updateStatement = getConnection.createStatement();
					String update = "update leaveManagement set employeeID = 1, employeeName ='Raks' where employeeID = 3333";
					updateStatement.executeUpdate(update);
					System.out.println("Updated Successfully.");
					break;
					 //update 
				case 3:
					java.sql.Statement deleteStatement = getConnection.createStatement();
					String delete = "delete from leaveManagement where sNo=2";
					deleteStatement.executeUpdate(delete);
					System.out.println("Deleted successfully.");
					break;
					//delete
				case 4:
					java.sql.Statement retriveStatement = getConnection.createStatement();
					String retrive = "select employeeID, contactNumber from leaveManagement where sNo = 1";
					ResultSet resultSet1 = retriveStatement.executeQuery(retrive);
					while(resultSet1.next())
					{
						System.out.println("\n\nRetrived Data\nEmployeeID: "+resultSet1.getString(1)+"\nContactNumber: "+resultSet1.getString(2));
					}
					//retrive 
					
			}
		}
	}
	@Override
	public void apply() 
	{
		System.out.println("Enter(1/2): ");
		String number1 = scan.next();
		LeaveManagementSystemValidation.numberValidation(number1);
		int stringTonumber = Integer.parseInt(number1);
		switch(stringTonumber)
		{
			case 1:
				objectForimplementation.signUp();
				break;
			case 2:
				objectForimplementation.login2();
				break;
			default:
				objectForimplementation.apply();
		}
		
	}
	@Override
	public void signUp() 
	{
		System.out.println("SignUp");
		System.out.println("```````");
		objectForimplementation.employeeName();
		objectForimplementation.employeeID();
		objectForimplementation.contactNumber();
		objectForimplementation.emergencyNumber();
		
	}
	@Override
	public String employeeName() 
	{
		System.out.println("Personal Details:");
		System.out.println("`````````````````");
		System.out.print("Enter your First Name: ");
		employeeName = scan.next();
		LeaveManagementSystemValidation.firstNameValidation(employeeName);
		System.out.print("Enter your Last Name: ");
		lastName = scan.next();
		LeaveManagementSystemValidation.lastNameValidation(lastName);
		concat = employeeName.concat(lastName);
		return concat;
		
	}
	@Override
	public int employeeID() 
	{
			System.out.print("Enter Your EmployeeID: ");
			id = scan.next();
			LeaveManagementSystemValidation.employeeIdValidation(id);
			stringToInt = Integer.parseInt(id);
			return stringToInt;
	}
	
	@Override
	public long contactNumber() 
	{
		System.out.print("Enter your phone number: ");
		phoneNumber = scan.next();
		LeaveManagementSystemValidation.contactNumberValidation(phoneNumber);
		stringToint1 = Long.parseLong(phoneNumber);
		return stringToint1;
	}
	@Override
	public long emergencyNumber() 
	{
		System.out.print("Emergency contact: ");
		emergencyContact = scan.next();
		LeaveManagementSystemValidation.emergencyNumberValidation(emergencyContact);
		objectForimplementation.notSameNumber();
		stringToint2 = Long.parseLong(emergencyContact);
		return stringToint2;
	}
	@Override
	public void notSameNumber() 
	{
		@SuppressWarnings("unused")
		String emergencyNumber = emergencyContact;
		String contactNumber = phoneNumber;
		LeaveManagementSystemValidation.notSameValidation(contactNumber,emergencyContact);
	}
	@Override
	public void emailId() 
	{
		System.out.print("Enter your EmailId: ");
		gmail = scan.next();
		LeaveManagementSystemValidation.emailVadidation(gmail);
	}
	@Override
	public String createPassword() 
	{
		System.out.print("Create PassWord: ");
		passWordC = scan.next();
		Pattern ps = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{5,}$");
		Matcher m1 = ps.matcher(passWordC);
		if(m1.find())
		{
			System.out.print("ReEnter password: ");
			rePassword = scan.next();
			Pattern rePass = Pattern.compile(passWordC);
			Matcher rem1 = rePass.matcher(rePassword);
			if(rem1.find())
			{
				System.out.println("Successfully SignedUP!!!");
				objectForimplementation.login();

			}
			else
			{
				System.out.println("\nYour PassWord and RePassWord is not matching.");
				objectForimplementation.createPassword();
			}
		}
		else
		{
			System.out.println("\nPassword should contain\n1.Minimum 5 characters in length.\n2.Contain Uppercase letter\n3.Lowercase letter\n3.One Special charecter\n4.Numbers");
			System.out.println("Eg: Kim@002, kIm#765, kiM%2313");
			objectForimplementation.createPassword();
		}
		
		return rePassword;
		
	}
	@Override
	public int login() 
	{
		System.out.println("\nLogin");
		System.out.println("``````");
		System.out.print("Enter your employee ID: ");
		idCheck = scan.next();
		String empID = Integer.toString(stringToInt);
		Pattern p = Pattern.compile(empID);
		Matcher m = p.matcher(idCheck);
		if(m.find())
		{
			objectForimplementation.password();
		}
		else
		{
			System.out.println("\nLogin Failed!!! Enter correct employeeID.");
			objectForimplementation.login();
			
		}
		stringToInt = Integer.parseInt(id);
		return stringToInt;
	}
	
	@Override
	public String login2() 
	{
		String employeeID1 = id;
		String password = passWordC;
		System.out.println("\nLogin");
		System.out.println("``````");
		System.out.print("Enter your employee ID: ");
		String idCheck1 = scan.next();
		return employeeID1;
	}
	
	
	@Override
	public void password()
	{
		System.out.print("PassWord: ");
		passWord = scan.next();
		String rePassword1 = rePassword;
		Pattern ps = Pattern.compile(rePassword1);
		Matcher m1 = ps.matcher(passWord);
		if(m1.find())
		{
			System.out.println("Correct Password.\nLogin Successful!!!\n");
			objectForimplementation.reasonOfLeave();
		}
		
		else
			
		{
			System.out.println("\nWorng Password!!! Enter correct password.");				
			objectForimplementation.password();
		}
		
	}
	@Override
	public String reasonOfLeave() 
	{
		System.out.println("\nEnter your Reason");
		System.out.println("``````````````````");
		System.out.println("1.Permission\n2.Sick Leave\n3.Maternity Leave");
		System.out.print("\nEnter(1/2/3): ");
		String num = scan.next();
		LeaveManagementSystemValidation.reasonValidation(num);
		number = Integer.parseInt(num);
		switch (number)
		{
			case 1:
				System.out.println("\nPermission");
				leaveReason = "Permission";
				System.out.println("Total 5 days, 2days withoutPayoff and 3days withPayoff");
				return leaveReason;
			case 2:
				
				System.out.println("\nSick Leave");
				leaveReason = "SickLeave";
				System.out.println("Allowed only for 10days.");
				return leaveReason;
			case 3:
				System.out.println("\nMaternity Period");
				leaveReason = "Maternity Period";
				System.out.println("Allowed only for 6months with work from home");
				return leaveReason;
		}
		return leaveReason;
	}
	@Override
	public int numberOfDays()
	{
		if(number == 1)
			{
				System.out.print("\nEnter day(1/2/3/4/5): ");
				String number1 = scan.next();
				number1ToString = Integer.parseInt(number1);
				Pattern p1 = Pattern.compile("^[1-5]$");
				Matcher m1 = p1.matcher(number1);
				if(m1.find())
				{
					Pattern p11 = Pattern.compile("^[3-5]$");
					Matcher m11 = p11.matcher(number1);
					if(m11.find())
					{
						
						objectForimplementation.totalSalary();
					}
				}
				else
				{
					System.out.println("Enter (1-5) and only integer!!!");
					objectForimplementation.numberOfDays();
				}
				return number1ToString;
			}
			else if(number == 2)
			{
				System.out.print("\nEnter number of days: ");
				String numberOfDay = scan.next();
				Pattern p1 =Pattern.compile("\\d");
				Matcher m1 = p1.matcher(numberOfDay);
				if(m1.find())
				{
					numberOfDays = Integer.parseInt(numberOfDay);
					return numberOfDays;
				}
				else
				{
					objectForimplementation.reasonOfLeave();
				}
				return numberOfDays;
			}
			else if(number == 3)
			{
				return 0;
			}
			else
			{
				System.out.println("Invalid Reason!!!");
			}
		
		return 0;
	}
	@Override
	public long payOff() 
	{
		if(leaveReason == "Permission")
		{
			switch(number1ToString)
			{
				case 1:
					objectForimplementation.endDateE();
					System.out.println("no payOff");
					break;
				case 2:
					objectForimplementation.endDateE();
					System.out.println("no payOff");
					break;
				case 3:
					objectForimplementation.endDateE();
					System.out.println("You exceded more than 2 days in this month for getting Permission");
					System.out.println("Payoff for "+number1ToString+" days: "+(perDaySalary*number1ToString));
					break;
				case 4:
					objectForimplementation.endDateE();
					System.out.println("You exceded more than 2 days in this month for getting Permission");
					System.out.println("Payoff for "+number1ToString+" days: "+(perDaySalary*number1ToString));
					break;
				case 5:
					objectForimplementation.endDateE();
					System.out.println("You exceded more than 2 days in this month for getting Permission");
					System.out.println("Payoff for "+number1ToString+" days: "+(perDaySalary*number1ToString));
					break;
			}
			
			dayss = dayss-number1ToString;
			System.out.println("Remaining days for getting Permission in this month: "+dayss);
			return dayss;
		}
		
		
		if(leaveReason == "SickLeave")
		{
			
			String numbertoString1 = Integer.toString(numberOfDays);
			Pattern p1 = Pattern.compile("\\b([1-9]|10)\\b");
			Matcher m1 = p1.matcher(numbertoString1);
			if(m1.find())
			{
				objectForimplementation.endDate();
				System.out.println("No Payoff");
			}
			else
			{
				objectForimplementation.endDate();
				System.out.println("Exceded more than 10 days\nGet Permission from your manager directly.");
			}
			return numberOfDays;
		}
		
		
		else if(leaveReason == "Maternity Period")
		{
			months = 6;
			System.out.println("Allowed only for "+months+"months.");
			objectForimplementation.endDateMatertiny();
			System.out.println("No Payoff but Work From Home");
			return months;
		}
		
		else
		{
			System.out.println("No leave granted.");
		}
		
	return months;
	}
	@Override
	public String department() 
	{
		System.out.println("\nDepartments");
		System.out.println("```````````");
		System.out.print("1.Devoloper\n2.Accounts\n3.Admin\n4.Security\n5.Marketing");
		System.out.println("\nEnter your Department in number(1,2...): ");
		String enterDepartment =scan.next();
		Pattern p1 = Pattern.compile("^[1-5]$");
		Matcher m1 = p1.matcher(enterDepartment);
		if(m1.find())
		{
			int department = Integer.parseInt(enterDepartment);
			switch(department)
			{
				case 1:
					devoloper = "Devoloper";
					return devoloper;
				case 2:
					accounts = "Accounts";
					return accounts;
				case 3:
					admin = "Admin";
					return admin;
				case 4:
					security = "Security";
					return security;
				case 5:
					marketing = "Marketing";
					return marketing;
			}
			return accounts;
		}
		else
		{
			objectForimplementation.department();
		}
		return accounts;
	}
	@Override
	public long totalSalary() 
	{
		System.out.println("Enter total salary: ");
		salary = scan.next();
		LeaveManagementSystemValidation.salaryValidation(salary);
		long salaryLong = Long.parseLong(salary);
		perDaySalary = (salaryLong/30);
		return perDaySalary;
	}
	@Override
	public String dateOfLeave() 
	{
		dateOfLeave = new Date();  
		SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = formatDate.format(dateOfLeave);
		return dateString;
	}
	@Override
	public void endDate() 
	{
		LocalDate today = LocalDate.now();
		LocalDate tomorrow = today.plusDays(numberOfDays);
		System.out.println("Leave End Date: "+tomorrow);
		
	}
	@Override
	public void endDateE() 
	{
		LocalDate today = LocalDate.now();
		LocalDate tomorrow = today.plusDays(number1ToString);
		System.out.println("Leave End Date: "+tomorrow);
		
	}
	@Override
	public void endDateMatertiny() 
	{
		LocalDate now =  LocalDate.now();  
		LocalDate sameDayNextMonth = now.plusMonths(months);
		System.out.println("Leave End Date: "+sameDayNextMonth);
		
	}
}
