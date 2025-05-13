public class ArrayAverages {
	public static void main(String[] args) {
		double a[] = new double [30];
		//Here i create a double array with an index of 30.
		double sum = 0;
		//Here i create a double variable that stores the value 0 in it.
		System.out.println("Generating numbers...");
		//This tells the user that the random numbers are being generated.
		for(int i = 0; i < 30; i++){
			//This for loop will repeat 30 times.
			a[i] = ((int)(Math.random()*((100-25)+1))+25);
			//This will create a random number between 25 and 100 and store it in the array.
		}
		for(int j = 0; j < 30; j++){
			sum = sum+a[j];
			//This will add all of the generated numbers together and store the total in the variable 'sum'.
		}
		System.out.println("The average is " + sum/30);
		//This will divide the sum of the numbers by 30 and output the average to the terminal of the IDE.
	}
}
