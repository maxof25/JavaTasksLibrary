import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class NumberTime 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner (System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their desired number.
		System.out.println("Please enter a number :");
		//This line will print out "Please enter a number :" in the terminal of the IDE, asking the user for their wanted number.
		String num = kb.nextLine();
		//This will use the scanner 'kb' to read what the user has entered into the terminal and stores it in the variable num.
		double num1 = Double.parseDouble(num);
		//This line will convert the value stored in variable num into a double allowing the following calculations to be done to the number.
		double n2 = num1*2;
		//This line will double the number entered initially. This value is stored in the variable n2. The type of variable used is a double as the double of the entered number may not be an integer.
		double n3 = num1/2;
		//This line will half the number entered initially. This value is stored in the variable n3. The type of variable used is a double as the half of the entered number may not be an integer.
		double n4 = num1*num1;
		//This line will square the number entered initially. This value is stored in the variable n4. The type of variable used is a double as the square of the entered number may not be an integer.
		double n5 = (num1 + num1/2);
		//This line will multiply the number entered initially by 1.5. This value is stored in the variable n5. 
		//The type of variable used is a double as the calculation made to the entered number may not be an integer
		System.out.println("Double of " + num1 + " is " + n2);
		//This line will print out "Double of " followed by the value stored in num1, then " is " followed immediately by the value stored in the variable n2 in the terminal of the IDE. 
		//Showing the user, their doubled number.
		System.out.println("Half of " + num1 + " is " + n3);
		//This line will print out "Half of " followed by the value stored in num1, then " is " followed immediately by the value stored in the variable n3 in the terminal of the IDE. 
		//Showing the user, their halved number.
		System.out.println("Square of " + num1 + " is " + n4);
		//This line will print out "Square of " followed by the value stored in num1, then " is " followed immediately by the value stored in the variable n4 in the terminal of the IDE. 
		//Showing the user, their squared number.
		System.out.println("One and a half times " + num1 + " is " + n5);
		//This line will print out "One and a half times " followed by the value stored in num1, then " is " followed immediately by the value stored in the variable n5 in the terminal of the IDE. 
	
		//Showing the user, 1.5 times their number.
		kb.close();
	}
	
}