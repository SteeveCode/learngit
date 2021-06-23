/*
 * This code takes in a single character of either upper or
 * lower case and switches the case.
 * NOTE:
 * Scanner class does not have an input.nextChar() method.
 * In the ASCII table, there are 32 characters between the  
 * uppercase and lowercase of any alphanumeric character. 
 * 
 * */

import java.util.Scanner;
public class CharacterCaseConverter {

	public static void main(String[] args) {
		System.out.println("Enter a single alphabetic character: ");
		Scanner input = new Scanner(System.in);
		char someChar = input.next().charAt(0); 
		
		if(someChar >= 'a' && someChar <= 'z'){
			someChar = (char)(someChar - 32);
			} 
		else{
			if(someChar >= 'A' && someChar <='Z')
				{someChar = (char)(someChar + 32);
		// someChar +=32 does not require (char) type casting
				}
			}
		System.out.println(someChar);
	
	}

}
