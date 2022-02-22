package newestproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class arraytest {
	/**
	 * Geeft een index in array haystack terug waar het getal needle zich bevindt
	 * of -1 indien niet gevonden.
	 *
	 *@post | (result == -1) || 
	 *		| (haystack[result] == needle)
	 */
	int find(int[] haystack, int needle) {
		int index = 0;
		for (;;) {
			if (index == haystack.length) 
				return -1;
			if (haystack[index] == needle) 
				return index;
			index++;
		}
	}
	@Test
	void test() {
		int[] mijnArray = {1,2,3,4};
		int resultaat = find(mijnArray,3);
		assertEquals(resultaat, 2);
	}
	@Test
	void testFindotFound() {
		int[] mijnArray = {1,2,3,4};
		int resultaat = find(mijnArray,5);
		assertEquals(resultaat, -1);
	}
	
}
