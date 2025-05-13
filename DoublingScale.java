import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class DoublingScale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their number.
		System.out.println("Enter your number >");
		//This line will print out "Enter your number >" in the terminal of the IDE, asking the user to input their number.
		String n = kb.nextLine();
		//This line will store what the user has entered into the terminal in the string variable n.
		int number = Integer.parseInt(n);
		//This line will take the value stored in the string varaible n and store it in the integer variable number.
		for (int i=0; i<4 ;i++){
			//The for loop will create the integer variable i and store 0 in it initially. For each loop the value stored in i will be incremented. This will repeat until the number is less than 4.
			number = number*2;
			//This line will mutiply the enteref value by 2 and store it back in the variable number.
			System.out.println(number);
			//This line will print out the value stored in number in the terminal of the IDE, telling the user the doubled value each time the loop repeats.
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}
}
