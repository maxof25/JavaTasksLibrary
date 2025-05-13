import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class WordSizeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their chosen word.
		System.out.println("Enter a word >");
		//This line will print out "Enter a word >"in the terminal of the IDE, asking the user to input their word.
		String word = kb.nextLine();
		//This line will store what the user has entered into the terminal in the string variable word.
		int length = word.length();
		//This line will get the legth of the enterd word in terms of letters and store this value in the integer variable length.
		if (length == 6){
			//This if statement will only occur if the length of the entered word is equal to six.
			System.out.print("Magic six! " );
			for(int i = 5; i >=0; i--){
				//This will create the integer variable i and store the value 5 in it. Each time it loops the value will decrease by one until it reaches 0.
				System.out.print( word.toUpperCase().charAt(i));
				//This will print out each letter of the word in upper case from the end to the beginning of the word.
			}
		}
		else if (word.equals("Japan")){
			//This will occur if the enterd word is "Japan".
			System.out.println("Goodbye!");
			//This line will print out "Goodbye!" in the terminal of the IDE, telling the user that they have entered the key word.
			
		}
		else{
			//If the word is neither 6 letters long or "Japan" this will occur
			System.out.println(word + " has " + word.length() + " letters.");
			//This line will print out word + " has " + word.length() + " letters." in the terminal of the IDE, telling the user how many digits long their word is.
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}
}