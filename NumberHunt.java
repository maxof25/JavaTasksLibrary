public class NumberHunt {
	public static void main(String[] args) {
		int a[] = new int[20];
		//Here i have created an integer array which will have an index of 20 as there are 20 integers to be stored.
		int counter = 0;
		//I then create this counter for later use in the program.
		for (int i = 0; i < 20; i++){
			//This for loop will create an integer called 'i' which stores 0 in it and increments each loop until it has the value 19.
			a[i] = (int)(Math.random()*40+10);
			//This will generate a new random number between 10 and 40 which will be stored in each index of the array each time the for loop loops.
			if(i==19){
				//If the maximum index has been reached, the following will occur.
				System.out.print(a[i]);
				//This will print the final generated random number.
			}
			else{
				System.out.print(a[i] + "-");
				//This will print out the stored integer followed by a dash to the terminal of the IDE.
			}
		}
		for (int j = 0; j < 20; j++){
			//This for loop will create an integer called 'j' which stores 0 in it and increments each loop until it has the value 19.
			if(a[j]==19){
				//If any of the stored numbers are 19 then this will occur.
				counter++;
				//This will increment the counter.
			}
		}
		if(counter>0){
			//If the counter is bigger than 0 the following will occur.
			System.out.println("\nThis array contains 19!");
			//This will tell the user that the list of integers does contain the value 19.
		}
		else{
			System.out.println("\nThis array does not contain 19!");
			//This will tell the user that the list of integers does not contain the value 19.
		}
	}
}