/*
Program: Java program to create a bank account and display the peopole with balance less than 1000.
@Author:- Debjit Talukder.
@Date:- 23Sep, 2022.
*/
import java.util.Scanner;
class Bank2
{
	public static void main(String ...args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Account Number:");
			
		int size = sc.nextInt();
		Account a[] = new Account[size];
		
		//loop to allocates memory
		
		//loop to input
		for(int i=0;i<size;i++)
		{
			s[i]= new Student();// allocating the memory
			System.out.println("Enter the Account Number:");
			s[i].setAccID(sc.nextInt());
			System.out.println("Enter the Name:");
			s[i].setAccName(sc.next());
			System.out.println("Enter the Balance:");
			s[i].setBalance(sc.nextdouble());
			
						
		}
		System.out.println("----------Account Holder with Balance less than 1000---------");
		
		//loop for output
		for(int i=0;i<size;i++)
		{
			if((s[i].getBalance())<1000)
			{
				System.out.println("Name:  "+s[i].getAccName());
			}
			
		}
		
		
		
	}
	
	
}