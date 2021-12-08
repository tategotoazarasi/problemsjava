package problems.search_insert_position;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void searchInsert() {
        Solution sol = new Solution();
        assertEquals(2, sol.searchInsert(new int[]{1, 3, 5, 6}, 5));
        assertEquals(1, sol.searchInsert(new int[]{1, 3, 5, 6}, 2));
        assertEquals(4, sol.searchInsert(new int[]{1, 3, 5, 6}, 7));
        assertEquals(0, sol.searchInsert(new int[]{1, 3, 5, 6}, 0));
        assertEquals(0, sol.searchInsert(new int[]{1}, 0));
        assertEquals(4, sol.searchInsert(new int[]{1, 3, 5, 6, 14}, 14));
        assertEquals(4, sol.searchInsert(new int[]{1, 3, 5, 6, 14}, 12));
        assertEquals(0, sol.searchInsert(new int[]{1}, 1));
    }
}