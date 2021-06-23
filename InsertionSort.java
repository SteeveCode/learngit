/* Program to find out how long it takes to sort a large array using both 
 * a sorting method that you write and using Java's built-in sorting method.
 * 
 * Time taken to run array sizes of 1,000, 10,000, and 100,000(measured in milliseconds).
 * 
 * INSERTION SORT
 * Array size of 1,000   = 8 milliseconds
 * Array size of 10,000  = 65 milliseconds
 * Array size of 100,000 = 4966 milliseconds
 * 
 * JAVA'S BUILT-IN SORT
 * Array size of 1,000   = 0 milliseconds
 * Array size of 10,000  = 6 milliseconds
 * Array size of 100,000 = 34 milliseconds
 */

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		final int ARRAYSIZE = 1000;
		int[] firstArray = new int[ARRAYSIZE];

		for(int i=0; i<firstArray.length; i++) {
			int randomNumber = (int)(Integer.MAX_VALUE * Math.random());
			firstArray[i] = randomNumber;
		}
		
		// Make a new array with identical content as firstArray.
		int[] secondArray  = new int[ARRAYSIZE];  
		for ( int i = 0; i < secondArray.length; i++ ) {
			secondArray[i] = firstArray[i];
			} 
		
		// Sorting & timing of firstArray using insertion sort.
		long startTimeArrayA = System.currentTimeMillis();
		insertionSort(firstArray);
		long runTimeArrayA = System.currentTimeMillis() - startTimeArrayA;
		System.out.println("The time taken to sort the first array using insertion sort is: "+runTimeArrayA+" milliseconds");
		
		// Print the first array to console by removing the single-line comment symbol on line 43
		 System.out.println(Arrays.toString(firstArray));
		
		// Introduce a whitespace for legibility
		System.out.println();
		
		// Sorting & timing of secondArray using java's built-in sort.
		long startTimeArrayB = System.currentTimeMillis();
		Arrays.sort(secondArray);
		long runTimeArrayB = System.currentTimeMillis() - startTimeArrayB;
		System.out.println("The time taken to sort the second array using Java's built-in sort is: "+runTimeArrayB+" milliseconds");
		
		// Print the second array to console by removing the single-line comment symbol on line 54
		 System.out.println(Arrays.toString(secondArray));
	}
	
	
	static void insertionSort(int[] A) {
		// Sort the first array into increasing order.

		int itemsInArrayThatAreSorted; // Number of items that have been sorted so far.

		for (itemsInArrayThatAreSorted = 1; itemsInArrayThatAreSorted < A.length; itemsInArrayThatAreSorted++) {
		  // Assume that items A[0], A[1], ... A[itemsSorted-1]
		  // have already been sorted.  Insert A[itemsSorted]
		  // into the sorted part of the list.
		  
			int temp = A[itemsInArrayThatAreSorted];  // The item to be inserted.
			int location = itemsInArrayThatAreSorted - 1;  // Start at end of list.

			while (location >= 0 && A[location] > temp) {
			A[location + 1] = A[location]; // Bump item from A[location] up to location+1.
			location = location - 1;       // Go on to next location.
			}
		A[location + 1] = temp; // Put temp in last vacated space.
		}
	}
	
	
}
