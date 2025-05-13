import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class CaseCalc 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner (System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their numbers and operation.
		System.out.println("Please select operation (ADD, SUB, MLP)");
		//This line will print out "Please select operation (ADD, SUB, MLP)" in the terminal of the IDE, asking the user for their chosen operation.
		String operation = kb.nextLine().toUpperCase();
		System.out.println("Please enter the first number");
		//This line will print out "Please enter the first number" in the terminal of the IDE, asking the user for their first number.
		String n1 = kb.nextLine();
		//This will use the scanner 'kb' to read what the user has entered into the terminal and stores it in the string variable n1.
		int num1 = Integer.parseInt(n1);
		//This line will take the value stored in n1 and place it in the integer variable, num1, allowing the following processes to be done to the number.
		System.out.println("Please enter the second number");
		//This line will print out "Please enter the second number" in the terminal of the IDE, asking the user for their second number.
		String n2 = kb.nextLine();
		//This will use the scanner 'kb' to read what the user has entered into the terminal and stores it in the string variable n2.
		int num2 = Integer.parseInt(n2);
		//This line will take the value stored in n2 and place it in the integer variable, num2, allowing the following processes to be done to the number.
		switch(operation){
		//This starts the switch-case.
		case "ADD":
			//If the value stored in operation is "ADD", this will occur.
			int add = num1+num2;
			//The product of the users numbers added together is stored in the integer variable add.
			System.out.println(num1 + " + " + num2 + " = " + add);
			//This will print the first number followed by "+" followed by the second number followed by "=" followed by the value stored in add, giving the user the whole calculation in the terminal of the IDE.
		break;
		case "SUB":
			//If the value stored in operation is "SUB", this will occur.
			int sub = num1-num2;
			//The product of the users numbers subtracted is stored in the integer variable sub.
			System.out.println(num1 + " - " + num2 + " = " + sub);
			//This will print the first number followed by "-" followed by the second number followed by "=" followed by the value stored in sub, giving the user the whole calculation in the terminal of the IDE.
		break;
		case "MLP":
			//If the value stored in operation is "MLP", this will occur.
			int mlp = num1*num2;
			//The product of the users numbers multiplied together is stored in the integer variable mlp.
			System.out.println(num1 + " x " + num2 + " = " + mlp);
			//This will print the first number followed by "x" followed by the second number followed by "=" followed by the value stored in mlp, giving the user the whole calculation in the terminal of the IDE.
		break;
		default:
			//This will occur if the value stored in the variable operation is not equal to ADD, SUB or MLP.
			System.out.println("I do not understand that operation");
			//This line will print out "I do not understand that operation" in the terminal of the IDE, telling the user that their input is invalid.
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}
}
