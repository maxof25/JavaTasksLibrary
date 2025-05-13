import java.util.*;
public class MagicWord {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their input.
		boolean a =true;
		//I create a boolean variable called 'a' which is store the value true in for later use.
		while(a==true){
			//This while loop will only reoeat as long as the value stored in 'a' is true.
			System.out.println("What is your name?");
			//This will print "What is your name?" to the terminal of the IDE asking the user to enter their name.
			String name = kb.nextLine();
			//This will store the user's input in the String variable 'name' using the scanner called 'kb'.
			System.out.println("Pick your number (1 - 7)");
			//This will print "Pick your number (1 - 7)" to the terminal of the IDE asking the user to enter how many times they wish for their name to be repeated.
			String n = kb.nextLine();
			//This will store the user's input in the String variable called 'n' using the scanner 'kb'.
			int number = Integer.parseInt(n);
			//This will parse the value stored in the variable 'n' to the integer variable called 'number'
			for(int i = 0; i < number; i++){
				//This for loop will repeat as long as the value stored in i is lower than the user's numer.
				//It is incremented each time the loop repeats.
				if(i%2==0){
					//This if statement will occur as long as the value stored in 'i' is even.
					System.out.println(name.toUpperCase());
					//This will print the user's entered name in upper case to the terminal of the IDE.
				}
				else{
					//If the value stored in the variable 'i' is odd then this will occur.
					System.out.println(name.toLowerCase());
					//This will print the user's name to the terminal of the IDE in the lower case.
				}
			}
			System.out.println("What is the magic word?");
			//This will ask the user to enter the magic word to stop the loop.
			String answer = kb.nextLine();
			//This will take the user's input and store it in the String variable called 'answer'.
			if(answer.equals("fishcakes")){
				//This if statement will occur if the user has entered the correct magic word.
				System.out.println("Correct! Bye Bye!");
				a = false;
				//This will end the while loop and the program as a whole.
			}
			else{
				//If the user's answer is incorrect, this will occur.
				System.out.println("Wrong! Here we go again");
				//This will tell the user that their answer is not the magic word and the program repeats.
			}
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}
}
