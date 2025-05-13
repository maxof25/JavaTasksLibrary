import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scannner for the keyboard later on in the program.
public class AgeMe 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner (System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their desired value.
		System.out.println("What is your name?");
		//This line will print out "What is your name?" in the terminal of the IDE, telling the user to input their name.
		String name = kb.nextLine();
		//This line stores the entered value in the string variable 'name' as names consist of just letters.
		System.out.println("What is your age?");
		//This line will print out "What is your age?" in the terminal of the IDE, asking the user for their age.
		String age = kb.nextLine();
		//This will use the scanner 'kb' to read what the user has entered into the terminal and stores it in the string variable age.
		int age1 = Integer.parseInt(age);
		//This line will convert the value stored in variable age into an integer allowing the following calculation to be done to the number.
		System.out.println("Well " + name + ", in 10 years time you will be " + (age1+10) + " years old.");
		//This line will print out "Well " followed by the value stored in name, then ", in 10 years time you will be "followed immediately by the value stored in the variable age1 added to 10 in the terminal of the IDE. 
	}
}
