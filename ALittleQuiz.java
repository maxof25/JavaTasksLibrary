import java.util.*;
public class ALittleQuiz {
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Are you ready for the quiz? >");
		String ans = kb.nextLine();
		if(ans.equals("yes")||ans.equals("y")){
			System.out.println("You scored " + Quiz() + "!");
		}
	}
	public static int Quiz(){
		int score = 0;
		System.out.println("Q1) What is the capital of Alaska?");
		System.out.println("	1) Melbourne");
		System.out.println("	2) Anchorage");
		System.out.println("	3) Juneau");
		int answer1 = Integer.parseInt(kb.nextLine());
		if(answer1 == 3){
			System.out.println("Thats Correct!");
			score =  score + 1;
		}
		else{
			System.out.println("Incorrect!");
			System.out.println("The answer is Junea");
		}
		System.out.println("Q2) Can you store the value 'cat' in a variable of type int?");
		System.out.println("	1) Yes");
		System.out.println("	2) No");
		int answer2 = Integer.parseInt(kb.nextLine());
		if(answer2 == 2){
			System.out.println("Thats Correct!");
			score =  score + 1;
		}
		else{
			System.out.println("Incorrect!");
			System.out.println("Sorry, 'cat' is a string. ints can only store numbers.");
		}
		System.out.println("Q3) What is the result of 9+6/3?");
		System.out.println("	1) 5");
		System.out.println("	2) 11");
		System.out.println("	3) 15/3");
		int answer3 = Integer.parseInt(kb.nextLine());
		if(answer3 == 2){
			System.out.println("Thats Correct!");
			score =  score + 1;
		}
		else{
			System.out.println("Incorrect!");
			System.out.println("The answer is 11");
		}
		return score;
	}
}
