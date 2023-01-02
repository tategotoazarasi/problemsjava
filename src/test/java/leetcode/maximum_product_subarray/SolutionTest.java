package leetcode.maximum_product_subarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	Solution sol = new Solution();

	@Test
	void maxProduct1() {
		Assertions.assertEquals(6, sol.maxProduct(new int[]{2, 3, -2, 4}));
	}

	@Test
	void maxProduct2() {
		Assertions.assertEquals(0, sol.maxProduct(new int[]{-2, 0, -1}));
	}

	@Test
	void maxProduct3() {
		Assertions.assertEquals(-2, sol.maxProduct(new int[]{-2}));
	}

	@Test
	void maxProduct4() {
		Assertions.assertEquals(3, sol.maxProduct(new int[]{-3, -1, -1}));
	}
}