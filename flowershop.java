import java.io.*;
import java.util.*;
import java.util.LinkedList;
public class flowershop {
	static Scanner kb = new Scanner(System.in);
	static LinkedList<String> list = new LinkedList<String>();
	public static void main(String[] args) throws IOException{ 
		menu(list);
		//This will call the menu method.
	}
	public static void menu(LinkedList<String>  list) throws IOException{
		System.out.println("Enter what you would like to do.");
		System.out.println("1. Add Flower");
		System.out.println("2. Delete Flower");
		System.out.println("3. Sort Flowers");
		System.out.println("4. Search for a Flower");
		System.out.println("5. Close Program");
		System.out.print("Your Choice > ");
		int ans = Integer.parseInt(kb.nextLine());
		//This will ask the user what they would like to do and stores their input in the variable 'ans'.
		desicion(list, ans);
		//This will load the next method with the parameter containing the linked list and the user's choice.
	}
	public static void desicion(LinkedList<String>  list, int ans) throws IOException{
		if(ans==1){
			add(list);
			print(list);
			menu(list);
			//If the user wishes to add an item, this method be shown.
			//It will then return to this method after the user has finished.
		}
		else if (ans==2){
			delete(list);
			print(list);
			menu(list);
			//If the user wishes to delete an item, this method be shown.
			//It will then return to this method after the user has finished.
		}
		else if (ans==3){
			sorter(list);
			print(list);
			menu(list);
			//If the user wishes to sort the items of the linked list, this method be shown.
			//It will then return to this method after the user has finished.
		}
		else if(ans==4){
			search(list);
			print(list);
			menu(list);
			//If the user wishes to search for an items of the linked list, this method be shown.
			//It will then return to this method after the user has finished.
		}
		else{
			System.out.println("Goodbye!");
			//This will bid the user farewell and the program will end.
		}
	}
	public static LinkedList<String>  add(LinkedList<String>  llflowers){
		System.out.print("How many do you wish to add? > ");
		int num = Integer.parseInt(kb.nextLine());
		for(int i = 0; i < num ; i++){
			System.out.print("Enter the flower you wish to add. > ");
			String flower = kb.nextLine();
			list.add(flower);
		}
		return list;
		//This method will ask the user how many flowers they wish to add to the linked list.
		//It will then store the users inputs in the linked list and return to the menu method.

	}
	public static LinkedList<String> delete(LinkedList<String>  llflowers){
		System.out.println("Which flower do you wish to delete > ");
		String del = kb.nextLine();
		int index = 0;
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).equals(del)){
				index = i;
				i = list.size();
			}
		}
		list.remove(index);
		return list;
		//This will search the linkedlist for the desired flower and store its index.
		//It will then remove the item in the index of the linked list and return the new altered list.
				
	}
	public static LinkedList<String> sorter(LinkedList<String>  llflowers){
		for(int i = 0; i < list.size(); i++){
			for(int j = 0; j < list.size(); j++){
				if(list.get(i).compareTo(list.get(j))<0){
					String temps = list.get(i);
					list.add(i, list.get(j));
					list.add(j, temps);
					//This will sort the array alphabetically.
				}
			}
		}
		print(list);
		return list;
		//This will return the sorted list.
	}

	public static void search(LinkedList<String>  llflowers){
		System.out.println("What would you like to search for? > ");
		String del = kb.nextLine();
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).equals(del)){
				System.out.println("We stock this flower.");
			}
			else if(i==(list.size()-1)){
				System.out.println("We do not stock this flower.");
			}
		}
		//This method searches the linked list for the desired flower. If it is found the user will
		//be notified and if it is not found, the user will be told it is not in stock.
	}
	public static void print(LinkedList<String> llflowers){
		System.out.println("Flowers: ");
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i) );
			System.out.println();
			//This print the new set of values to the terminal of the IDE.
		}
	}

}
