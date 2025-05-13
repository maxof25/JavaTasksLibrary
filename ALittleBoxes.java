import java.util.*;
public class ALittleBoxes {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their chosen responses.
		boolean b = true;
		//Here I have created a boolean variable called 'b' and stored the value true in it for later use in the program.
		while(b==true){
			//This while loop will repeate as long as the value stored in the variable 'b' is true.
			int a[] = new int [5];
			//Here i have created an integer array which will have an index of 5 as there are five numbers to be stored.
			for(int i = 1; i < 6; i++){
				//This for loop will create an integer called 'i' which stores 0 in it.
				System.out.print("Enter number " + i + " > ");
				//This asks the user to enter the corresponding numbers
				a[i-1] = Integer.parseInt(kb.nextLine());
				//This will store the input in the array of index one less than the requested number.
			}
			System.out.println("The average is " + (a[0]+a[1]+a[2]+a[3]+a[4])/5);
			//This will add all the stored integers in the array together and divide the total by five printing the average of the stored values.
			System.out.println("That was fun! Would you like to do that again? (Y/N)");
			//This will ask the user if they would like to repeat the program again.
			String answer = kb.nextLine().toUpperCase();
			//This will store the user's input to the terminal of the IDE in the String variable called 'answer'.
			if(answer.equals("N")){
				//If the entered value is equal to N, this if statement will occur.
				System.out.println("Ok then, goodbye!");
				//This will bid the user farewell, telling them that they have chosen to end the program.
				b=false;
				//This will end the initial while loop, in turn ending the program.
			}
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}
}