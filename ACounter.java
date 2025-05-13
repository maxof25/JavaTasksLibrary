import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class ACounter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their chosen sentence.
		System.out.println("Enter your sentence >");
		//This line will print out "Enter your sentence >"in the terminal of the IDE, asking the user to input their chosen sentence.
		String sentence = kb.nextLine().toLowerCase();
		//This line will store what the user has entered into the terminal in the string variable sentence amd convert it to lower case
		int length = sentence.length();
		//This line will measure the length of the sentence in terms of letters and spaces. This will then store this length in the integer variable 'length'. 
		int counter = 0;
		//This creates a counter to be used later in the program. The number 0 is stored in the variable 'counter'.
		for(int i = 0; i < length; i++){
			//This for loop creates an integer variable i and stores the number 0 in it. As long as it is smaller than the length of the sentence it will loop.
			//each loop the number in i is incremented.
			if(sentence.charAt(i)=='a'){
				//If the letter at the postion of the number stored in i in terms of numbers is the letter 'a', this if statement will occur.
				counter++;
				//It will increment the counter, in turn counting how many letter a's are in the sentence.
			}
		}
		System.out.println("Number of A's found >" + counter);
		//This will output "Number of A's found >" followed by the integer stored in the counter, telling the user how many letter a's are in the sentence in the terminal of the IDE.
		kb.close();
		//This line will close the scanner 'kb'.
	}	
}