/* 
program : Write a java program to calculate simple interest(SI =PxRxt).;
@author : Debjit Talukder
@ date : 8th sep, 2022
*/
//declaring class
class SimpleInterest
{
// calling the main method
public static void main (String[] args)
	{
		int p= Integer.parseInt(args[0]);
		int r= Integer.parseInt(args[1]);
		int t= 5;
	    int simpleinterest =(p*r*t)/(100);
		System.out.println("the Principle money is :" +p);
	    System.out.println("the Rate of Interest is :" +r);
		System.out.println("the Time of Processing is :" +t);
		System.out.println("the Simple Interest is :" +simpleinterest);
		
}
//end of main 
}
//end of class SimpleInterest