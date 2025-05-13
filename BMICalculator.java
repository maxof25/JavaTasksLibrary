import java.util.*;
public class BMICalculator {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Your height in m: ");
		String h = kb.nextLine();
		double height = Double.parseDouble(h);
		System.out.print("Your weight in kg: ");
		String w = kb.nextLine();
		int weight = Integer.parseInt(w);
		double BMI = weight/(height*height);
		System.out.println("Your BMI is :" + BMI);
		kb.close();
	}
}
