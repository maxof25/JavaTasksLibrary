import java.io.*;
import java.util.*;
public class LetterCount {
	public static void main(String[] args) throws Exception {
		Scanner kb = new Scanner(System.in);
		FileReader fr = new FileReader("7B_Batch.txt");
		BufferedReader br = new BufferedReader(fr);
		//The file reader, allows the buffered reader to be used to read in every line of the file 7B_Batch.txt.
		String line[] = new String[250];
		//This array will store each letter contained within the file.
		int total = 0;
		//This variable acts as a counter to count how many of the desired letter is in the file.
		System.out.print("What letter do you wish to count? > ");
		//This asks the user for what letter they want to count.
		String letter = kb.nextLine();
		//The user's letter is stored in the String variable 'letter'.
		for(int i = 0; i < 250; i++){
			//This for loop counts for all of the lines in the file.
			line[i] = br.readLine();
			//This will read the letter countained within the line of the file and store it in the array previously established.
			if(line[i].equals(letter.toUpperCase())||line[i].equals(letter.toLowerCase())){
				//If the read letter is the same as the user's the following will happen.
				total=total+1;
				//The counter will increment for how many times the letter appears.
			}
		}
		System.out.println("Counting how many " + letter + "s' in the file...");
		System.out.println("I found " + total + " " + letter + "s' in the file");
		//This will tell the user how many times their letter appears in their file.
		kb.close();
		fr.close();
		br.close();	
	}
}