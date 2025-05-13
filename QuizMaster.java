import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class QuizMaster 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner (System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their answer to the question.
		System.out.println("What is the third planet from the sun?");
		//This line will print out "What is the third planet from the sun?" in the terminal of the IDE, asking the user the quizes question.
		System.out.println("a. Mercury");
		//This line will print out "a. Mercury" in the terminal of the IDE, giving the first option.
		System.out.println("b. Venus");
		//This line will print out "b. Venus" in the terminal of the IDE, giving the second possible option.
		System.out.println("c. Earth");
		//This line will print out "c. Earth" in the terminal of the IDE, giving the third option.
		System.out.println("d. Neptune");
		//This line will print out "d. Neptune" in the terminal of the IDE, giving the fourth option.
		String answer = kb.nextLine().toLowerCase();
		//This will use the scanner 'kb' to read what the user has entered into the terminal and stores it in the variable answer. The value is converted to lower case.
		switch(answer){
		//This will start the switch case.
		case "c":
			System.out.println("Correct! Well done :-)");
			//This line will print out "Correct! Well done :-)" in the terminal of the IDE, telling the user they have given the correct answer.
			break;
		default:
			System.out.println("Wrong answer");
			//This line will print out "Wrong answer" in the terminal of the IDE, telling the user that they have given the incorrect answer.
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}
}