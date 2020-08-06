import java.util.Scanner;

public class ArrayResize {
	
	private static Scanner s = new Scanner(System.in);
	private static int[] baseData = new int[5];
	
	public static void main(String[] args) {
		System.out.println("Enter 5 intergers: ");
		getInput();
		printArray(baseData);
		resizeArray();
		//System.out.println("Enter 7 integers: ");
		//getInput();
		baseData[5]=7;
		baseData[6]=9;
		printArray(baseData);
	}

	private static void getInput() {
		for(int i = 0; i<baseData.length; i++) 
			baseData[i] = s.nextInt();
	}
	
	private static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	private static void resizeArray() {
		int[] original = baseData;
		baseData = new int[7]; 
		/** 
		 * do not redeclare baseData as:baseData int[] baseData = new int[7]
		 * the new array operator creates a new array reference and forces the variable baseData
		 * to drop it's old reference for the new array reference.
	    */
		for(int i = 0; i<original.length; i++)
			baseData[i] = original[i];
	}
	
}
