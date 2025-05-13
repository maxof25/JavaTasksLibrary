import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class TempCheck 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner (System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their chosen temperature.
		System.out.println("Please enter the tempurature >");
		//This line will print out "Please enter the temperature >" in the terminal of the IDE, asking the user for the temperature.
		String temperature = kb.nextLine();
		//This will use the scanner 'kb' to read what the user has entered into the terminal and stores it in the variable temperature.
		double temp = Double.parseDouble(temperature);
		//This line will take the value stored in temperature and place it in the double variable 'temp' allowing the following if statement to be done to the variable.
		if (temp <= 0){
			//This if statement will occur if the value stored in the variable temp is smaller or equal to 0.
			System.out.println("THAT'S FREEZING!");
			//If the value stored in temp is equal or smaller than 0 then "THAT'S FREEZING!" will be printed to the terminal of the IDE.
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}
}
