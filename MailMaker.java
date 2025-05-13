import java.io.*;
import java.util.*;
public class MailMaker {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		boolean a = true;
		while(a==true){
			System.out.print("Enter the year > ");
			String year = kb.nextLine();
			//The entered year is stored in the String variable 'year.'
			System.out.print("Enter your first name > ");
			String fname = kb.nextLine();
			//The user's fisrt name is stored in the variable 'name'.
			System.out.print("Enter your last name > ");
			String sname = kb.nextLine();
			//The user's last name is stored in the variable called sname.
			String filename = year.substring(2,4)+sname+fname.charAt(0)+"@mymail.co.uk";
			//This will generate the username for the user.
			FileWriter fw = new FileWriter("7D_mail.txt", true);
			FileReader fr = new FileReader("7D_mail.txt");
			fw.write(filename +"\n");
			//This will print the username to the text file.
			System.out.println("**************Email created. Shall we make another? (Y/N)**************");
			String answer = kb.nextLine().toUpperCase();
			//This asks the user if they wish to repeat the program.
			if(answer.equals("N")){
				System.out.println("Program terminated. Goodbye!");
				fw.close();
				fr.close();
				a=false;
				//If the user enters 'n' then the program will end.
			}
			
		}
		kb.close();

	}
}