package leetcode.remove_duplicates_from_sorted_array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

	@Test
	void removeDuplicates() {
		Solution sol   = new Solution();
		int[]    case1 = new int[]{1, 1, 2};
		int[]    ans1  = new int[]{1, 2};
		int[]    case2 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
		int[]    ans2  = new int[]{0, 1, 2, 3, 4};
		int[]    case3 = new int[]{1, 1, 1};
		int[]    ans3  = new int[]{1};
		int[]    case4 = new int[]{1, 1, 2, 2};
		int[]    ans4  = new int[]{1, 2};
		assertEquals(2, sol.removeDuplicates(case1));
		assertEquals(5, sol.removeDuplicates(case2));
		assertEquals(1, sol.removeDuplicates(case3));
		assertEquals(2, sol.removeDuplicates(case4));
		assertArrayEquals(Arrays.copyOf(case1, 2), ans1);
		assertArrayEquals(Arrays.copyOf(case2, 5), ans2);
		assertArrayEquals(Arrays.copyOf(case3, 1), ans3);
		assertArrayEquals(Arrays.copyOf(case4, 2), ans4);
	}
}