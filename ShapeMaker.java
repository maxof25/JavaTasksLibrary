import java.util.*;
public class ShapeMaker {
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to shapemaker!");
		System.out.println("Enter 1 for a triangle");
		System.out.println("Enter 2 for a square");
		System.out.println("Enter 3 for a rectangle");
		System.out.println("Enter X to stop");
		System.out.print("Your choice > ");
		String answer = kb.nextLine().toUpperCase();
		//The user's choice will be stored in the variable answer.
		if(answer.equals("1")){
			Triangle();
			//If they entered "1" the method Triangle() will occur.
		}
		else if(answer.equals("2")){
			Square();
			//If they entered "2" the method Square() will occur.
		}
		else if(answer.equals("3")){
			Rectangle();
			//If they entered "3" the method Rectangle() will occur.
		}
		else{
			System.out.println("Goodbye!");
			//If the user inputs "X" or an invalid input, the program will end.
		}
	}
	static void Triangle(){
		System.out.print("Enter the triangle's base > ");
		int base = Integer.parseInt(kb.nextLine());
		//This will store the base of the triangle in the integer variable called "base".
		System.out.println("Here you go >");
		for(int i = 1; i <= base ; i ++){
			for(int k = base; k > i; k--){
				System.out.print(" ");
			}
			for(int j = 0; j < (2*i-1) ; j++){
				System.out.print("*");

			}
			System.out.println("");
		}
		//The three for loops will print a triangle with a base equal to the user's input.
		main(null);
		//This will return to the main method when it is completed.
	}
	static void Square(){
		System.out.println("How big is the square? > ");
		int size = Integer.parseInt(kb.nextLine());
		//This will store the dimension of the square in the integer variable called "size".
		System.out.println("Here you go > ");
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				System.out.print("* ");
			}
			System.out.println("");
		}
		//The two for loops will print a square with a base and width equal to the user's input.
		main(null);
		//This will return to the main method when it is completed.
	}
	static void Rectangle(){
		System.out.print("What is the base of your rectangle? > ");
		int base = Integer.parseInt(kb.nextLine());
		System.out.print("What is the width of your rectangle? > ");
		int width = Integer.parseInt(kb.nextLine());
		//This will store the dimension of the square in the integer variables called "base" and "width".
		for(int i = 0; i < width; i++){
			for(int j = 0; j < base; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		//The two for loops will print a rectangle with a base and width equal to the user's inputs.
		main(null);
		//This will return to the main method when it is completed.
	}	
}