import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class VeryOddNumbers {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their chosen number.
		boolean a = true;
		//Here i create a booolean variable called 'a' and store the value true in it.
		while(a==true){
			//This while loop will repeat as long as the value stored in 'a' is true.
			System.out.println("Enter your 5 digit number >");
			//This will ask the user to input their chosen 5 digit number.
			String n = kb.nextLine();
			//This will store the user's input in the String variable called 'n'.
			int length = n.length();
			//This will measure the length of the number entered in terms of characters contained within it and store it in the variable called length.
			if(length<5||length>5){
				//This will check whether the entered number is the correct length for the program to work.
				System.out.println("Number is invalid");			
				//If it is more or less than 5 characters long, the message "Number is invalid" will be printed.
			}
			else{
				//If the number is of an appropriate length, then the following will occur.
				int counter = 0;
				//This will create an integer variable called 'counter' and store the value 0 in it.
				for(int i = 0; i < 5; i++){
					//This for loop will repeat five times as there are 5 characters in the user's number.
					char c = n.charAt(i);
					//This will store the character in the postion in terms of i in the variable c.
					int digit = c-'0';
					//This will store the taken character as an integer called digit.
					if(digit%2==1){
						//If the digit is odd then the following will occur.
						counter++;
						//The counter will be incremented each time there is an odd number in the user's chosen number.
					}	
				}
				if(counter==5){
					//This will occur if the user's number has 5 odd digits in it.
					System.out.println("This is very odd");
					//The message "This is very odd" will be printed to the terminal of the IDE telling the user that their number is extremely odd.
				}
				else{
					//If there are less than 5 odd digits contained within the user's number, this will occur.
					System.out.println("This is not very odd");
					//The message "This is not very odd" will be printed to the terminal of the IDE.
				}
				System.out.println("Would you like to try another? (Y/N)");
				//This will ask the user if they wish to repeat the program.
				String ans = kb.nextLine().toLowerCase();
				//This will store the user's input in the String variable called 'ans'
				if(ans.equals("n")){
					//If the user's response is no, then the following will occur.
					System.out.println("Ok, goodbye!");
					//The message "OK, goodbye" will be printed to the terminal of the IDE telling the user that the program will end now.
					a=false;
					//This will end the while loop created at the beginning of the program, in turn ending the program.
				}			
			}
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}	
}