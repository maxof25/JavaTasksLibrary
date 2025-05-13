import java.util.*;
public class PhoneNumberMaker {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their chosen response.
		boolean a = true;
		//I create a boolean variable called 'a' and store the variable true in it for later use in the program.
		while(a==true){
			//This while loop will repeat so long as the value stored in the variable 'a' is true.
			System.out.print("Your phone number is : 07");
			//This will print the first two numbers of the phone number to the terminal as these will always be the same and never change.
			for(int i = 0; i < 9; i++){
				//As there are 9 remaining numbers in the phone number, this for loop will repeat 9 times.
				int x = (int)(Math.random()*10);
				//This will generate a random number between 0 and 10 and store it in the variable 'x'.
				System.out.print(x);
				//This will print the randomly generated number to the terminal of the IDE.
			}
			System.out.println("\nWould you like to go again?(Y/N)");
			//This asks the user if they wish to go again.
			String ans = kb.nextLine().toUpperCase();
			//This will store the users reponse in the String variable 'ans' and convert it to upper case
			if(ans.equals("N")){
				//If the response from the user is equal to "N" this will occur.
				System.out.println("Ok, goodbye");
				//This will bid the user farewell notifying them that they have chosen to end the program.
				a=false;
				//This will end the while loop as 'a' no longer equals true.
			}
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}
}
