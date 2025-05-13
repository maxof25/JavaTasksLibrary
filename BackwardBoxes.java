import java.util.*;
public class BackwardBoxes {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their chosen characters.
		char a[] = new char[8];
		//Here i have created a char array which will have an index of 8 as there are eight characters to be stored.
		boolean b = true;
		//Here I have created a boolean variable called 'b' and stored the value true in it for later use in the program.
		while(b==true){
			//This while loop will repeate as long as the value stored in the variable 'b' is true.
			for(int i = 1;i < 9; i++){
				//This for loop will create an integer called 'i' which stores 0 in it and increments each loop until it has the value 8.
				System.out.print("Please enter character " + i + " > ");
				//This asks the user to enter the corresponding numbers with a character.
				a[i-1] = kb.nextLine().charAt(0);
				//This will store the input in the array of index one less than the requested number.
			}
			System.out.print("Here is your output : ");
			//This will tell the user that their output is about to be displayed.
			for(int j = 7; j >= 0; j--){
				//This for loop will create an integer called 'j' which stores 7 in it and decrements each loop until it has the value 0.
				System.out.print(a[j]);
				//This will print out the characters entered by the user in order.
			}
			System.out.print("\nWould you like to do that again? (Y/N)");
			//This will ask the user to enter whether the user would like to repeat the program or not.
			String answer = kb.nextLine().toUpperCase();
			//This will store the user's answer in the String variable called 'answer' and convert the value to the upper case.
			if(answer.equals("N")){
				//If the user has chosen to end the program, the following will occur.
				System.out.println("\nGoodbye!");
				//This will print the word "Goodbye" to the terminal of the IDE notifying the user that the program will end.
				b=false;
				//This will end the initial while loop, in turn ending the program.
			}
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}
}
