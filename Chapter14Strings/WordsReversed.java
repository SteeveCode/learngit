/**
 Exercise 14.9 (Displaying a Sentence with Its Words Reversed) Write an application that inputs a line of
text, tokenizes the line with String method split and outputs the tokens in reverse order. Use space
characters as delimiters.
 * 
 */

package Chapter14Strings;

import java.util.Scanner;

public class WordsReversed {

	public static void main(String[] args) {
		System.out.println("Enter a sentence");
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		String[] tokens = sentence.split(" ");
		for(int i=0; i<tokens.length; i++) {
			for(int j=tokens[i].length()-1; j>=0; j--) {
				System.out.print(tokens[i].charAt(j));
			}
			System.out.print(" ");
		}

	}

}
