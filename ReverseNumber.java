import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int number = 1234;
		
		int reversedNumber = 0;
		
		int temp = 0;
		
		while(number > 0)
		{
			// use modulus operator to strip off the last digit
			// temp = 4
			temp = number % 10;
			
			// create the reversed number
			// reversedNumber = 0 + 4 = 4
			reversedNumber = reversedNumber * 10 + temp;
			
			number = number/10;
			
		}
		
		System.out.println(reversedNumber);
		
	}
}

// Output - 4321

