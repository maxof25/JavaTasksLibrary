import java.util.*;
public class NumberPlate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their chosen sentence.
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//This stores the alphabet in the String variable alphabet.
		System.out.print("Here is your registration plate: ");
		for(int i = 0; i<8;i++){
			//This for loop creates an integer called i and stores the number 0 in it. This will loop as long as i is less than 8 and increments each time.
			if(i==0||i==1||i==5||i==6||i==7){
				//If the number stored in 'i' is 0, 1, 5, 6 or 7 this if statement will occur.
				int a = (int)(Math.random()*25+0);
				//This will generate a random letter between 0 and 25 and store it in the variable a.
				System.out.print(alphabet.charAt(a));
				//This will print out a randomly generated letter from the string variable alphabet each time the if statement occurs.
			}
			else{
				System.out.print((int)(Math.random()*9+0));
				//This will print out a rondomly generated number between 0 and 9.
			}
			}
	}
}
