public class Calculations 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n1  = 70;
		//I first declare the variable of which will be holding a value that is an integer.
	    //I then place the value i wish to store in the variable in n1 (my first number). The value is 70.
		int n2  = 24;
		//I then declare the variable of which will be holding a value that is also an integer (a whole number).
		//I then place the value i wish to store in the variable in n2. The value is 24.
		int n3  = 6;
		//I then declare the variable of which will be holding a value that is an integer (a whole number).
		//I then place the value i wish to store in the variable in n3. The value is 6.
		double n4 = 33.3;
		//I then declare the variable of which will be holding a value that is an double (a decimal number).
		//The value held in the variable n4 is 33.3.
		double t = n1 + n2 + n3 + n4;
		//I declare another variable called t (total) which will be used to store the value of the total of all my numbers.
		//The variable is a double because the product of all my numbers added will evidently be a decimal number due to variable n4.
		double t2 = (t/3);
		//I declare another variable called t2 which will be used to store the value of the total of all my numbers divided by 3.
		//The variable is a double because the product of the total divided by 3 will evidently be a decimal number.
		double t3 = (t2*2);
		//I declare another variable called t3 which will be used to store the value of the total of all my numbers divided by 3 then multiplied by 2.
		//The variable is a double because the product will evidently be a decimal number due to variable n4.
		double t4 = (t3-9);
		//I declare another variable called t4 which will be used to store the value of nine subtracted from the total of all my numbers divided by 3 and multiplied by 2.
		//The variable is a double because the product will evidently be a decimal number due to variable n4.
		System.out.println("Starting numbers = " + n1 + "," + n2 + "," + n3 + "," + n4);
		//This line will print out "Starting numbers = " then the stored value in the variables n1, n2, n3 and n4 in the terminal of the IDE.
		//Between each of the listed variables a "," will be printed.
		System.out.println("Calculation 1 = " + t);
		//This line will print out "Calculation 1 = " then the stored value in the variable t in the terminal of the IDE.
		System.out.println("Calculation 2 = " + t2);
		//This line will print out "Calculation 2 = " then the stored value in the variable t2 in the terminal of the IDE.
		System.out.println("Calculation 3 = " + t3);
		//This line will print out "Calculation 3 = " then the stored value in the variable t3 in the terminal of the IDE.
		System.out.println("Calculation 4 = " + t4);
		//This line will print out "Calculation 4 = " then the stored value in the variable t4 in the terminal of the IDE.
	}
}
