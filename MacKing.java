import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class MacKing 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner (System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered the desired number for their meal.
		System.out.println("Welcome to MacKing");
		//This line will print out "Welcome to MacKing" in the terminal of the IDE, welcoming the user to the program.
		System.out.println("Please enter your option :");
		//This line will print out "Please enter your option :" in the terminal of the IDE, asking the user for the number for their desired meal.
		System.out.println("1. Veggie Delight");
		//This line will print out "1. Veggie Delight" in the terminal of the IDE.
		System.out.println("2. Chicken Fusion");
		//This line will print out "2. Chicken Fusion" in the terminal of the IDE.
		System.out.println("3. Horse Burger");
		//This line will print out "3. Horse Burger" in the terminal of the IDE.
		System.out.println("4. Smoked Trout");
		//This line will print out "4. Smoked Trout" in the terminal of the IDE.
		String op = kb.nextLine();
		//This will use the scanner 'kb' to read what the user has entered into the terminal and stores it in the variable op.
		int option = Integer.parseInt(op);
		//This line will take the value stored in op and place it in the integer variable option allowing the if statements to be done to the number.
		if (option == 1){
			//This if statement will occur if the entered number stored in the integer variable option is equal to 1.
			System.out.println("You have selected: Veggie Delight");
			//This line will print out "You have selected: Veggie Delight" in the terminal of the IDE, telling the user what meal they have selected.
			System.out.println("Sounds tasty! That will be $5 please");
			//This line will print out "Sounds tasty! That will be $5 please" in the terminal of the IDE, telling the user the price of the selected meal.
		}
		else if (option==2){
			//This if statement will occur if the entered number stored in the integer variable option is equal to 2.
			System.out.println("You have selected: Chicken Fusion");
			//This line will print out "You have selected: Chicken Fusion" in the terminal of the IDE, telling the user what meal they have selected.
			System.out.println("Sounds tasty! That will be $2.50 please");
			//This line will print out "Sounds tasty! That will be $2.50 please" in the terminal of the IDE, telling the user the price of the selected meal.
		}
		else if (option==3){
			//This if statement will occur if the entered number stored in the integer variable option is equal to 3.
			System.out.println("You have selected: Horse Burger");
			//This line will print out "You have selected: Horse Burger" in the terminal of the IDE, telling the user what meal they have selected.
			System.out.println("Sounds tasty! That will be $7 please");
			//This line will print out "Sounds tasty! That will be $7 please" in the terminal of the IDE, telling the user the price of the selected meal.
		}
		else if (option==4){
			//This if statement will occur if the entered number stored in the integer variable option is equal to 4.
			System.out.println("You have selected: Smoked Trout");
			//This line will print out "You have selected: Smoked Trout" in the terminal of the IDE, telling the user what meal they have selected.
			System.out.println("Sounds tasty! That will be $10 please");
			//This line will print out "Sounds tasty! That will be $10 please" in the terminal of the IDE, telling the user the price of the selected meal.
		}
		else{
			//This if statement will occur if the entered number stored in the integer variable option is bigger than 4 or lower than 1.
			System.out.println("Sorry dude, that's not on the menu.");
			//This line will print out "Sorry dude, that's not on the menu." in the terminal of the IDE, telling the user their input is invalid.
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}
}
