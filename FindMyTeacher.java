import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class FindMyTeacher 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner (System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered the room they wish to enter.
		System.out.println("In what room shall we look? (Between 1 and 10)");
		//This line will print out "In what room shall we look? (Between 1 and 10)" in the terminal of the IDE, asking the user to input a room number between 1 and 10.
		String r = kb.nextLine();
		//This will use the scanner 'kb' to read what the user has entered into the terminal and stores it in the variable r.
		int room = Integer.parseInt(r);
		//This line will take the value stored in r and place it in the integer variable, room, allowing the following if statements to be done to the number.
		if (room == 1){
			//This if statement will occur if the room number stored in the integer variable room is equal to 18.
			System.out.println("Mr Coetzee is in room 1.");
			//This line will print out "Mr Coetzee is in room 1." in the terminal of the IDE, telling the user they have entered Mr Coetzee's room number.
			}
		else if (room == 6){
			//This if statement will occur if the room number stored in the integer variable room is equal to 6.
			System.out.println("Mr Taylor is in room 6.");
			//This line will print out ""Mr Taylor is in room 6." in the terminal of the IDE. telling the user that they they have entered Mr Taylor's room number.
		}
		else if (room == 8){
			//This if statement will occur if the room number stored in the integer variable room is equal to 8.
			System.out.println("Mr Lowe is in room 8.");
			//This line will print out "Mr Lowe is in room 8." in the terminal of the IDE. Telling the user that they have entered Mr Lowe's room number.
		}
		else{
			//This if statement will occur if the the room number stored in the integer variable room is not 1, 6 or 8, as well as being bigger than 10.
			System.out.println("There is nobody in that room.");
			//This line will print out "There is nobody in that room." in the terminal of the IDE, telling the user that there is nobody in the entered room.
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}
}