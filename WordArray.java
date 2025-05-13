import java.util.*;
public class WordArray {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		boolean a = true;
		//Here I have created a boolean variable called 'a' and stored the value true in it for later use in the program.
		while(a==true){
			//This while loop will repeat so long as the value in variable 'a' is true.
			String longword = "";
			//This will be used to store the word later in the program.
			String shortword = "";
			//This will be used to store the word later in the program.
			int lword = 0;
			//This will be used to store the length later in the program.
			int sword = 0;
			//This will be used to store the length later in the program.
			int l1 =0;
			//This will be used to store the length later in the program.
			int l2 = 100;
			//This will be used to store the length later in the program.
			String []input = new String[5];
			//Here i have created an String array which will have an index of 5 as there are five words to be stored.
			for(int i = 0; i < 5; i ++){
				//This for loop will repeat until the value stored in i is equal to 4.
				System.out.print("Enter word #" + (i+1) + " > ");
				//This will thell the user to enter their chosen word.
				input[i] = kb.nextLine();
				//This will store the user's input to the terminal to the array in its corresponding index.
				int length = input[i].length();
				if(length>(l1)){
					//This will compare each stored String to each other.
					l1=length;
					//The value of length is stored in variable l1.
					longword=input[i];
					//Its length is stored in the variable 'longword'.
					lword = (i+1);
					//This will store the position of the lognest word.
				}
				if(length<(l2)){
					//This will compare each stored String to each other.
					l2 = length;
					//The value of length is stored in variable l2.
					shortword=input[i];
					//Its length is stored in the variable 'shortword'.
					sword=(i+1);
					//This will store the position of the shortest word.
				}
			}
			System.out.println("Word " + lword + " is the largest word: " + longword);
			//This will tell the user the longest word that they have entered.
			System.out.println("Word " + sword + " is the shortest word: " + shortword);
			//This will tell the user the shortest word that they have entered.
			System.out.println("Shall we play this again? (Y/N)");
			//This asks the user if they would like to repeat the program.
			String ans = kb.nextLine().toUpperCase();
			//This stores the input in the String variable 'ans' and convert it to upper case.
			if(ans.equals("N")){
				//If they wish to stop the program, the following will occur.
				System.out.println("Ok then, goodbye!");
				//The program will bid the user farewell.
				a=false;
				//This will store the value false in the variable called 'a', in turn ending the program.
			}
		}
		kb.close();
		//This will close the Scanner, 'kb'.
	}
}
