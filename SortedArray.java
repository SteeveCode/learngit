import java.util.Scanner;

public class SortedArray {
 
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] myArray = getIntegers(5);
		int[] mySorted = sortedArray(myArray);
		printArray(mySorted);
		

	}

	public static int[] getIntegers(int number) {
		System.out.println("Enter " + number + " integer values:\r");
		int[] array = new int[number];
		for(int i = 0; i<array.length; i++) {
			array[i] = input.nextInt();
		}
		System.out.println();
		return array;
	}
	
	public static void printArray(int[] sortedArray) {
		for(int i = 0; i<sortedArray.length; i++) {
			System.out.printf("%d ",sortedArray[i]);
		}
	}
	
	public static int[] sortedArray(int[] array) {
		int[] sorted = new int[array.length];
		for(int i =0; i<sorted.length; i++) {
			sorted[i] = array[i];	
		}
		
		boolean flag = true;
		int temp;
		
		while(flag) {
			flag = false;
			for(int i=0; i<sorted.length-1; i++) {
				if(sorted[i] < sorted[i+1]) {
					temp = sorted[i];
					sorted[i] = sorted[i+1];
					sorted[i+1] = temp;	
					flag = true;
				}
			}
			
		}
		return sorted;
	}
}
