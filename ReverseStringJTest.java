import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseStringJTest {
	
	

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		String phrase = new String("Hello");
		
		for(int i=phrase.length()-1; i>=0; i--) {
			char reversePhrase = phrase.charAt(i);
			System.out.print(reversePhrase);
		}
		
	
	
}
}
