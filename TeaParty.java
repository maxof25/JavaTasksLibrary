import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class TeaParty 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner (System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their choice on whether or not to attend the tea party.
		System.out.println("Would you like to go to the tea party? (yes/no) >");
		//This line will print out "Would you like to go to the tea party? (yes/no) >" in the terminal of the IDE, asking the user is they would like to go to the tea party or not.
		String answer = kb.nextLine().toLowerCase();
		//This will use the scanner 'kb' to read what the user has entered into the terminal and stores it in the string variable answer. The value is converted to lower case.
		switch (answer){
		//This starts the switch-case.
		case "yes":
			//If the value stored in answer is "yes", this will occur.
			System.out.println("Hurray! See you there!");
			//This line will print out "Hurray! See you there!" in the terminal of the IDE, confirming the users attendance to the tea party.
		break;
		case "no":
			//If the value stored in answer is "no", this will occur.
			System.out.println("Awwww! No fun!");
			//This line will print out "Awwww! No fun!" in the terminal of the IDE, confirming the user will not be attending the tea party.
		break;
		default:
			//This will occur if the value stored in the variable answer is not equal to yes or no.
			System.out.println("I dont understand what your saying...");
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}
}