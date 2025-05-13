import java.util.*;
public class Snap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their chosen number.
		int number = (int)(Math.random()*100+1);
		//This will generate a random number between 1 and 100 and store it in the integer variable called 'number'.
		boolean a = true;
		//This creates a boolean variable and stores the value true in it for use later in the program.
		int counter = 0;
		//This creates a counter called 'counter' and stores the integer 0 in it.
		while(a==true){
			//This while loop will only occur so long as the value stored in the variable 'a' is true.
			System.out.println("Enter your guess");
			//This will print "Enter your guess" to the terminal of the IDE asking the user to enter what number they guess the number to be.
			String g = kb.nextLine();
			//This will store the users input in the string variable called 'g'.
			int guess = Integer.parseInt(g);
			//This will take the value stored in the variable 'g' and parse it to an integer variable for processing later in the program.
			if(guess==number){
				//This if statement will occur if the users input is equal to the random number generated at the beginning of the program.
				counter++;
				//This will increment the counter by one, in turn counting how many times the user has guessed.
				System.out.println("Well done that took " + counter + " guesses");
				//This will congratulate the user on guessing the correct number and will then print how many guesses it took them to achieve this in the terminal of the IDE.
				a=false;
				//This will store the value false in the variable 'a' in turn ending the while loop and ending the program.
			}
			else if(guess>number){
				//If the user's guess is bigger than the generated number, this else if statement will occur.
				System.out.println("Your guess is too high");
				//This will print "Your geuss is too high" to the terminal of the IDE telling the user to input a smaller number.
				counter++;
				//This will increment the value stored in the variable counter, counting how many guesses the user has made so far.
			}
			else{
				//This will occur if the user's guess is smaller than the generated number.
				System.out.println("Your guess is too low.");
				//This will tell the user that their guess is too low and should enter a larger number.
				counter++;
				//This will increment the value stored in the variable counter, counting how many guesses the user has made so far.
			}
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}
}