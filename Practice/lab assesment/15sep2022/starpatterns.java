/*	Program: PRINTING A Star Triangle

	   *
	  * *
	 * * *
	* * * * 
	
	@author: DEBJIT TALUKDER
@Date: 15 sep 2022
	*/
	class StarPatterns
	{
		
	   static void starPatterns(int noOfRows)
	   {
		for(int i=1;i<=noOfRows;i++) // outer loop 
		{
			System.out.println(); // new line after each row
			
			for(int spaces=noOfRows;spaces>i;spaces--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			} // printed the star triangle.
			
			
		}
		
	   }
	   
	   public static void main(String... args)
   {
	  int number =Integer.parseInt(args[0]);
	  starPatterns(number);
      
   }
	}
	