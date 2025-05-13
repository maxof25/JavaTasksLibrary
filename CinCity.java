import java.util.*;
public class CinCity {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		boolean a =true;
		String letter[]={"A","B","C","D","E","F","G","H"};
		//This array will store the letter for which will demonstrate the row for which the seats are placed.
		String[][]seat = new String[8][12];
		String [][]sname= new String[8][12];
		//These will be used to store the amount of rows and columns to the corresponding seat numbers.
		for (int i = 0; i < 8; i ++){
			//This will loop 8 times as there are 8 rows.
			for (int j = 1; j <= 12; j ++){
				//This will loop 12 times as there are 12 columns.
				seat[i][j-1] = letter[i]+j;
				//This will store the letter for the row and number for the column in the corresponding array.
			}
		}
		while(a==true){
			//This will occur while the value in 'a' is true.
			for (int i = 0; i < 8; i ++){
				//This will loop 8 times as there are 8 rows.
				for (int j = 1; j <= 12; j ++){
					//This will loop 12 times as there are 12 columns.
					System.out.print(seat[i][j-1]+" ");
					//This will print all the available seats in the auditorium of the cinema.
				}
				System.out.println();
				//This is responsible for creatting rows.
			}
			boolean b =true;
			while(b==true){
				//This will loop while the value in 'b' is true.
				String chair = kb.nextLine();
				//This will take the users input for their desired chair.
				int index = 0;
				//This will create a variable which will be used later in the program to store the array's index.
				for (int i = 0; i< 8; i++){
					if(chair.charAt(0)==letter[i].charAt(0)){
						//This will occur if the desired seat is eaqual to the seat selected.
						index = i;
						//This will store the index of the array.
						chair = chair.substring(1,  chair.length());
					}
				}
				int chair2 = Integer.parseInt(chair);
				if(seat[index][chair2-1]=="X"){
					//If the seat has already been booked the following will occur.
					System.out.println("Already taken");
					//This will notify the user that their desired chair is already taken.
				}
				else{
					//This will occur if the chair is available.
					b=false;
					//This ends the while loop.
					seat[index][chair2-1]="X";
					//This will change the desired seat to just display "X".
					System.out.println(letter[index]+chair2+" is available and now booked. Please enter your name > "); 
					sname[index][chair2-1] = kb.nextLine(); 
					//This will store the name of the customer.
					System.out.println(letter[index]+chair2+" booked for "+sname[index][chair2-1]); 
					System.out.println("Do you want to book another seat (Y/N)>"); 
					//This asks the user if they wish to repeat the program.
					String answer = kb.nextLine().toUpperCase(); 
					if(answer.equals("N")) { 
						//If the user chooses to end the program the following will occur.
						System.out.println("Goodbye, See you at the movies!"); 
						//This bids the user farewell.
						a=false;
						//This ends the while loop and program.
					}
				}
			}
		}
		kb.close();
		//This closes the scanner, 'kb'.
	}
}