import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
public class NameCascade {
	public static void main(String[] args)throws Exception {
		Scanner kb = new Scanner(System.in);
		FileReader fr = new FileReader("name.txt");
		BufferedReader br = new BufferedReader(fr);
		//The file reader, allows the buffered reader to be used to read in every line of the name.txt.
		String name = br.readLine().toUpperCase();
		//This will read the line of the file and store it in the String variable called 'name' as well as convert it to upper case.
		System.out.println("Lets cascade your name!");
		//This tells the user that their name will be printed subsequently.
		for(int i = 0; i < name.length();i++){
			System.out.println(name.charAt(i));
			//This will print each letter of the name on concurrent lines.
		}
		kb.close();
		fr.close();
		br.close();	
	}
}
