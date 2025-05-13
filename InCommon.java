import java.util.*;
public class InCommon {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their chosen number.
		System.out.println("Enter Sentence 1");
		//This will ask the user to enter their first sentence.
		String s1 = kb.nextLine();
		//This will store the user's answer from the IDE to the String variable S1.
		System.out.println("Enter Sentence 2");
		//This will ask the user to enter their second sentence.
		String s2 = kb.nextLine();
		//This will store the user's answer from the IDE to the String variable S2.
		int l1 = s1.length();
		//This will take the length of the first sentence and store the value in the integer variable l1.
		int l2 = s2.length();
		//This will take the length of the second sentence and store the value in the integer variable l2.
		System.out.print("The letters in common are : ");
		for(int i = 0; i < l1; i++){
			//This for loop will repeat as long as 'i' is smaller than the length of the first sentence. 
			for(int j = 0; j < l2; j++){
				//This for loop will repeat as long as 'j' is smaller than the length of the second sentence.
				if(s1.charAt(i)==s2.charAt(j)){
					//If the letter of place 'i' is the same as that of 'j' then this will occur.
					System.out.print(s1.charAt(i));
					//This will print the similar letter to the terminal of the IDE.
				}
			}
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}
}
