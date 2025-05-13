import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class BiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
			//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their chosen numbers.
		System.out.println("Enter the first number >");
		//This line will print out "Enter the first number >" in the terminal of the IDE, asking the user to input their first number.
		String Number1 = kb.nextLine();
		//This line will store what the user has entered into the terminal in the string variable Number1.
		int n1 = Integer.parseInt(Number1);
		//This will parse the number stored in the String variable Number1 to the integer variable n1.
		System.out.println("Enter the second number >");
		//This line will print out "Enter the second number >" in the terminal of the IDE, asking the user to input their second number.
		String Number2 = kb.nextLine();
		//This line will store what the user has entered into the terminal in the string variable Number2.
		int n2 = Integer.parseInt(Number2);
		//This will parse the number stored in the String variable Number1 to the integer variable n2.
		System.out.println("Enter the third number >");
		//This line will print out "Enter the third number >" in the terminal of the IDE, asking the user to input their third number.
		String Number3 = kb.nextLine();
		//This line will store what the user has entered into the terminal in the string variable Number3.
		int n3 = Integer.parseInt(Number3);
		//This will parse the number stored in the String variable Number1 to the integer variable n3.
		if(n1>n2&&n1>n3){
			//This if statement will occur if the first number is bigger than both the second and third number.
			System.out.println("The first number (" + n1 + ") was the biggest");
			//This line will tell the user the first number is the biggest in the terminal of the IDE
		}
		else if(n2>n1&&n2>n3){
			//This if statement will occur if the second number is bigger than both the first and third number.
			System.out.println("The second number (" + n2 + ") was the biggest");
			//This line will tell the user the second number is the biggest in the terminal of the IDE
		}
		else{
			//This if statement will occur if the third number is bigger than both the second and first number.
			System.out.println("The third number (" + n3 + ") was the biggest");
			//This line will tell the user the third number is the biggest in the terminal of the IDE
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}

}
