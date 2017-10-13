package example29;
import java.util.Scanner;
/*   
    Author: Chan In Kou
    Purpose: The Display will show how to format a phone number
*/
public class Example29
{ 
    public static void main(String[] args) 
	{
		//Create a Scanner
		Scanner in = new Scanner(System.in);
		
		//Write a program that reads a ten-digit phone number as a string (such as 5436783453)
		System.out.print("What is your phone number? ");
		String phoneNumber = in.nextLine();
		
		//formats it into a more readable string with parenthesis and dashes like this: "(543) 678-3453" or else error
		if (phoneNumber.length() == 10 && phoneNumber.substring(0, 1).matches("[0-9]"))
	    {
			System.out.print(String.valueOf(phoneNumber).replaceFirst("([0-9]{3})([0-9]{3})([0-9]+)", "($1)-$2-$3"));
		}
		else
		{
			System.out.print("error!");
			System.exit(0);
		}
	} 
}