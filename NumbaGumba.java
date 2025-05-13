import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class NumbaGumba 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner (System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their name and year of birth.
		System.out.println("Hello there! What is your name?");
		//This line will print out "Hello there! What is your name?" in the terminal of the IDE, asking the user for their name.
		String name = kb.nextLine();
		//This will use the scanner 'kb' to read what the user has entered into the terminal and stores it in the variable name.
		System.out.println("Hello " + name + ", what year were you born in?");
		//This line will print out "Hello " followed by the value in variable name then followed by the questions ", what year were you born in?" in the terminal of the IDE. 
		//Asking the user for the year they were born in.
		String year = kb.nextLine();
		//This will use the scanner 'kb' to read what the user has entered into the terminal and stores it in the variable year.
		int year1 = Integer.parseInt(year);
		//This line will take the value stored in year and place it in the integer variable 'year1' allowing the following calculations to be done to the number.
		int year2 = (2018-year1)-1;
		//This line will take the entered date of birth from the current year (2018) then it takes 1 from the product.
		//This will accurately show the how old the user was last year. The product is stored in the integer variable year2.
		int year3 = (2018-year1)+1;
		//This line will also take the entered date of birth from the current year (2018) then it adds 1 to the product.
		//This will accurately show the how old the user will be next year. The product is stored in the integer variable year3.
		System.out.println("Last year you were " + year2);
		//This line will print out "Last year you were " followed by the value in variable year2 in the terminal of the IDE.
		//This will in turn tell the user how old they were last year.
		System.out.println("Next year you will be " + year3);
		//This line will print out "Next year you will be " followed by the value in variable year3 in the terminal of the IDE.
		//This will in turn tell the user how old they will be next year.
		kb.close();
		//This line will close the scanner 'kb'.
	}
}
