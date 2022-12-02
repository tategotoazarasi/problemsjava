package leetcode.min_stack;

import java.util.Stack;

/**
 * Your MinStack object will be instantiated and called as such: MinStack obj = new MinStack(); obj.push(val);
 * obj.pop(); int param_3 = obj.top(); int param_4 = obj.getMin();
 */
public class MinStack {
	private final Stack<Integer> stack;
	private       Integer        min;
	private       int            minCount;

	public MinStack() {
		this.min      = null;
		this.minCount = 0;
		this.stack    = new Stack<>();
	}

	public void push(int val) {
		stack.push(val);
		if (min == null || min > val) {
			min      = val;
			minCount = 1;
		} else if (min == val) {
			minCount++;
		}
	}

	public void pop() {
		int p = stack.pop();
		if (stack.empty()) {
			min      = null;
			minCount = 0;
			return;
		}
		if (p == min) {
			minCount--;
		}
		if (minCount == 0) {
			min      = stack.peek();
			minCount = 0;
			for (int i : stack) {
				if (min > i) {
					min      = i;
					minCount = 1;
				} else if (min == i) {
					minCount++;
				}
			}
		}
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return min;
	}
}