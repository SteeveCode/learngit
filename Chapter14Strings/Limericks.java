package Chapter14Strings;

import java.util.Random;
public class Limericks {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++)
			System.out.println(generateLimerick());
		

	}
	static String generateLimerick() {
		String[] article = {"the", "a", "one", "some", "any"};
		String[] noun = {"station", "exclamation", "explanation","boy", "girl"};
		String[] verb = {"drove", "jumped", "ran", "walked","skipped"};
		String[] preposition = {"to", "from", "over", "under", "on"};
		
		boolean flag = true;
		
		
		StringBuilder sentence = new StringBuilder();
		String space = " ";
		Random indexGenerator = new Random();
		int index = indexGenerator.nextInt(article.length);
		String word = article[index];
		char firstLetter = Character.toUpperCase(word.charAt(0));
		word = word.replace(word.charAt(0), firstLetter);
		
		// add article
		sentence.append(word);
		sentence.append(space);
		
		// add noun
		
		index = indexGenerator.nextInt(noun.length);
		word = noun[index];
		do {
		if(noun[index].matches("\\w+[^tion]+?")) {	
			sentence.append(word);
			sentence.append(space);
			flag = false;
		}
		}while(flag);
		// add verb
		index = indexGenerator.nextInt(article.length);
		word = verb[index];
		sentence.append(word);
		sentence.append(space);
		
		// add preposition
		index = indexGenerator.nextInt(article.length);
		word = preposition[index];
		sentence.append(word);
		sentence.append(space);
		
		// add article
		index = indexGenerator.nextInt(article.length);
		word = article[index];
		sentence.append(word);
		sentence.append(space);
		
		// add noun
		index = indexGenerator.nextInt(noun.length);
		word = noun[index];
		do {
		if(noun[index].matches("[tion]+")) {
		sentence.append(word);
		sentence.append(".");
		flag = false;
		}
		}while(flag);
		
		return sentence.toString();
	}

}

