import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListGrocery {
	
		private ArrayList<String> groceryList = new ArrayList<String>();
		
		public void addGroceryItems(String item) {
			groceryList.add(item);
		}
		
		public void printGroceryItems() {
			System.out.println("You have "+groceryList.size() +" grocery items in your list");
			for(int i=0; i<groceryList.size(); i++)
				System.out.println(i+1+". "+groceryList.get(i));
		}
		
		public void modifyGroceryItem(int position, String item) {
			groceryList.set(position, item);
			System.out.println("Grocery item"+ (position+1) +" has been modified");	
		}
		
		public void removeGroceryItem(int position) {
			String theItem = groceryList.get(position);
			groceryList.remove(position);
		}
		
		public String findItem(String searchItem) {
		//	boolean exist = groceryList.contains(searchItem);
			
			int position = groceryList.indexOf(searchItem);
			if(position >= 0)
				return groceryList.get(position);
			
			return null;
		}
	}
	
	
	
	

