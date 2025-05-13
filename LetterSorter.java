import java.util.*;
public class LetterSorter {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = kb.nextLine();
		char letter[] = new char[word.length()];
		for(int i = 0; i < word.length(); i ++){
			letter[i]=word.charAt(i);
		}
		//This stores the letters of the entered word into an array of characters.
		for(int i = 0; i < word.length(); i++){
			for(int j = 0; j < word.length(); j++){
				if(letter[i]<letter[j]){
					char tempc = letter[i];
					letter[i] = letter[j];
					letter[j] = tempc;
					//This sorts the values in alpahbetical order
				}
			}
		}
		System.out.print("Sorted! ");
		for(int i = 0; i < word.length(); i++){
			System.out.print(letter[i] + " ");
		}
		//This tells the user that their letters have been sorted and outputs the sorted letters to the terminal of the IDE.
		kb.close();
		//This closes the scanner, 'kb'.
	}

}
