public class Flipper3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		//This integer i created will be responsible for counting how many times the coin is flipped.
		int counterH = 0;
		//This integer (counterH) will be responsible for conting how many times the coin will land on heads.
		while(counterH<3){
			//This while loop will only occur if the integer stored in counterH is less than 3
			int num = (int)(Math.random()*2+1);
			//Each time the loop repeats a random number between 1 and 2 will be generated and stored in the integer variable num.
			counter++;
			//This will increase the counter each time this happens to count how many times a number is generated before you get 3 heads in a row.
			if(num==1){
				//This if statement will only occur if the randomly generated number is 1.
				System.out.println("Heads");
				//This will print the word "Heads" to the terminal, telling the user which side the coin has landed on.
				counterH++;
				//This will increment the number stored in counterH.
			}
			else{
				//This will occur if the randomly generated number is equal to 1.
				System.out.println("Tails");
				//This will print the word tails to the terminal of the IDE telling the user which side the coin landed on.
				counterH=0;
				//This will make the integer stored in counterH equal to zero as this wont be the second or third heads generated consectively.
			}			
		}
		System.out.println("Three in a row! That took " + counter + " flips.");
		//This will tell the user how many times the coin was flipped until three consecutive heads were made.
	}
}