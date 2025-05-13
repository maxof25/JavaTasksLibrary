import java.util.*;
import java.io.*;
public class LabourMan {
	public static void main(String[] args)throws Exception {
		Scanner kb = new Scanner(System.in);
		FileWriter fw = new FileWriter("7E_wage.txt", true);	
		//The file writer, this will generate the text file called 7E_wage.txt which will be written to.
		System.out.print("Enter your name> ");
		//This tells the user to enter their name for the wage slip.
		String name= kb.nextLine();
		//This stores the name in the String variable called 'name'.
		System.out.print("Enter hours worked> ");
		//This tells the user to enter how many hours they worked.
		int hours= Integer.parseInt(kb.nextLine());
		//This stores the number of hours in the integer variable called 'hours'.
		double wage = hours*9.5;
		//This stores the total salary in the double variable called wage.
		fw.write("==========Salary Slip==========\n");
		fw.write("Employee: " + name + "\n");
		fw.write("Company: CompSci Industrial \n");
		fw.write("===============================\n");
		fw.write("Hours Worked: " + hours + "\n");
		fw.write("Hourly Rate: $9.50 \n");
		fw.write("Total Salary: $" + wage + "\n");
		fw.write("===============================\n");
		//This will generate the wage slip in the created text file.
		System.out.print("***Wage Slip generated - now get back to work!");
		//This notifies the user that their wage slip has been generated.
		kb.close();
		fw.close();
	}
}
