import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class SantaClaus 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner (System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their responses.
		System.out.println("Have you been good this year? (yes/no)");
		//This line will print out "Have you been good this year?" in the terminal of the IDE, asking the user whether or not they have been good.
		String good = kb.nextLine().toLowerCase();
		//This will use the scanner 'kb' to read what the user has entered into the terminal and stores it in the variable good.
		System.out.println("Have you been naughty or nice? (naughty/nice)");
		//This line will print out "Have you been naughty or nice? (naughty/nice)" in the terminal of the IDE, asking the user whether they have been naughty or nice.
		String nn = kb.nextLine().toLowerCase();
		//This will use the scanner 'kb' to read what the user has entered into the terminal and stores it in the variable nn.
		if ((good.equals("yes")) && (nn.equals("nice"))){
			//This if statement will occur if the words stored in the string variables 'good' and 'nn' are equal to "yes" and "nice".
			System.out.println("You will get a present this year!");
			//This line will print out "You will get a present this year!" in the terminal of the IDE, ensuring the user they will receive a present this year.
		}
		else if ((good.equals("no"))&&(nn.equals("naughty"))){
			//This if statement will occur if the words stored in the string variables 'good' and 'nn' are equal to "no" and "naughty".
			System.out.println("You will get a lump of coal!");
			//This line will print out "You will get a lump of coal!" in the terminal of the IDE, telling the user that they will receive coal this year.
		}
		else{
			//If the values stored in the string variables are not both positive or negative, this part of the if statement will occur.
			System.out.println("You will have to wait and see!");
			//This line will print out "You will have to wait and see!" in the terminal of the IDE, telling the user that they are not certain to get either coal or presents.
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}
}
