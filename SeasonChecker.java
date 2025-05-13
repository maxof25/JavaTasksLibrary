import java.util.*;
//First i begin this class by importing java utilities. This contains all of the available utilities and will help when importing the scanner for the keyboard later on in the program.
public class SeasonChecker {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		//I then create a new scanner for which will be used for reading the users inputs to the terminal via the keyboard when the program is running.
		//I named this scanner 'kb' as it stands for keyboard for which the program will scan when the user has entered their chosen day and month.
		System.out.println("Enter day >");
		//This will print "Enter day >" to the terminal of the IDE telling the user to enter their chosen day.
		String d = kb.nextLine();
		//This will use the scanner, kb, to store what the user has entered to the terminal in the variable d.
		int day = Integer.parseInt(d);
		//This will parse what was stored in the String variable d to the integer variable day ready for use later in the program.
		System.out.println("Enter month >");
		//This will print "Enter month >" to the terminal of the IDE telling the user to enter their chosen month.
		String m = kb.nextLine();
		//This will use the scanner, kb, to store what the user has entered to the terminal in the variable m.
		int month = Integer.parseInt(m);
		//This will parse what was stored in the String variable m to the integer variable month ready for use later in the program.
		System.out.println("The date is " + day + "/" + month);
		//This will print out the date the user has input to the terminal of the IDE.
		if(((month==12)&&(day>=16&&day<=31))||((month==1)&&(day>=1&&day<=31))||((month==2)&&(day>=1&&day<=31))||((month==3)&&(day<=15))){
			//This if statement will occur when the entered date is within the season of Winter(from the 16/12 to the 15/3)
			System.out.println("That falls in Winter!");
			//This will print "That falls in Winter!" to the termianl of the IDE telling the user that their entered date is in the season of Winter.
		}
		else if(((month==3)&&(day>=16&&day<=31))||((month==4)&&(day>=1&&day<=31))||((month==5)&&(day>=1&&day<=31))||((month==6)&&(day<=15))){
			//This else if statement will occur when the entered date is within the season of Spring(from the 16/3 to the 15/6)
			System.out.println("This falls in Spring!");
			//This will print "That falls in Spring!" to the termianl of the IDE telling the user that their entered date is in the season of Spring.
		}
		else if(((month==6)&&(day>=16&&day<=31))||((month==7)&&(day>=1&&day<=31))||((month==8)&&(day>=1&&day<=31))||((month==9)&&(day<=15))){
			//This if statement will occur when the entered date is within the season of Summer(from the 16/6 to the 15/9)
			System.out.println("This falls in Summer!");
			//This will print "That falls in Summer!" to the termianl of the IDE telling the user that their entered date is in the season of Summer.
		}
		else{
			//This if statement will occur when the entered date is within the season of Autumn(from the 16/9 to the 15/12)
			System.out.println("This falls in Autumn!");
			//This will print "That falls in Autumn!" to the termianl of the IDE telling the user that their entered date is in the season of Autumn.		
		}
	kb.close();
	//This line will close the scanner 'kb'.
	}
}