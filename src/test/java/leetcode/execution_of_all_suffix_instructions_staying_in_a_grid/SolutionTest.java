package leetcode.execution_of_all_suffix_instructions_staying_in_a_grid;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

	@Test
	void executeInstructions() {
		Solution sol = new Solution();

		assertArrayEquals(new int[]{1, 5, 4, 3, 1, 0}, sol.executeInstructions(3, new int[]{0, 1}, "RRDDLU"));
		assertArrayEquals(new int[]{4, 1, 0, 0}, sol.executeInstructions(2, new int[]{1, 1}, "LURD"));
		assertArrayEquals(new int[]{0, 0, 0, 0}, sol.executeInstructions(1, new int[]{0, 0}, "LRUD"));
	}
}