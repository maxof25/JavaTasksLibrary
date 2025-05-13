import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class GreenBottleshangingonthewall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered the number of bottles they want to start with.
		System.out.println("How many bottles are on the wall?");
		//This line will print out "How many bottles are on the wall?" in the terminal of the IDE, asking the user to input the number of bottles they wish to begin with.
		String n = kb.nextLine();
		//This line will store what the user has entered into the terminal in the string variable n.
		int num = Integer.parseInt(n);
		//This line will take the value stored in the string varaible n and store it in the integer variable num.
		for (int i = num; i > 0 ; i--){
			//The for loop will create the integer variable i and store the entered number in it. Each time the for loop occurs the values stored in i will decrement.
			System.out.println(i + " green bottles hanging on the wall");
			//This line will print out i followed by " green bottles hanging on the wall" in the terminal of the IDE, telling the user how many bottles now lie on the wall.
			System.out.println(i + " green bottles hanging on the wall");
			//This line will print out i followed by " green bottles hanging on the wall" in the terminal of the IDE, telling the user how many bottles now lie on the wall.
			System.out.println("And if one green bottle shall accidently fall,");
			//This line will print out "And if one green bottle shall accidently fall," in the terminal of the IDE, continuing the song.
			System.out.println("There'll be " + (i-1) + " green bottles hanging on the wall!");
			//This line will print out "There'll be " followed by (i-1) followed by " green bottles hanging on the wall" in the terminal of the IDE, finishing the verse of the song.
			System.out.println();
			//This will leave a line between each of the printed verses, seperating them and presenting them as a song.
		}
		kb.close();
		//This line will close the scanner 'kb'.
	}
}
