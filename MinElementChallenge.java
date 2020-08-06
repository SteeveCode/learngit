import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {
	// the scanner class is set to static so that other static methods can access it directly and
	// so that separate instances of the scanner is not created. 
	// scanner class access modifier was set to private just to maintain best software practices.
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("An array of how many integers do you want?");
		int count = input.nextInt();
		// can "input.nextLine();" be inserted here without any issue?
	
		int[]returnedArray = readIntegers(count);
		System.out.println(Arrays.toString(returnedArray));
		int returnedMin = findMin(returnedArray);
		System.out.println("The minimum interger entered is "+returnedMin);
	}

	static int[] readIntegers(int count) {
		System.out.println("Enter th first interger");
		int counter = count;
		int[] array = new int[counter];
		for(int i=0; i<counter; i++) {	
			array[i] = input.nextInt();
			count--;
			if(i < counter-1) {
			System.out.println(count+" more integers to go!");
			}
			}
		return array;
	}
	
	static int findMin(int[] array) {
		boolean flag = true;
		while(flag) {
			flag = false;
		for(int i=0; i<array.length-1; i++) {
			if(array[i+1] < array[i]) { // we can also set an initial min value to integer.MAX_VALUE
				int temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
				flag = true;	
			}
		}
			
		} return array[0];
		
	}
}
	
