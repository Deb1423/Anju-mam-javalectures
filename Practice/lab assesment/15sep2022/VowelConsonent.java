/*
Program: PRINTING VOWEL CONSONANT NUMBER SPECIAL CHARACTER.
@author: DEBJIT TALUKDER
@Date: 15 sep 2022
*/

//declaring a class 
class VowelConsonant
{
	// declaring method printVowelConsonant
	static void printVowelConsonant(char cValue)
	{
	  int vowCon = cValue; // computing  value
	  System.out.println("The ascii value of "+ cValue +" is :"+ vowCon );// printing
		
	}
	// end of method
	
	static void checkChar(char cValue)
	{
		int vowCon= cValue;
		if((vowCon>=65)&&(vowCon<=90))
		{
			System.out.println("Its a capital(uppercase) letter");
			
			if((cValue=='A')||(cValue=='E')||(cValue=='I')||(cValue=='O')||(cValue=='U'))
			{
				System.out.println("Its a vowel");
			}
			else
			{
				System.out.println("Its a consonant");
			}	
			
		    
		}
		else if((vowCon>=97)&&(vowCon<=122))
		{
			System.out.println("Its a small(lowercase) letter");
			if((cValue=='a')||(cValue=='e')||(cValue=='i')||(cValue=='o')||(cValue=='u'))
			{
				System.out.println("Its a vowel");
			}
			else
			{
				System.out.println("Its a consonant");
			}	
		}
		else if((vowCon>=48)&&(vowCon<=57))
		{
			System.out.println("Its a number");
		}
		else
			System.out.println("Its a special character");
			 
		
	}
	
   public static void main(String args[])
   {
	   char value = args[0].charAt(0);// taking a character input
	   
	   // calling method printVowelConsonant
      //printVowelConsonant(value);// passing value as a paramater
	  checkChar(value);
    
    }

   // end of main

}

// end of class