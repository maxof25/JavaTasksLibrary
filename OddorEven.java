import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class OddorEven 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner (System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their number.
		System.out.println("Please enter a number between 1 and 100 >");
		//This line will print out "Please enter a number between 1 and 100 >" in the terminal of the IDE, asking the user to input a number between 1 and 100.
		String n = kb.nextLine();
		//This will use the scanner 'kb' to read what the user has entered into the terminal and stores it in the string variable n.
		int num = Integer.parseInt(n);
		//This line will take the value stored in n and place it in the integer variable, num, allowing the following if statements to be done to the number.
		if ((num>=1) && (num<=100)){
			//This line will ensure that the following if statements will only be done to a number between 1 and 100. 
			if (num%2==0){
				//This if statement will occur if the integer stored in the int variable num is divisible by 2.
				System.out.println("This number is even");
				//This line will print out "This number is even" in the terminal of the IDE, telling the user that their number is even.
			}
			else {
				//This part of the if statement will occur if the number is odd. This is because the integer entered can only be either odd or even. 
				System.out.println("This number is odd");
				//This line will print out "This number is odd" in the terminal of the IDE, telling the user that their number is odd.
			}
		}
		else{
			System.out.println("This number is not between 1 and 100");
			//This line will print out "This number is not between 1 and 100" in the terminal of the IDE, telling the user that their number is not within the desired boundaries of 1 to 100.
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}
}
