import java.util.*;
import java.io.*;
public class Translator {
	public static void main(String[] args)throws Exception {
		Scanner kb = new Scanner(System.in);
		FileWriter fw = new FileWriter("7F_translator.txt", true);	
		//The file writer, this will generate the text file called 7F_translator.txt which will be written to.
		System.out.print("Greetings! Please select either French or Spanish (F/S) > ");
		//This asks the user to input their desired language.
		char language = kb.nextLine().charAt(0);
		//Their choice is stored in the char variable called 'language'.
		System.out.println("File Created! Enjoy!");
		if(language == 'F'){
			//If the user has chosen French, the following will occur.
			fw.write("Thankyou for choosing French \n");
			fw.write("=============================\n");
			fw.write("1. un - one\n");
			fw.write("2. deux - two\n");
			fw.write("3. trois - three\n");
			fw.write("4. quatre - four\n");
			fw.write("5. cinq - five\n");
			fw.write("6. six - six\n");
			fw.write("7. sept - seven\n");
			fw.write("8. huit - eight\n");
			fw.write("9. neuf - nine\n");
			fw.write("10. dix - ten\n");
			fw.write("=============================\n");
			//This will print the numbers form 1 to 10 in French with their English translation to the file.
		}
		else if(language == 'S'){
			//If the user has chosen Spanish, the following will occur.
			fw.write("Thankyou for choosing French \n");
			fw.write("=============================\n");
			fw.write("1. uno - one\n");
			fw.write("2. dos - two\n");
			fw.write("3. tres - three\n");
			fw.write("4. cuatro - four\n");
			fw.write("5. cinco - five\n");
			fw.write("6. seis - six\n");
			fw.write("7. siete - seven\n");
			fw.write("8. ocho - eight\n");
			fw.write("9. nueve - nine\n");
			fw.write("10. diez - ten\n");
			fw.write("=============================\n");
			//This will print the numbers form 1 to 10 in Spanish with their English translation to the file.
		}
		else{
			fw.write("*** Error! Language choice not known");
			//If the user has entered an unkown choice, an error message will be printed to the file.
		}
		kb.close();
		fw.close();
	}
}
