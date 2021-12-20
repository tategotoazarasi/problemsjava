package leetcode.pascals_triangle_ii;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void getRow() {
        Solution sol = new Solution();

        List<Integer> res6 = sol.getRow(21);

        List<Integer> res5 = sol.getRow(13);
        assertEquals(1, res5.get(0));
        assertEquals(13, res5.get(1));
        assertEquals(78, res5.get(2));
        assertEquals(286, res5.get(3));
        assertEquals(715, res5.get(4));
        assertEquals(1287, res5.get(5));
        assertEquals(1716, res5.get(6));
        assertEquals(1716, res5.get(7));
        assertEquals(1287, res5.get(8));
        assertEquals(715, res5.get(9));
        assertEquals(286, res5.get(10));
        assertEquals(78, res5.get(11));
        assertEquals(13, res5.get(12));
        assertEquals(1, res5.get(13));

        List<Integer> res1 = sol.getRow(4);
        assertEquals(1, res1.get(0));
        assertEquals(4, res1.get(1));
        assertEquals(6, res1.get(2));
        assertEquals(4, res1.get(3));
        assertEquals(1, res1.get(4));

        List<Integer> res2 = sol.getRow(3);
        assertEquals(1, res2.get(0));
        assertEquals(3, res2.get(1));
        assertEquals(3, res2.get(2));
        assertEquals(1, res2.get(3));

        List<Integer> res3 = sol.getRow(0);
        assertEquals(1, res3.get(0));

        List<Integer> res4 = sol.getRow(1);
        assertEquals(1, res4.get(0));
        assertEquals(1, res4.get(1));
    }
}