/*
Program: Java program to create a bank account and display the peopole with balance less than 1000.
@Author:- Debjit Talukder.
@Date:- 23Sep, 2022.
*/
class Bank
{
	public static void main(String ...args)
	{
		Account a[]= new Account[5];
		a[0]= new Account( 7289, "Deep Das", 100.50 );
		a[1]= new Account( 7260, "Ankit Chakraborty", 5000.50 );
		a[2]= new Account( 7290, "Pramit Kumar pal", 10000.50 );
		a[3]= new Account( 8567, "Ajit Chakraborty", 900.50 );
		a[4]= new Account( 2345, "shreyas Halder", 500.50 );
	
	for (int i=0;i<5;i++)
	{
		if ((a[i].getBalance())< 1000)
			
			{
				System.out.println("Name:  "+a[i].getAccName());
			}
	}
	}






}

