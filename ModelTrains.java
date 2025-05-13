import java.io.*;
public class ModelTrains {
	public static void main(String[] args)throws Exception {
		FileReader fr = new FileReader("7I_Trains.csv");
		BufferedReader br = new BufferedReader(fr);
		String []item = new String[5];	
		String line = br.readLine();
		String []temparray = line.split(",");
		for(int h = 0; h < 4; h++){
			System.out.println("\nTrain Number " + (h+1));	
			//This will tell the user what train will be printed.
			for(int i = 0; i < item.length; i++){		
				item[i] = temparray[i];
				//This will store each item in the array
			}
			if(h<3){
				line = br.readLine();
				temparray = line.split(",");
				//This will store the items of the table in the
				//temparray on the next row.
			}
			else{
				temparray = line.split(",");
			}
			System.out.println("Type: " + item[0]);
			System.out.println("Colour: " + item[1]);
			System.out.println("Value: " + item[2]);
			System.out.println("Marker: " + item[3]);
			System.out.println("Status: " + item[4]);
			//This will print the contents of the table in order.
		}
		fr.close();
		br.close();
	}
}
