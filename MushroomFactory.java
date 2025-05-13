import java.io.BufferedReader;
import java.io.FileReader;
public class MushroomFactory {
	public static void main(String[] args)throws Exception {
		FileReader fr = new FileReader("7J_Mushrooms.csv");
		BufferedReader br = new BufferedReader(fr);
		String []mushroom= new String[10];	
		int []weight = new int[10];	
		String []cooking = new String[10];	
		String line = br.readLine();
		String []temparray = line.split(",");
		//This creates all the arrays where the information about each mushroom will be stored.
		//I then read in the first line of the table and store it in temparray.
		for(int h = 0; h< 10; h++){
			//This for loop will loop 10 times as there are 10 rows in the table.
			for(int i = 0; i < 30; i++){	
				//This for loop will loop 30 times as there are 30 pieces of information in the table.
				if((i%3)==0){
					mushroom[h]=temparray[0];
					//This stores the first items for each row in the mushroom array (used for names).
				}
				else if(((i-1)%3)==0){
					//This stores the second items for each row in the weight array (used for the weights).
					weight[h]=Integer.parseInt(temparray[1]);

				}
				else if((i+1)%3==0){
					//This stores the third item of each row in the cooking array (used for the cooking column).
					cooking[h]=temparray[2];					
				}
			}
			if(h<9){
				line = br.readLine();
				temparray = line.split(",");
				//This will read in the next line for the table and store each item in the array 'temparray'
			}
			else{
				temparray = line.split(",");
			}
		}
		System.out.printf("%-24s","Mushroom");
		System.out.printf("%-5s", "Weight" );
		System.out.printf("\t cooking" );
		System.out.println("\n==============================================");
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				if(weight[i]<weight[j]){
					int tempd = weight[i];
					weight[i] = weight[j];
					weight[j] = tempd;
					String temps = mushroom[i];
					mushroom[i] = mushroom[j];
					mushroom[j] = temps;					
					String tempb = cooking[i];
					cooking[i] = cooking[j];
					cooking[j] = tempb;
					//This sorts the mushrooms by weight in ascending order with its respected items.
				}
			}
		}
		for(int i = 0; i < 10; i++){
			System.out.printf("%-24s", mushroom[i] );
			System.out.printf("%-5s", weight[i] );
			System.out.println("\t " +cooking[i] );
			//This will print the contents of the new table to the terminal.
		}
		fr.close();
		br.close();
	}
}