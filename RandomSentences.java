import java.util.Random;
	


public class RandomSentences {
	
	public static void main(String[] args) {
	
	String[] article = {"the", "a", "one", "some", "any"};
	String[] nouns = {"boy", "girl", "dog", "town","car"};
	String[] verbs = {"drove", "jumped", "ran", "walked","skipped"};
	String[] preposition = {"to", "from", "over", "under", "on"};
	
	String[] sentence = new String[7];
	
	Random random = new Random();
	//index = 1 + random.nextInt(4);
	
	for(int i =1; i<=20; i++) {
		for(int j =0; j<=0; j++) {
			sentence[j] = article[1+random.nextInt(4)];
		}
		for(int j =0; j<=1; j++) {
			sentence[j+1] = nouns[1+random.nextInt(4)];
		}
		for(int j =0; j<=1; j++) {
			sentence[j+2] = verbs[1+random.nextInt(4)];
		}
		for(int j =0; j<=1; j++) {
			sentence[j+3] = preposition[1+random.nextInt(4)];
		}	
		for(int j =0; j<=0; j++) {
			sentence[j+4] = article[1+random.nextInt(4)];
		}
		for(int j =0; j<=1; j++) {
			sentence[j+5] = nouns[1+random.nextInt(4)];
		}
		
		for(int j = 0; j < sentence.length; j++)
			System.out.print(sentence[j]+" ");
		System.out.println();
		
	}
}
}