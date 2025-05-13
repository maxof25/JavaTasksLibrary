import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class WordPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered the chosen word.
		System.out.println("Please enter a word");
		//This line will print out "Please enter a word" in the terminal of the IDE, asking the user to input the word theu would like printed.
		String word = kb.nextLine();
		//This line will store what the user has entered into the terminal in the string variable word.
		int length = word.length();
		//This line will take the length in terms of letters of the string value stored in the variable word and store this number in the integer variable length.
		for (int i=1; i<=length;i++){
			//This for loop will create the integer variable i and store the value 1 in it. Each time the loop repeats the value stored in the variable i will increment until it is equal to the value stored in length.
			System.out.println(word.substring(0,i));
			//This will print the first letter position of the string variable stored in word, until the position of the value stored in variable i.
		}
	kb.close();
	//This line will close the scanner 'kb'.
	}
}