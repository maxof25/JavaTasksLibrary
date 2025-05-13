import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class NumberofLetters 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner (System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their word.
		System.out.println("Hi there! please enter a word:");
		//This line will print out "Hi there! please enter a word:" in the terminal of the IDE, asking the user for the word.
		String word = kb.nextLine();
		//This will use the scanner 'kb' to read what the user has entered into the terminal and stores it in the variable word.
		int length = word.length();
		//This line will get the length of the entered word and store this value in the integer variable 'length'.
		System.out.println("There are " + length + " letters in " + word);
		//This line will print out "There are " followed by the value stored in variable 'length' followed by " letters in " followed by the string variable word in the terminal of the IDE
		//This tells the user how many letters are in the word they initially entered.
		kb.close();
		//This line will close the scanner 'kb'.
	}
}
