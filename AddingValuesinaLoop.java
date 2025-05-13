import java.util.*;
public class AddingValuesinaLoop {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		boolean a = true;
		int total = 0;
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		System.out.println("I will add the numbers you give me.");
		while(a == true){
			System.out.println("Number: ");
			int num = Integer.parseInt(kb.nextLine());
			numbers.add(num);
			total = total + num;
			if(num==0){
				System.out.println("The total is " + total);
				a=false;
			}
			else{
				System.out.println("The total so far is " + total);
			}
		}
		kb.close();
	}
}
