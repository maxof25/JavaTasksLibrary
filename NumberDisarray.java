import java.util.*;
public class NumberDisarray {
	public static void main(String[] args) {
		Scanner kb  = new Scanner(System.in);
		int []numbers = new int[5];
		String []linearr = new String[numbers.length];
		String splitter = ",";
		int total = 0;
		System.out.println("Enter the numbers");
		String num = kb.nextLine();
		for(int i = 0; i < numbers.length; i++){
			linearr = num.split(splitter);
			numbers[i] = Integer.parseInt(linearr[i]);
		}
		for(int i = 0; i < numbers.length; i++){
			total = total+numbers[i];
		}
		double average = total/numbers.length;
		System.out.println("The average is " + average);
		int lcounter = 0;
		int hcounter = 0;
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i]<average){
				lcounter++;
				if(i==(numbers.length-1)){
					System.out.println(lcounter + " below the average");
				}
				System.out.print(numbers[i]);
			}
			else if(numbers[i]>average){
				hcounter++;
				if(i==1){
					System.out.println(lcounter + " above the average");
				}
				System.out.print(numbers[i]);
				
			}
		}
	}

}
