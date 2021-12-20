package leetcode.pascals_triangle;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void generate() {
        Solution sol = new Solution();
        List<List<Integer>> res1 = sol.generate(5);
        assertEquals(1, res1.get(0).get(0));
        assertEquals(1, res1.get(1).get(0));
        assertEquals(1, res1.get(1).get(1));
        assertEquals(1, res1.get(2).get(0));
        assertEquals(2, res1.get(2).get(1));
        assertEquals(1, res1.get(2).get(2));
        assertEquals(1, res1.get(3).get(0));
        assertEquals(3, res1.get(3).get(1));
        assertEquals(3, res1.get(3).get(2));
        assertEquals(1, res1.get(3).get(3));
        assertEquals(1, res1.get(4).get(0));
        assertEquals(4, res1.get(4).get(1));
        assertEquals(6, res1.get(4).get(2));
        assertEquals(4, res1.get(4).get(3));
        assertEquals(1, res1.get(4).get(4));

        List<List<Integer>> res2 = sol.generate(1);
        assertEquals(1, res2.get(0).get(0));
    }
}