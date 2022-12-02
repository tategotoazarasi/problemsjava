package leetcode.remove_element;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

	@Test
	void removeElement() {
		Solution sol   = new Solution();
		int[]    case1 = new int[]{3, 2, 2, 3};
		int[]    ans1  = new int[]{2, 2};
		int[]    case2 = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
		int[]    ans2  = new int[]{0, 1, 3, 0, 4};
		assertEquals(2, sol.removeElement(case1, 3));
		assertEquals(5, sol.removeElement(case2, 2));
		assertArrayEquals(Arrays.copyOf(case1, 2), ans1);
		assertArrayEquals(Arrays.copyOf(case2, 5), ans2);
	}
}