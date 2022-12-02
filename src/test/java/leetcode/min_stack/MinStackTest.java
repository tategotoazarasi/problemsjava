package leetcode.min_stack;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinStackTest {

	@Test
	public void minStackTest() {
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		assertEquals(-3, minStack.getMin());   //--> 返回 -3.
		minStack.pop();
		assertEquals(0, minStack.top());      //--> 返回 0.
		assertEquals(-2, minStack.getMin());   //--> 返回 -2.
	}

}