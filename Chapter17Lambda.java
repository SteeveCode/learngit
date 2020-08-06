import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Chapter17Lambda {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void oldSum() {
		int total = 0;
		for(int i=1; i<=10;i++) {
			total+=i;
		}
		assertEquals(55, total);
	}

	@Test
	void newSum() {
		int total = IntStream.rangeClosed(1,10)
				             .sum();
		assertEquals(55, total);
	}
	
}
