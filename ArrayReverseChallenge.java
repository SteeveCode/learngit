// this code creates a method that takes in an array argument, modify the array parameter and 
// prints the array both reversed and non reverse.

import java.util.Arrays;

public class ArrayReverseChallenge {

	public static void main(String[] args) {
		
		int[] myArray = {10,20,30,40,50};
		reverseOne(myArray);
		reverseTwo(myArray);
	}
	
	public static void reverseOne(int[] array1) {
		int[] array2 = new int[array1.length];
	
		int counter = 0;
		for(int i = array1.length-1; i >= 0; i--) {
			array2[counter] = array1[i];
			counter++;
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
	}
/* the logic for the second reverse method is this:
 * variable "maxIndex" holds the value of the highest index of the array 
 * variable "halfLength" is necessary because by mid point of the number of element of the array, 
 * the swapping last element to the first and first to the last would have been complete. for 
 * odd number array elements, the for-loop will run minus 1 times less but because the mid element
 * in the array remains in the same position no problem arises. for even number array elements, 
 * the for-loop will run times
 * there is no need for running the for-loop array.length times.
 */
	public static void reverseTwo(int[] array) {
		int maxIndex = array.length - 1;
		int halfLength = array.length / 2;
		for(int i = 0; i < halfLength; i++) {
			int temp = array[i];
			array[i] = array[maxIndex]; // [maxIndex - i] can also be used on the RHS instead of [maxIndex]
			array[maxIndex] = temp;    //  [maxIndex - i] can also be used on the LHS instead of [maxIndex]
			maxIndex--;  // if [maxIndex - i] is used instead of [maxIndex], then there is no need for maxIndex--
		}
		System.out.println(Arrays.toString(array));
	}
}
