import java.util.*;
public class MetricMan {
	static Scanner kb = new Scanner(System.in);
	public static void main(String []args){
		System.out.println("Welcome to metric man - the best converter in town!");
		System.out.println("Choose an option:");
		System.out.println("A - Farenheit to celsius ");
		System.out.println("B - Celcius to fanrenheit");
		System.out.println("C - Miles to Kilometers ");
		System.out.println("D - Kilometers to miles");
		System.out.println("E - Inches to centimeters ");
		System.out.println("F - Centimeters to inches");
		System.out.println("X - Quit Program");
		System.out.print("Your choice > ");
		String choice = kb.nextLine().toUpperCase();
		//This menu system give the user a list of conversions they can make.
		if(choice.equals("A")){
			System.out.print("Enter the number of farenheit > ");
			double uvalue = Double.parseDouble(kb.nextLine());
			System.out.println(uvalue + " farenheit is " + convertFtoC(uvalue) + " Celcius.");
			//This will do the appropriate conversions and print them to the terminal.
		}
		else if(choice.equals("B")){
			System.out.print("Enter the number of celcius > ");
			double uvalue = Double.parseDouble(kb.nextLine());
			System.out.println(uvalue + " celcius is " + convertCtoF(uvalue) + " ferenheit.");
			//This will do the appropriate conversions and print them to the terminal.
		}
		else if(choice.equals("C")){
			System.out.print("Enter the number of miles > ");
			double uvalue = Double.parseDouble(kb.nextLine());
			System.out.println(uvalue + " miles is " + convertMtoK(uvalue) + " kilometers.");
			//This will do the appropriate conversions and print them to the terminal.
		}
		else if(choice.equals("D")){
			System.out.print("Enter the number of kilometers > ");
			double uvalue = Double.parseDouble(kb.nextLine());
			System.out.println(uvalue + " kilometers is " + convertKtoM(uvalue) + " miles.");
			//This will do the appropriate conversions and print them to the terminal.
		}
		else if(choice.equals("E")){
			System.out.print("Enter the number of inches> ");
			double uvalue = Double.parseDouble(kb.nextLine());
			System.out.println(uvalue + " inches is " + convertItoC(uvalue) + " centimeters.");
			//This will do the appropriate conversions and print them to the terminal.
		}
		else if(choice.equals("F")){
			System.out.print("Enter the number of centimeters > ");
			double uvalue = Double.parseDouble(kb.nextLine());
			convertCtoI(uvalue);
			System.out.println(uvalue + " centimeters is " + convertCtoI(uvalue) + " inches.");
			//This will do the appropriate conversions and print them to the terminal.
		}
		else{
			System.out.println("Goodbye!");
			//If the user wishes to end the program, the program will print goodbye to the user and end.
		}
	}
	static double convertFtoC(double uvalue){
		double k = (uvalue -32) * 5/9 ;
		//This will conver their input to celcius.
		return k;
	}
	static double convertCtoF(double uvalue){
		double k = (uvalue * 9/5) + 32;
		//This will conver their input to farenheit.
		return k;
	}
	static double convertMtoK(double uvalue){
		double k = (uvalue*1.609);
		//This will conver their input to kilometers.
		return k;
	}
	static double convertKtoM(double uvalue){
		double k = (uvalue /1.609);
		//This will conver their input to miles.
		return k;
	}
	static double convertItoC(double uvalue){
		double k = (uvalue *  2.54);
		//This will conver their input to centimeters.
		return k;
	}
	static double convertCtoI(double uvalue){
		double k = (uvalue/2.54);
		//This will conver their input to inches.
		return k;
	}
}
