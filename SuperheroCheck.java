import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class SuperheroCheck 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner (System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their age.
		System.out.println("Please enter your age >");
		//This line will print out "Please enter your age >" in the terminal of the IDE, asking the user for their age.
		String num = kb.nextLine();
		//This will use the scanner 'kb' to read what the user has entered into the terminal and stores it in the string variable num.
		int age = Integer.parseInt(num);
		//This line will take the value stored in num and place it in the integer variable 'age' allowing the following if statement to occur.
		if (age <= 10){
			//This if statement will occur if the entered number stored in the integer variable age is smaller or equal to 10.
			System.out.println("You can be a superhero! :-)");
			//If the number is smaller and equal to 10 then "You can be a superhero! :-)" will be printed to the terminal of the IDE.
		}
		else{
			System.out.println("You are TOO OLD to be a superhero! :-(");
			//If the age the user has entered is larger than 10 then "You are TOO OLD to be a superhero! :-(" will be printed to the terminal of the IDE.
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}
}
