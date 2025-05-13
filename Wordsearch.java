import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
public class Wordsearch {
	public static void main(String[] args)throws Exception {
		Scanner kb = new Scanner(System.in);
		FileReader fr = new FileReader("7C_Wordsearch.txt");
		BufferedReader br = new BufferedReader(fr);
		//The file reader, allows the buffered reader to be used to read in every line of the file 7C_Wordsearch.txt.
		System.out.print("Enter your chosen word > ");
		//This tells the user to enter their desired word which will be searched for.
		String word = kb.nextLine();
		//This stores their word in the String variable called 'word'.
		System.out.println("Looking for the word " + word);
		//This tells the user that the program is searching for theor word.
		int total = 0;
		//This creates an integer variable and stores the value 0 in it for later use.
		String line[] = new String[300];
		//This array accounts for each line of the file.
		for(int i = 0; i< line.length;i++){
			line[i]=br.readLine();
			//This will store the word in the positioned array.
			if(line[i].equals(word)){
				total=total+1;
				//If the word is found, the value in total is incremented.
			}
		}
		System.out.println("The word " + word + " appeares " + total + " times!");
		//This will tell the user how many times their word appears.
		kb.close();
		fr.close();
		br.close();	
	}
}
