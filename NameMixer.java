import java.util.*;
public class NameMixer {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their chosen names.
		System.out.println("Enter your first name >");
		//This asks the user to enter their first name in the terminal of the IDE.
		String name = kb.nextLine();
		//This will take the user's input and store it in the String variable called 'name' using the scanner called kb.
		int namel = name.length();
		//This will measure the length of the user's first name in terms of how many characters it contains and will store this in the integer variable called 'namel'.
		System.out.println("Enter your surname >");
		//This will print "Enter your surname >" to the terminal of the IDE asking the user to input their surname.
		String surname = kb.nextLine();
		//This will store the user's input in the String variable caller 'surname' using the scanner.
		int surnamel = surname.length();
		//This will measure the length of the user's surname in terms of how many characters it contains and will store this in the integer variable called 'surnamel'.
		System.out.println("Hi there " + (surname.substring(0,2))+""+(name.substring(2,(namel))) + " " + (name.substring(0,2))+""+(surname.substring(2,(surnamel))));
		//This will print out the phrase "Hi there" followed by the first two letters of the surname and the letters after the second letter of the first name.
		//Then followed by the first two letters of the first name followed by the letters following the second letter of the second name.
		kb.close();
		//This line will close the scanner 'kb'.
	}
}