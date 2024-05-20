package com.chainsys.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLSyntaxErrorException;
import java.text.SimpleDateFormat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.chainsys.model.LeaveManagementSystemClass;
import com.chainsys.util.JdbcConnection;

public class LeaveManagementSystemImplementation implements LeaveManagementSystemInterface //overriding
{
	LeaveManagementSystemClass objectForPojo = new LeaveManagementSystemClass(); //for get set
	Scanner scan = new Scanner(System.in);
	static int numberOfDays, numberofDaysEmergency, months, number, stringToInt, idchecking,deleteEntryCheck,
	dayss=5, enterDepartment, pdNumber, number1ToString, idChange;
	static String id, idCheck, passWord, passWordC, rePassword, leaveDate, idChecking,deleteEntry,
	format,	leaveReason, employeeName, lastName,devoloper, admin, security, employeeIDCheck,
	accounts, marketing, gmail, concat, phoneNumber, emergencyContact, salary;
	static Date dateOfLeave; static long  perDaySalary;	static long stringToint1, stringToint2;
	static LeaveManagementSystemImplementation objectForImplementation = new LeaveManagementSystemImplementation();

	ArrayList<Integer> existingList = new ArrayList<Integer>(); //employeeID
	
	ArrayList<String> existingPassword = new ArrayList<String>(); //Password
	
	ArrayList<Integer> exsistingListForID = new ArrayList<Integer>();


	
	public void directPassword() throws SQLException, ClassNotFoundException
	{
		Connection getConnection = JdbcConnection.getConnection();
		System.out.println("Enter PassWord: ");
		String passWordCheck = scan.next();
		Pattern ps = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{5,}$");
		Matcher m1 = ps.matcher(passWordCheck);
		if(m1.find())
		{
			String selectPassword = "select passWord from leaveManagement where employeeID = ?";	
			PreparedStatement prepare = getConnection.prepareStatement(selectPassword);
			prepare.setString(1, employeeIDCheck);  // for ?
			ResultSet resultSet = prepare.executeQuery();
			while(resultSet.next())
			{
				String passWord = resultSet.getString(1); 
				existingPassword.add(passWord);
			}
			if(existingPassword.contains(passWordCheck))
			{
				System.out.println("Login successfull.");
				try
				{
					String insertStatement = "insert into leaveManage(employeeID, dateOfLeave, reasonOfLeave, numberOfDays)values(?,?,?,?)";
					PreparedStatement prepareStatement1 = getConnection.prepareStatement(insertStatement);
					objectForPojo.setEmployeeID(idChange); //stored id during direct login
					objectForPojo.setDateOfLeave(objectForImplementation.dateOfLeave());
					objectForPojo.setReasonOfLeave(objectForImplementation.reasonOfLeave());
					objectForPojo.setNumberOfDays(objectForImplementation.numberOfDays());
					prepareStatement1.setInt(1, objectForPojo.getEmployeeID());
					prepareStatement1.setString(2, objectForPojo.getDateOfLeave());
					prepareStatement1.setString(3, objectForPojo.getReasonOfLeave());
					prepareStatement1.setInt(4, objectForPojo.getNumberOfDays());

					@SuppressWarnings("unused")
					int rows = prepareStatement1.executeUpdate();
					System.out.println("\nApplied Successfully.");
					objectForImplementation.getterSetter();
				}
				catch(SQLIntegrityConstraintViolationException e) //foreign key exception
				{
					System.out.println("\nYou have already applied a leave in this day");
					System.out.println("\nEnter Correct Password");
					objectForImplementation.directPassword();
				}	
			}
				else
				{
					System.out.println("\nEnter correct Password.");
					objectForImplementation.directPassword();
				}
			}
			else
			{
				System.out.println("\nEnter Correct Password");
				objectForImplementation.directPassword();
			}
		}
	

	public  ArrayList<Integer> idCheck() throws ClassNotFoundException, SQLException //check id from array list
	{
		Connection getConnection1 = JdbcConnection.getConnection();
		System.out.println("Enter your EmployeeId: ");
		employeeIDCheck = scan.next();
		Pattern p = Pattern.compile("^\\d{4}$");
		Matcher m = p.matcher(employeeIDCheck);
		if(m.find())
		{
			idChange = Integer.parseInt(employeeIDCheck);
			String selectID = "select employeeID from leaveManagement";
			PreparedStatement prepareStatement1 = getConnection1.prepareStatement(selectID);
			ResultSet resultSet1 = prepareStatement1.executeQuery();
			while(resultSet1.next())
			{
				int id1 = resultSet1.getInt(1);					
				exsistingListForID.add(id1); //store in array
			}
		}
		else
		{
			System.out.println("\nIncorrect Id");
			System.out.println("Employee ID should contain 4integers.\nEg: 3556, 3557, 3558..");	
			objectForImplementation.implementation();
		}
		return existingList;
	}
	
	public boolean getterSetter() throws ClassNotFoundException, SQLException 
	{
		System.out.println("\nEmployeeName: "+concat);
		System.out.println("EmployeeID: "+(objectForPojo.getEmployeeID()));
		System.out.println("Contact Number: "+(objectForPojo.getContactNumber()));
		System.out.println("Emergency Contact: "+(objectForPojo.getEmergencyContact()));
		System.out.println("Department: "+(objectForPojo.getDepartment()));
		System.out.println("Applied on: "+(objectForPojo.getDateOfLeave()));
		System.out.println("Leave Reason: "+(objectForPojo.getReasonOfLeave()));
		System.out.println("Number of days leave: "+(objectForPojo.getNumberOfDays()));	
		objectForImplementation.payOff();
		objectForImplementation.implementation();
		return false;			
	}
	
	

	public void implementation() throws SQLException, ClassNotFoundException 
	{
			Connection getConnection1 = JdbcConnection.getConnection();
			System.out.println("\n1.Register\n2.Login and Apply\n3.Update\n4.Delete\n5.Retrive");
			System.out.print("\nEnter:");
			String enter = scan.next();
			Pattern p = Pattern.compile("^[1-5]$");
			Matcher m = p.matcher(enter);
			if(m.find())
			{
				int enterTo = Integer.parseInt(enter);
				switch(enterTo)
				{
					case 1:
						objectForImplementation.signUp();
						objectForPojo.setEmployeeName(concat);
						objectForPojo.setEmployeeID(stringToInt);
						objectForPojo.setPassWord(rePassword);
						objectForPojo.setContactNumber(stringToint1);
						objectForPojo.setEmergencyContact(stringToint2);
						objectForPojo.setDepartment(objectForImplementation.department());
						String selectEmployeeID = "select employeeID from leaveManagement";
						PreparedStatement prepareStatement = getConnection1.prepareStatement(selectEmployeeID);
						
						ResultSet resultSet = prepareStatement.executeQuery(); //registration
						while(resultSet.next())
						{
							int id = resultSet.getInt(1);
							existingList.add(id);
						}
						if(existingList.contains(objectForPojo.getEmployeeID()))
						{
							System.out.println("User already Registered.");
							objectForImplementation.implementation();
						}
						else
						{
								String insertStatement = "insert into leaveManagement(employeeID,employeeName,passWord, contactNumber, emergencyContact, department)values(?,?,?,?,?,?)";
								PreparedStatement prepareStatement1 = getConnection1.prepareStatement(insertStatement);
								
								prepareStatement1.setInt(1, objectForPojo.getEmployeeID());
								prepareStatement1.setString(2, objectForPojo.getEmployeeName());
								prepareStatement1.setString(3, objectForPojo.getPassWord());
								prepareStatement1.setLong(4, objectForPojo.getContactNumber());
								prepareStatement1.setLong(5, objectForPojo.getEmergencyContact());
								prepareStatement1.setString(6, objectForPojo.getDepartment());
								
								@SuppressWarnings("unused")
								int rows = prepareStatement1.executeUpdate();
								System.out.println("\nRegistration Successfull..");
								objectForImplementation.getterSetter();
						}
						break;
					case 2:
						System.out.println("\nLogin");
						System.out.println("``````");
						if(existingList.containsAll(objectForImplementation.idCheck())) //if contain
								{
									objectForImplementation.directPassword(); //execute
								}
								else
								{
									System.out.println("\nEnter Registered EmployeeID.");
									objectForImplementation.implementation();
								}						
						break;//login
					case 3:
						try
						{
							System.out.println("\nEnter what you want to update: ");
							System.out.println("1.EmployeeName\n2.ContactNumber\n3.Emergency Contact Number\n4.Reset Password");
							int number = scan.nextInt();
							switch(number)
							{
								case 1:   //employeeName update completed
									try
									{
										if(exsistingListForID.containsAll(objectForImplementation.idCheck()))
										{
											System.out.println("Enter Changing name: ");
											String name = scan.next();
											String update = "update leaveManagement set employeeName = ? where employeeID =?";
											PreparedStatement prepareStatement1 = getConnection1.prepareStatement(update);
											prepareStatement1.setString(1, name);
											prepareStatement1.setInt(2, idChange);
											prepareStatement1.executeUpdate();
											System.out.println("\nUpdated Successfully.");
										}
										else
										{
											System.out.println("Enter Registered EmployeeID");
											objectForImplementation.implementation();
										}
									}
									catch(SQLIntegrityConstraintViolationException e)
									{
										System.out.println(e);
										objectForImplementation.implementation();
									}	
									break;
								case 2:  //contact update completed
										if(exsistingListForID.containsAll(objectForImplementation.idCheck()))
										{
											System.out.println("Enter Changing contact number: ");
											long getnumber = scan.nextLong();
											String update = "update leaveManagement set contactNumber = ? where employeeID =?";
											PreparedStatement prepareStatement2 = getConnection1.prepareStatement(update);
											prepareStatement2.setLong(1, getnumber);
											prepareStatement2.setInt(2, idChange);
											prepareStatement2.executeUpdate();
											System.out.println("\nUpdated Successfully.");
										}
									break;
								case 3:    //emergency contact
										if(exsistingListForID.containsAll(objectForImplementation.idCheck()))
										{
											System.out.println("Enter Changing emergency contact number: ");
											long getnumber = scan.nextLong();
											String update = "update leaveManagement set emergencyContact = ? where employeeID =?";
											PreparedStatement prepareStatement3 = getConnection1.prepareStatement(update);
											prepareStatement3.setLong(1, getnumber);
											prepareStatement3.setInt(2, idChange);
											prepareStatement3.executeUpdate();
											System.out.println("\nUpdated Successfully.");
									}
									break;
								case 4:  //reset password
									if(exsistingListForID.containsAll(objectForImplementation.idCheck()))
									{
										System.out.println("Enter Resetting password: ");
										String password = scan.next();
										String update = "update leaveManagement set passWord = ? where employeeID =?";
										PreparedStatement prepareStatement3 = getConnection1.prepareStatement(update);
										prepareStatement3.setString(1, password);
										prepareStatement3.setInt(2, idChange);
										prepareStatement3.executeUpdate();
										System.out.println("\nPassword resetted Successfully.");
									}									
									break;
								default:
									objectForImplementation.implementation();	
							}
						}
						catch(SQLSyntaxErrorException e)
						{
							System.out.println(e);
							objectForImplementation.implementation();
						}
						break;
						 //update completed
					case 4:
						System.out.println("Enter your EmployeeId: ");
						deleteEntry = scan.next();
						Pattern p1 = Pattern.compile("^\\d{4}$");
						Matcher m1 = p1.matcher(deleteEntry);
						if(m1.find())
						{
							deleteEntryCheck = Integer.parseInt(deleteEntry);
							String selectID = "select employeeID from leaveManagement";
							PreparedStatement prepareStatement1 = getConnection1.prepareStatement(selectID);
							ResultSet resultSet1 = prepareStatement1.executeQuery();
							while(resultSet1.next())
							{
								int id = resultSet1.getInt(1);					
								existingList.add(id); //store in array
							}
							if(existingList.contains(deleteEntryCheck))
							{
								String delete = "delete from leaveManage where employeeID=?";
								PreparedStatement prepareStatement2 = getConnection1.prepareStatement(delete);
								prepareStatement2.setInt(1, deleteEntryCheck);
								prepareStatement2.executeUpdate();
								System.out.println("\nDeleted successfully.");
							}
							else
							{
								System.out.println("Enter Registered ID");
								objectForImplementation.implementation();
							}
						}
						else
						{
							System.out.println("\nIncorrect Id");
							System.out.println("Employee ID should contain 4integers.\nEg: 3556, 3557, 3558..");
							objectForImplementation.implementation();	
						}
						break;
						//delete Completed
					case 5:
							String retrive = "select * from manager where managerID = 1001";
							PreparedStatement preparedStatement = getConnection1.prepareStatement(retrive);
							//preparedStatement.setString(1, employeeIDCheck);
							ResultSet resultSet2 = preparedStatement.executeQuery(retrive);
							while(resultSet2.next())
							{
								System.out.println("\n\nRetrived Data\nEmployeeID: "+resultSet2.getString(1)+"\nEmployeeName: "+resultSet2.getString(2)+"\nContact Number: "+resultSet2.getString(3));
							}
						//retrive not completed
						break;
					default:
						objectForImplementation.implementation();					
				}
			}
			else
			{
				objectForImplementation.implementation();
			}
		getConnection1.close();
	}
	
	@Override
	public void signUp() 
	{
		System.out.println("SignUp");
		System.out.println("```````");
		objectForImplementation.employeeName();
		objectForImplementation.employeeID();
		objectForImplementation.contactNumber();
		objectForImplementation.emergencyNumber();
		objectForImplementation.emailId();
		objectForImplementation.createPassword();
		
	}
	@Override
	public String employeeName() 
	{
		System.out.println("Personal Details:");
		System.out.println("`````````````````");
		System.out.print("Enter your First Name: ");
		employeeName = scan.next();
		Pattern p = Pattern.compile("^[A-Z][a-z]*$");
		Matcher m = p.matcher(employeeName);
		if(m.find())
		{
			System.out.print("Enter your Last Name: ");
			lastName = scan.next();
			Pattern p1 = Pattern.compile("^[A-Za-z]*$");
			Matcher m11 = p1.matcher(lastName);
			if(m11.find())
			{
				concat = employeeName.concat(lastName);
			}
			else
			{
				System.out.println("\nLast Name should contain only alphabets like Initials or names.");
				System.out.println("Eg: S, T, N");
				objectForImplementation.employeeName();
			}
		}
		else
		{
			System.out.println("\nName should contain only alphabets.");
			System.out.println("Eg: Sam,Steve,Tony,Natasha.");
			objectForImplementation.employeeName();
		}
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
		objectForImplementation.notSameNumber();
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
				System.out.println("PassWord Created...");
			}
			else
			{
				System.out.println("\nYour PassWord and RePassWord is not matching.");
				objectForImplementation.createPassword();
			}
		}
		else
		{
			System.out.println("\nPassword should contain minimum 4 characters in length: \n1.Contain Uppercase letter\n2.Lowercase letter\n3.One Special charecter\n4.Numbers");
			System.out.println("Eg: Kim@002, kIm#765, kiM%2313");
			objectForImplementation.createPassword();
		}
		return rePassword;
	}
	
	@Override
	public String department() 
	{
		System.out.println("\nDepartments");
		System.out.println("```````````");
		System.out.print("1.Devoloper\n2.Accounts\n3.Admin\n4.Security\n5.Marketing");
		System.out.print("\nEnter your Department in number(1,2...): ");
		String enterDepartment =scan.next();
		Pattern p1 = Pattern.compile("^[1-6]$");
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
			System.out.println("\nSuccessfully SignedUP!!!");
			return accounts;
		}
		else
		{
			objectForImplementation.department();
		}
		return accounts;
	}
	
	@Override
	public int login() throws ClassNotFoundException, SQLException 
	{
		try
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
				objectForImplementation.password();
			}
			
			stringToInt = Integer.parseInt(id);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e);
			objectForImplementation.login();
		}
		return stringToInt;
	}
	
	@Override
	public void password() throws ClassNotFoundException, SQLException
	{
		System.out.print("PassWord: ");
		passWord = scan.next();
		String rePassword1 = rePassword;
		Pattern ps = Pattern.compile(rePassword1);
		Matcher m1 = ps.matcher(passWord);
		if(m1.find())
		{
			System.out.println("\nSuccessfully loggedin...");
			objectForImplementation.reasonOfLeave();
		}
		else
		{
			System.out.println("\nWorng Password!!! Enter correct password.");				
			objectForImplementation.password();
		}
	}
	
	@Override
	public String reasonOfLeave() throws ClassNotFoundException, SQLException 
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
//				System.out.println("Enter 3 to Update as 6Months");
//				objectForImplementation.implementation();
				return leaveReason;
		}
		return leaveReason;
	}
	
	@Override
	public int numberOfDays() throws ClassNotFoundException, SQLException
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
						
						objectForImplementation.totalSalary();
					}
				}
				else
				{
					System.out.println("Enter (1-5) and only integer!!!");
					objectForImplementation.numberOfDays();
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
					objectForImplementation.reasonOfLeave();
				}
				return numberOfDays;
			}
			else if(number == 3)
			{
				return 0;
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
					objectForImplementation.endDateE();
					System.out.println("no payOff");
					break;
				case 2:
					objectForImplementation.endDateE();
					System.out.println("no payOff");
					break;
				case 3:
					objectForImplementation.endDateE();
					System.out.println("You exceded more than 2 days in this month for getting Permission");
					System.out.println("Payoff for "+number1ToString+" days: "+(perDaySalary*number1ToString));
					break;
				case 4:
					objectForImplementation.endDateE();
					System.out.println("You exceded more than 2 days in this month for getting Permission");
					System.out.println("Payoff for "+number1ToString+" days: "+(perDaySalary*number1ToString));
					break;
				case 5:
					objectForImplementation.endDateE();
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
				objectForImplementation.endDate();
				System.out.println("No Payoff");
			}
			else
			{
				objectForImplementation.endDate();
				System.out.println("Exceded more than 10 days\nGet Permission from your manager directly.");
			}
			return numberOfDays;
		}
		else if(leaveReason == "Maternity Period")
		{
			months = 6;
			System.out.println("Allowed only for "+months+"months.");
			objectForImplementation.endDateMatertiny();
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
	public long totalSalary() 
	{
		try
		{
			System.out.print("Enter total salary: ");
			salary = scan.next();
			//LeaveManagementSystemValidation.salaryValidation(salary);
			long salaryLong = Long.parseLong(salary);
			perDaySalary = (salaryLong/30);	
		}
		catch(NumberFormatException e)
		{
			System.out.println("Salary want to be in numbers");
			objectForImplementation.totalSalary();
		}
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