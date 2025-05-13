import java.util.*;
public class MathsTrainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
			//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their chosen answers.
		boolean e = true;
		System.out.println("Welcome to Maths Trainer!");
		while(e==true){
			//This will occur whilest the value stored in variable e created at the start of the program is false.
			int n1 = (int)(Math.random()*15+1);
			//This line will get a random number between 1 and 15 and store it in the integer variable n1.
			int n2 = (int)(Math.random()*15+1);
			//This line will get a random number between 1 and 15 and store it in the integer variable n2.
			System.out.println("What is " + n1 + " + " + n2 + " > ");
			//This will ask the user what the sum of the two random numbers are in the terminal of the IDE.
			String a = kb.nextLine();
			//This will use the scanner kb to store what the user has responded in the String variable a.
			int answer = Integer.parseInt(a);
			//This will parse the value in the String variable 'a' to an integer variable called answer.
			if(answer==(n1+n2)){
				//If the answer they have entered is correct this will occur.
				System.out.println("Correct ! Well Done !");
				//This will tell the user that their answer is correct in the terminal of the IDE.
			}
			else{
				//This will occur if the answer they have entered is incorrect.
				System.out.println("Incorrect, the Right answer is: " + (n1+n2));
				//This will tell the user that their answer is wrong and then tell the user the correct answer in the termianl of the IDE.
			}
			System.out.println("Would you like another question? (Y/N)");
			//This line will ask the user if they would like to be asked another question.
			String r = kb.nextLine();
			//This will store their input (Y/N) in the string variable r.
			if(r.equals("Y")){
				//This if statement will occur if the input is equal to Y (yes).
				e = true;
				//This will keep the value in e true, so the while loop continues to occur.
			}
			else{
				//This will occur if the users answer is N (no).
				System.out.println("Ok, adios!");
				//This will say goodbye to the user in the terminal of the IDE.
				e = false;
				//This will store the value false in the boolean variable 'e', causeing the while loop to end, in turn ending the program.
			}
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}
}