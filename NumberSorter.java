import java.util.Scanner;
public class NumberSorter {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their chosen numbers.
		int []input = new int[5];
		//Here i have created an integer array which will have an index of 5 as there are five numbers to be stored.
		for(int i = 0; i < 5; i ++){
			//This for loop will repeat until the value stored in i is equal to 4.
			System.out.print("Enter number #" + (i+1) + " > ");
			//This will thell the user to enter their chosen numbers.
			input[i] = Integer.parseInt(kb.nextLine());
			//This will store the user's input to the terminal to the array in its corresponding index.
		}
		for(int i = 0; i < 5; i++){
			//This for loop will repeat 5 time as well, until i = 4.
			for(int j = 0; j < 5; j++){
				//This for loop will repeat 5 time as well, until j = 4.
				if(input[i]>input[j]){
					//This will compare each stored integer to each other.
					int temp = input[i];
					//Here a temporary variable is created and the value in the input array of index i is stored in temp.
					input[i] = input[j];
					//Here the value stored in input[j] is stored in input[i].
					input[j] = temp;
					//Here the value in the temporary variable is stored in input[j].
					//This will in turn sort the vvalues stored in the array in descending order

				}
			}
		}
		System.out.print("Sorted! ");
		//This tells the user that the values have been sorted.
		for(int i = 4; i > -1; i--){
			System.out.print(input[i] + " ");
			//This will print the values in ascending order.
		}
		kb.close();
		//This closes the Scanner, 'kb'.
	}
}