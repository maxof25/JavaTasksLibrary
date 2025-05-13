import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class Spellman {
	public static void main(String[] args) {
		Scanner kb =new Scanner(System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their seven letter word.
		System.out.println("Please enter your seven letter word >");
		//This line will print out "Please enter your seven letter word >" in the terminal of the IDE, asking the user to input their seven letter word.
		String word = kb.nextLine();
		//This will use the scanner 'kb' to read what the user has entered into the terminal and stores it in the string variable word. 
		int length = word.length();
		for (int i = 0 ; i < length;i++){
			//This for loop declares the integer variable 'i' and stores the value 0 in it. Each time it loops the integer i is incremented. It will continue and increment until i is less than 7.
			System.out.println(word.charAt(i));
			//This line will print out the letter at the position of the value of i in the inputted word.
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}

}
