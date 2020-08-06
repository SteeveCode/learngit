/* this code sorts an array of number in descending order. the logic is that you can only compare  
 two things at a time and as the for-loop increments, the next two sets are compared. the outer 
 while loop then start the comparison from beginning again until the elements are properly sorted.
 this is achieved by nesting nesting an if statement inside a for-loop, and nesting the for-loop 
 inside a while loop. if your reverse the less than sign, the array is sorted in ascending order.
*/
import java.util.Arrays;
import java.util.Scanner;

public class ArraySorted {
 
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] myArray = getIntegers(5);
		int[] mySorted = sortedArray(myArray);
		printArray(mySorted);
		

	}// end main method

	public static int[] getIntegers(int number) {
		System.out.println("Enter " + number + " integer values:");
		int[] array = new int[number];
		for(int i = 0; i<array.length; i++) {
			array[i] = input.nextInt();
		}
		System.out.println();
		return array;
	}// getIntegers method
	
	public static void printArray(int[] sortedArray) {
		for(int i = 0; i<sortedArray.length; i++) {
			System.out.printf("%d ",sortedArray[i]);
		}
		System.out.println();
		System.out.println(Arrays.toString(sortedArray));// returns a string representation of array
	}// printArray method
	
	public static int[] sortedArray(int[] array) {
		int[] sorted = new int[array.length];
		for(int i =0; i<sorted.length; i++) {
			sorted[i] = array[i];	
		}
		
		boolean flag = true;
		int temp;
		
		while(flag) {
			flag = false;
			for(int i=0; i<sorted.length-1; i++) { // changing the less than sign to greater than sign on line 42 sorts the array in ascending order
				if(sorted[i] < sorted[i+1]) {
					temp = sorted[i];
					sorted[i] = sorted[i+1];
					sorted[i+1] = temp;	
					flag = true;
				}
			}
		}
		return sorted;
	}// sortedArray method
}// end class
