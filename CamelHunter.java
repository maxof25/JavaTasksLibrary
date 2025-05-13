import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class CamelHunter 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner (System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their word.
		System.out.println("Hi there! please enter a 10 letter word:");
		//This line will print out "Hi there! please enter a 10 letter word:" in the terminal of the IDE, asking the user for their ten letter word.
		String word = kb.nextLine();
		//This will use the scanner 'kb' to read what the user has entered into the terminal and stores it in the variable word.
		System.out.println("Camelising this word");
		//This line will print out "Camelising this word" in the terminal of the IDE, telling the user it is 'camelising' their word.
		for (int i=1; i<=10;i++){
			//Here I created a for loop which will stop when i=10. This is because there are ten letters in the entered word.
			String w = word.substring(i-1,i);
			if (i%2==0) {
				//This if statement will check if the position of the letter is odd or even. If even the letter will proceed through this if statement.
				System.out.print(w);
				//If the positioning of the letter is even then it will be printed in upper case.
			}
			else{
				System.out.print(w.toUpperCase());
				//This will ensure every other letter (of even placement) will be converted to upper case and printed in the terminal of the IDE.
			}
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}
}
