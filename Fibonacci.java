//This program creates a Fibonacci Series – Using For Loop

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0, j=1,nextTerm;
		System.out.print("Enter number of terms: ");
		
		Scanner input = new Scanner(System.in); 
		
		int size = input.nextInt();
		System.out.print("Fibonacci series is: ");
		
		System.out.print(i+" ");
		System.out.print(j+" ");
		
		for(int k=0; k<size; k++) {
			if(k<=1) 
				nextTerm = k;
			else
			 {
				nextTerm = i + j;
				i =j;
				j = nextTerm;// the value of nextTerm can be set to zero at this point before next iteration or reset to nextTerm = i + j above.
				System.out.print(nextTerm+" ");
				
				
			}
		}

	}

}
