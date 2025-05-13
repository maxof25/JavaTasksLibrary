import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class PayCalc 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner (System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered the number of hours they have worked.
		System.out.println("Enter the number of hour worked > ");
		//This line will print out "Enter the number of hour worked >" in the terminal of the IDE, asking the user to input their working hours.
		String h = kb.nextLine();
		//This will use the scanner 'kb' to read what the user has entered into the terminal and stores it in the variable h.
		int hours = Integer.parseInt(h);
		//This line will take the value stored in h and place it in the integer variable, hours, allowing the following if statements to be done to the number.
		if (hours<=8){
			//This will occur if the user has not done any overtime work. This means they must have done 8 or less hours of work.
			System.out.println("Standard Pay: £" + (hours*8.25));
			//As we know they are not working overtime we know we can just multiply the amount of hours worked by 8.25 to get their salary.
			System.out.println("Overtime pay: £" + ((hours-hours)*14.50));
			//As they will not be receiving any overtime payment we must take the amount of hours away from itself making their overtime pay 0.
			System.out.println("Total pay £"+ ((hours*8.25)+(hours-hours)*14.50));
			//This line will print out "Total pay £" followed by the amount they should receive in the terminal of the IDE, telling the user how much money they will receive.
			//I calculate the total by adding the two calculations made to find their standard pay and overtime pay together. As they have not done more than 8 hours of work, they will only be receiving the standard pay.
		}
		else{
			//This will occur if the user has worked for more than 8 hours, in turn giving them access to overtime pay.
			System.out.println("Standard Pay: £" + ((8*8.25)));
			//As we know that they have worked overtime we can give them the maximum amount for standard pay.
			System.out.println("Overtime pay: £" + ((hours-8)*14.50));
			//To find how many hours they have worked overtime we must deduct 8 hours from the total of hours. We can then find their overtime pay by multiplying the remaining hours by the new rate (14.50 per hour).
			System.out.println("Total pay £"+ ((8*8.25)+(hours-8)*14.50));
			//This line will print out "Total pay £" followed by the amount they should receive in the terminal of the IDE, telling the user how much money they will receive.
			//I calculate the total by adding the two calculations made to find their standard pay and overtime pay together. As they have done more than 8 hours of work, they will be receiving the standard pay and overtime pay.
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}
}
