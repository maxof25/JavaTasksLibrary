import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class PlusMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 1;
		Scanner kb = new Scanner(System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their chosen numbers.
		
		System.out.println("Please enter no 1 >");
		//This line will print out "Please enter no 1 >"in the terminal of the IDE, asking the user to input their first number.
		String num1 = kb.nextLine();
		//This line will store what the user has entered into the terminal in the string variable num1.
		int n1 = Integer.parseInt(num1);
		//This line will store the value in the string variable num1 in the string variable n1.
		System.out.println("Please enter no 2 >");
		//This line will print out "Please enter no 2 >"in the terminal of the IDE, asking the user to input their second number.
		String num2 = kb.nextLine();
		//This line will store what the user has entered into the terminal in the string variable num2.
		int n2 = Integer.parseInt(num2);
		//This line will store the value in the string variable num2 in the string variable n2.
		System.out.println("Please enter no 3 >");
		//This line will print out "Please enter no 3 >"in the terminal of the IDE, asking the user to input their third number.
		String num3 = kb.nextLine();
		//This line will store what the user has entered into the terminal in the string variable num3.
		int n3 = Integer.parseInt(num3);
		//This line will store the value in the string variable num3 in the string variable n3.
		int answer = n1+n2+n3;
		//This line will add the values stored in the variables n1, n2 and n3 together and store the product in the variable answer.
		while (s==1){
			//This will occur if the value stored in s is true.
			System.out.println("What is the sum? >");
			//This line will print out "What is the sum? >"in the terminal of the IDE, asking the user to input what they think the answer is.
			String a = kb.nextLine();
			//This line will store what the user has entered into the terminal in the string variable a.
			int ans = Integer.parseInt(a);
			//This line will store the value in the string variable a in the string variable ans.
			if (ans==answer){
				//This if statement will only occur if the entered answer is correct.
				System.out.println("Correct! Well done!");
				//This line will print out "Correct! Well done!" in the terminal of the IDE, telling the user that their input is correct.
				s ++;
				//This will stop the program.
			}
			else{
				//This will occur if the input is not equal to the actual answer.
				System.out.println("Sorry, try again!");
				//This line will print out "Sorry, try again!" in the terminal of the IDE, telling the user that their input is incorrect.
			}
		
			
		}
		kb.close();
		//This line will close the scanner 'kb'.
		
	}

}
