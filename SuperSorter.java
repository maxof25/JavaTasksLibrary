import java.util.*;
public class SuperSorter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		boolean a = true;
		String []nameArray = {"Superman", "Batman", "Hulk", "Thor", "Iron Man", "Deadpool", "Groot"};
		double []strengthArray = {5,1,10,6,2,3,4};
		boolean []availableArray = {true, true, true, false, true, true, false};
		for(int i = 0; i < 7; i++){
			System.out.printf("%-12s", nameArray[i] );
			System.out.printf("%-5s", strengthArray[i] );
			System.out.println( availableArray[i] );
			//This outputs the table of results to the terminal of the IDE.
		}
		while(a==true){
			System.out.println("How do you wish to sort?");
			System.out.println("A, Name");
			System.out.println("B, Strength");
			System.out.println("C, Availibility");
			System.out.println("D, Quit");
			String answer = kb.nextLine().toUpperCase();
			//This asks the user for how they wish to sort the set of results.
			if (answer.equals("A")){
				for(int i = 0; i < 7; i++){
					for(int j = 0; j < 7; j++){
						if(nameArray[i].compareTo(nameArray[j])<0){
							String temps = nameArray[i];
							nameArray[i] = nameArray[j];
							nameArray[j] = temps;
							//This will sort the array alphabetically.
							double tempd = strengthArray[i];
							strengthArray[i] = strengthArray[j];
							strengthArray[j] = tempd;
							//This rearanges the strength value to fit with their new place in the array.
							boolean tempb = availableArray[i];
							availableArray[i] = availableArray[j];
							availableArray[j] = tempb;
							//This will do the same to the availibility as with the strength.
						}
					}
				}
				for(int i = 0; i < nameArray.length; i++){
					System.out.printf("%-12s", nameArray[i] );
					System.out.printf("%-5s", strengthArray[i] );
					System.out.println( availableArray[i] );
					//This print the new set of values to the terminal of the IDE.
				}
			}
			else if(answer.equals("B")){
				for(int i = 0; i < 7; i++){
					for(int j = 0; j < 7; j++){
						if(strengthArray[i]>strengthArray[j]){
							double tempd = strengthArray[i];
							strengthArray[i] = strengthArray[j];
							strengthArray[j] = tempd;
							//This will sort the array in terms of strength.
							String temps = nameArray[i];
							nameArray[i] = nameArray[j];
							nameArray[j] = temps;
							//This rearanges the name value to fit with their new place in the array.
							boolean tempb = availableArray[i];
							availableArray[i] = availableArray[j];
							availableArray[j] = tempb;
							//This will do the same to the availibility as with the strength.
						}
					}
				}
				for(int i = 0; i < 7; i++){
					System.out.printf("%-12s", nameArray[i] );
					System.out.printf("%-5s", strengthArray[i] );
					System.out.println( availableArray[i] );
					//This print the new set of values to the terminal of the IDE.
				}
			}
			else if(answer.equals("C")){
				for(int i = 0; i < 7; i++){
					for(int j = 0; j < 7; j++){
						if((availableArray[i]==true)&&(availableArray[j]==false)){
							double tempd = strengthArray[i];
							strengthArray[i] = strengthArray[j];
							strengthArray[j] = tempd;
							//This will rearange the names to fit the avalibility.
							String temps = nameArray[i];
							nameArray[i] = nameArray[j];
							nameArray[j] = temps;
							//This rearanges the name value to fit with their new place in the array.
							boolean tempb = availableArray[i];
							availableArray[i] = availableArray[j];
							availableArray[j] = tempb;
							//This will sort the array in terms of availibilty.
						}
					}
				}
				for(int i = 0; i < 7; i++){
					System.out.printf("%-12s", nameArray[i] );
					System.out.printf("%-5s", strengthArray[i] );
					System.out.println( availableArray[i] );
					//This print the new set of values to the terminal of the IDE.
				}
			}
			else{
				System.out.print("Goodbye!");
				//This says goodbye to the user.
				a = false;
				//This will end the program.
			}
		}
		kb.close();
		//This will close the Scanner, 'kb'.
	}
}