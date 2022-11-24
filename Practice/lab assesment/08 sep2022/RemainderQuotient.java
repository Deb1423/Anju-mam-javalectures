/* 
program : Java program to find Quotient and Remainder;
@author : Debjit Talukder
@ date : 8th sep, 2022
*/
//declaring class
class QuotientRemainder
{
// calling the main method
public static void main (String[] args)
	{
		float dividend= Float.parseFloat(args[0]);
		float divisor= Float.parseFloat(args[1]);
		float quotient= dividend/divisor;
	    int remainder =(int)(dividend%divisor);
		System.out.println("the Quotient is :" +quotient);
	    System.out.println("the remaining is :" +remainder);
}
//end of main 
}
//end of class QuotientRemainder.