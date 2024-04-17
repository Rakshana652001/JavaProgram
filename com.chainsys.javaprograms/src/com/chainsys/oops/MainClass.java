package com.chainsys.oops;

public class MainClass
{

	public static void main(String[] args)
	{
		TestABCBank testclass = new TestABCBank();
		SBIBank bankDetails = new SBIBank();
		testclass.loanIntrestCalculation();
		bankDetails.loanIntrestCalculation();
		

		
	}

}
