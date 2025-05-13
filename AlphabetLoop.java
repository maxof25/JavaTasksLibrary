import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class AlphabetLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb =new Scanner(System.in);
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//This line will store the letters of the alphabet in one string variable called alphabet.
		int length = alphabet.length();
		//This line will acquire the length of the variable alphabet in terms of how many letters there are. It will store this value in the integer variable length.
		for (int i=0; i < length ; i ++){
			//The for loop will create the integer variable i and store the nuber 0 in it. For each loop, the value of i will be incremented. It will repeat until the value of i is one less than the value in length(26)
			System.out.println((i+1) + " - " + alphabet.charAt(i));
			//This line will print out (i+1) + " - " + alphabet.charAt(i) in the terminal of the IDE, Giving the user each letter of the alphabet on a new line with their corresponding position..
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}
}