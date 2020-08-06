import java.util.Random;

public class Sentence {

	public static void main(String[] args) {
		String[] article = {"the", "a", "one", "some", "any"};
		String[] nouns = {"boy", "girl", "dog", "town","car"};
		String[] verbs = {"drove", "jumped", "ran", "walked","skipped"};
		String[] preposition = {"to", "from", "over", "under", "on"};
		
		String[] sentence = new String[6];
		
		
		
		Random random = new Random();
		int index = random.nextInt(5);
		
		
		for(int i =1; i<=20; i++) {
			for(int j =0; j<=0; j++) {
				sentence[j] = article[random.nextInt(4)];
			}
			for(int j =0; j<=0; j++) {
				sentence[j+1] = nouns[random.nextInt(4)];
			}
			for(int j =0; j<=0; j++) {
				sentence[j+2] = verbs[random.nextInt(4)];
			}
			for(int j =0; j<=0; j++) {
				sentence[j+3] = preposition[random.nextInt(4)];
			}
			for(int j =0; j<=0; j++) {
				sentence[j+4] = article[random.nextInt(4)];
			}
			for(int j =0; j<=0; j++) {
				sentence[j+5] = nouns[random.nextInt(4)];
			}
			
			
			for(int s=0; s<sentence.length; s++) {
			System.out.print(sentence[s] + " ");
			} System.out.print(".");
			System.out.println();
		}
		
			

		
		}

	}
	
	


