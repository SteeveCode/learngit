/**
 Exercise 14.7 (Pig Latin) Write an application that encodes English-language phrases into pig Latin. Pig
Latin is a form of coded language. There are many different ways to form pig Latin phrases. For
simplicity, use the following algorithm:
To form a pig Latin phrase from an English-language phrase, tokenize the phrase into words
with String method split. To translate each English word into a pig Latin word, place the first
letter of the English word at the end of the word and add the letters �ay.� Thus, the word �jump�
becomes �umpjay,� the word �the� becomes �hetay,� and the word �computer� becomes �omputercay.�
Blanks between words remain as blanks. Assume the following: The English phrase consists of
words separated by blanks, there are no punctuation marks and all words have two or more letters.
Method printLatinWord should display each word. Each token is passed to method printLatin-
Word to print the pig Latin word. Enable the user to input the sentence. Keep a running display of
all the converted sentences in a text area.
 */

package Chapter14Strings;

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		
		boolean flag = true; 
		
		
		do {
		System.out.println("Enter a sentence");
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		if(sentence.matches("(\\w*\\s\\w*)*")) {
		String[] tokens = sentence.split(" ");
		
		char[] minusFirstLetter = new char[100];
		
		
		for(int i=0; i<tokens.length; i++) {
			//tokens[i].getChars(0, 2, minusFirstLetter, 0);
			char firstLetter = tokens[i].charAt(0);
			Character stringFL = firstLetter;
			stringFL.toString();
			//System.out.println(firstLetter);
			String less = tokens[i].substring(1, tokens[i].length());
			less.concat(stringFL.toString());
	
			System.out.print(less.concat(stringFL.toString()+"ay"+" "));
			
			
			
		}
		flag = false;
			
		}
		else
			System.out.println("Invalid sentence. Try again!");
			
			
		}while(flag);

	}

}
