import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class CrossSticks 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner (System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their desired value.
		System.out.println("Cross Sticks!");
		//This line will print out "Cross Sticks!" in the terminal of the IDE, telling the user the name of the program being run.
		System.out.println("Please enter a 5 letter word >");
		//This line will print out "Please enter a 5 letter word >" in the terminal of the IDE, telling the user to input their desired 5 letter word.
		String word = kb.nextLine();
		//This line will store the user's input in the variable 'word' using the declared scanner 'kb'.
		String word1 = word.toUpperCase();
		//This will make every letter of the stored word in variable 'word' and then store this word in a new variable named 'word1'.
		for (int i = 1; i < 6 ; i++){
			//This for loop will continue looping until variable i has reached 5 as it is incremented by one each ime the loop cycles.
			//The loop will stop when i=5 as there are only five words in the entered word.
			System.out.println(word1.substring(i-1,i));
			//Each cycle of the loop, this line will out put the position of the value stored in i in terms of the entered word in the terminal of the IDE.
			//Each letter will be output to a separate line.
		}
	}
}
