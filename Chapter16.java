import static org.junit.jupiter.api.Assertions.*;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Chapter16 {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void colllection() {
		int gadansCount = 25;
		List<Integer> cohortCount = new ArrayList<Integer>();
		cohortCount.add(gadansCount);
		Integer constructorCount = 45;
		cohortCount.add(constructorCount);
		String gadansPriest = "Samuel";
		
		int constructors = cohortCount.get(1);
		Iterator<Integer> gadansIterator = cohortCount.iterator();
		while(gadansIterator.hasNext()) {
			System.out.println(gadansIterator.next());
		}
		
		
		List<String> agentsOfTheGods = new Vector<String>();
		agentsOfTheGods.add(gadansPriest);
		
		Set<String> gadans = new HashSet<String>();
		boolean result = gadans.add(gadansPriest);
		assertTrue(result);
		result = gadans.add("Morenike");
		assertTrue(result);
		result = gadans.add("Samuel");
		assertFalse(result);
		result = gadans.add("Morenike");
		assertFalse(result);
		
		Map<String, String> nativeIds = new TreeMap<String, String>();
		nativeIds.put("SCV4004", "Stevecode");
		/*
		 * the code below was from class work but was not completed
		 * 
		 * assertNull(value);
		   nativeIds.put("SCV4004", "Benard");
		   assertEquals
		   nativeIds.put("SCV4004", "Samuel");
		   assertEquals
		*
		*
		*/
		
	}

}
