import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class BlockMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their chosen number.
		System.out.println("Please enter a number >");
		//This line will print out "Please enter a number >" in the terminal of the IDE, asking the user to input the length and width they wish the square to be.
		String n1 = kb.nextLine();
		//This line will store what the user has entered into the terminal in the string variable n.
		int num1 = Integer.parseInt(n1);
		//This line will store the value in the string variable n1 in the string variable num1.
		for (int i = 0; i < num1; i++) {
			//The created for loop will create an integer variable i with the value 0 stored in it. Each time the loop repeats the value stored in i will increment until it is one smaller than the entered number.
			//This for loop is responsible for the length of the square
	        for (int k = 0; k < num1; k++) {
				//The created for loop will create an integer variable k with the value 0 stored in it. Each time the loop repeats the value stored in i will increment until it is one smaller than the entered number.
	            //This for loop is responsible for the width of the square.
	        	System.out.print("X");
	            //Each time the for loop repeats "X" will be printed in the terminal of the IDE
	        }
	        System.out.println();
	        //This will create a new line in the terminal allowing the shape to be formed.
	    }
		kb.close();
		//This line will close the scanner 'kb'.
	}
}
