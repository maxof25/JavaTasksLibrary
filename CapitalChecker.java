import java.util.*;
public class CapitalChecker {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String capital[] = {"London", "Moscow"};
		//Here i create a String array with an index of 1, containinf the strings "London" and "Moscow".
		String country[] = {"England", "Russia"};
		//Here i create a String array with an index of 1, containinf the strings "England" and "Russia".
		System.out.print("Please enter the capital city > ");
		//Here i ask the user to enter their chosen capital city to the terminal of the IDE.
		String answer = kb.nextLine();
		//I then store the response in the String variable called answer.
		System.out.print("Working out the country...");
		//I notify the user that thier response is being processed.
		if(answer.equals(capital[0])){
			//If their response is equal to the first index of the array 'capitol' the following will occur.
			System.out.println("\n" + capital[0] + " is the capital city of " + country[0]);
			//This will tell the user the country that their input resides in.
		}
		else{
			//If their response is equal to the second index of the array 'capitol' the following will occur.
			System.out.println("\n" + capital[1] + " is the capital city of " + country[1]);
			//This will tell the user the country that their input resides in.
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}
}
