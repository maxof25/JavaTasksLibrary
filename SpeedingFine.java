import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class SpeedingFine 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner (System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered the speed of the motorist.
		System.out.println("Please enter the motorist speed >");
		//This line will print out "Please enter the motorist speed >" in the terminal of the IDE, asking the user for the motorist speed.
		String s = kb.nextLine();
		//This will use the scanner 'kb' to read what the user has entered into the terminal and stores it in the variable s.
		int speed = Integer.parseInt(s);
		//This line will take the value stored in s and place it in the integer variable, speed, allowing the following if statements to be done to the number.
		if (speed >= 40 && speed <=44){
			//This if statement will occur if the motorist speed stored in the integer variable speed is equal or bigger than 40 and smaller or equal to 44.
			System.out.println("Motorist is fined $90");
			//This line will print out "Motorist is fined $90" in the terminal of the IDE, telling the user how much they will be fined.
			}
		else if (speed>44){
			//This if statement will occur if the motorist speed stored in the integer variable speed is bigger than 44.
			int o = speed-44;
			//This will see by how man miles per hour the motorist is travelling over 44mph by.
			System.out.println("Motorist is travelling " + o + "mph over 44mph.");
			//This line will print out "Motorist is travelling " followed by the value stored in the integer variable o, followed by "mph over 44mph." in the terminal of the IDE. 
			//Telling the user by how much the motorist was speeding over 44mph.
			int fine = o*100;
			//This will calculate the amount of money the motorist should be fined for and stores it in the integer variable fine.
			System.out.println("Motorist is fined $" + fine);
		}
		else{
			//This if statement will occur if the motorist speed stored in the integer variable speed is less than 40mph.
			System.out.println("Motorist is not speeding.");
			//This line will print out "Motorist is not speeding." in the terminal of the IDE, telling the user that the motorist is not speeding and shouldn't be fined.
		}
		kb.close();
		//This line will close the scanner 'kb'.
		
	}

}
