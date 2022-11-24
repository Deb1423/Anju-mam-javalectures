/*
Program: Java program to create a bank account and display the peopole with balance less than 1000.
@Author:- Debjit Talukder.
@Date:- 23Sep, 2022.
*/

import java.util.*;  
class Account
{
	
	
	private int accID;
	private String accName;
	private double balance;
	
	
    
	
	
	Account(int accID,String accName,double balance)
	{
		this.accID=accID;
		this.accName=accName;
		this.balance=balance;
		
	}
	
	
	
	
	 void setAccID(int accID)
	{
		this.accID=accID;
	}
	 int getAccID()
	{
		return this.accID;
	}

	
	 
	
	 void setAccName(String accName)
	{
		this.accName=accName;
	}
	 String getAccName()
	{
		return this.accName;
	}
	
	
	
	 void setBalance(double balance)
	{
		this.balance=balance;
	}
	
	 double getBalance()
	{
		return this.balance;
	}
}
