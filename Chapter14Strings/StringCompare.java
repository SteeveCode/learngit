package Chapter14Strings;

import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		System.out.println("Enter the first word");
		Scanner input = new Scanner(System.in);
		String word1 = input.nextLine();
		System.out.println("Enter the second word");
		String word2 = input.nextLine();
		
		if(word1.compareTo(word2)== 0) {
			System.out.println(word1 +" is equal to "+ word2);
		}
		else if(word1.compareTo(word2) < 0) {
			System.out.println(word1 +" is lesser than "+ word2);
		}
		else 
			System.out.println(word1 +" is greater than "+ word2);

	}

}
