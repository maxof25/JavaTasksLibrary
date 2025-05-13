import java.util.*;
public class Cryptogram {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their chosen number.
		boolean a = true;
		//Here I have created a boolean variable called 'a' and stored the value true in it for later use in the program.
		while(a==true){
			//This while loop will repeat as long as the value stored in 'a' is true.
			System.out.println("**************************");
			System.out.println("What action to perform?");
			System.out.println("1. Encrypt");
			System.out.println("2. Decrypt");
			System.out.println("3. Terminate");
			//These ask what the user wishes to do with the program (whether they'd like to "encrypt", "decrypt" or "terminate" the program.
			String ch = kb.nextLine();
			//This takes the users response from the terminal of the IDE and stores it in the String variable called 'ch' via the scanner named 'kb'.
			int choice = Integer.parseInt(ch);
			//This will parse the users input from the variable 'ch' to the integer variable 'choice' for later use in the program.
			if(choice==1){
				//If the user chose to encrypt, the following is printed.
				System.out.println("Enter your plaintext >");
				//This will ask the user to input their plaintext to the terminal of the IDE.
			}
			else if(choice==2){
				//If the user chose to decrypt, the following is printed.
				System.out.println("Enter your ciphertext>");
				//This will ask the user to input their ciphertext to the terminal of the IDE.
			}
			String text = kb.nextLine().toUpperCase();
			//This will take the user's input and store it in the String variable called 'text' as well as convert it to upper case.
			if(choice==1){
				//This will occur if the users choice was to encrypt.
				System.out.println("Encoding > " + text);
				//This will tell the user what is about to be encoded.
				System.out.print("Ciphertext > ");
			}
			else if(choice == 2){
				//This will occur if the users choice was to encrypt.
				System.out.println("Decoding > " + text);
				//This will tell the user what is about to be decoded.
				System.out.print("Plaintext > ");
			}
			for(int i = 0; i < text.length(); i++){
				char p = text.charAt(i);
				if((p>='A')&&(p<='M')){
					System.out.print(p+=13);
					//This will output the character 13 letters forward from the letter in the user's input.
				}
				else if((p>='N')&&(p<='Z')){						
					System.out.print(p-=13);
					//This will output the character 13 letters forward from the letter in the user's input.
				}
				else{
					System.out.print(" ");
					//This will print a space if the user's input contains a space.
				}
			}
			System.out.print("\n");
			//This adds an empty line so the program can restart from the top menu.
			if(choice==3){
				//If the user's choice was to terminate the program the following occurs.
				System.out.println("Bye");
				a=false;
				//The program bids the user farewell and ends the while loop, in turn ending the program..
			}
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}
}
