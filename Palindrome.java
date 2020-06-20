//Exercises Question 4.30 - Solution 
//Write an application that reads in a five-digit integer and determines whether it’s a palindrome. If the number is not five digits long, display an 
//error message and allow the user to enter a new value.

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number: ");
		Scanner input = new Scanner(System.in);
		
		// This outer while loop is used to fulfil the condition that allows the user to enter a new value if the first is not up to 5 digits.
		while(true) {
			// The variables are initialised inside the outer while loop so that user can re-enter the value if not up to 5 digits.
			int num = input.nextInt();
			int tempNum=num;
			int reverse = 0;
			
		if(tempNum >10000 && tempNum <100000) {
			
			while(tempNum>0) {
				int digits = tempNum%10;
				reverse = reverse*10 + digits;
				tempNum = tempNum/10;
		}
		
		if(num == reverse)
			System.out.printf("The number %d is a palindrome",num); // e.g: 12321, 55555, 45554 and 11611 are five digit palindrome.
		else
			System.out.printf("The number %d is not a palindrome",num);
		break;
		}
		else
			System.out.print("The number entered is not up to five digits. Please,enter number again: \n");
		//continue;
		
		
		}
		
	}
	

}
