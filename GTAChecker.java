import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class GTAChecker 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner (System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their age.
		System.out.println("How old are you?");
		//This line will print out "How old are you?" in the terminal of the IDE, asking the user for their age.
		String a = kb.nextLine();
		//This will use the scanner 'kb' to read what the user has entered into the terminal and stores it in the variable a.
		int age = Integer.parseInt(a);
		//This line will take the value stored in a and place it in the integer variable, age, allowing the following if statements to be done to the number.
		if (age >= 18){
			//This if statement will occur if the number stored in the integer variable age is equal or bigger than 18.
			System.out.println("You are old enough to play GTA.");
			//This line will print out "You are old enough to play GTA." in the terminal of the IDE, telling the user they are of an appropriate age to be playing GTA.
			}
		else if (age<18&&age>=16){
			//This if statement will occur if the number stored in the integer variable age is smaller than 18 and bigger or equal to 16.
			System.out.println("You probably could play GTA if your parents agree.");
			//This line will print out "You probably could play GTA if your parents agree." in the terminal of the IDE. Telling the user that they should get their parent's permission to play GTA.
		}
		else{
			//This if statement will occur if the number stored in the integer variable age is smaller than 16.
			System.out.println("You should definitely not be playing GTA.");
			//This line will print out "You should definitely not be playing GTA." in the terminal of the IDE, telling the user that they should not be playing GTA, no matter what.
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}
}
