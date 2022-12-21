package leetcode.zigzag_iterator;

import java.util.List;

/**
 * 281. 锯齿迭代器
 */
public class ZigzagIterator {
	private final List<Integer> v1;
	private final List<Integer> v2;
	private       boolean       flag = true;
	private int           i1   = 0;
	private int           i2   = 0;

	public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
		this.v1 = v1;
		this.v2 = v2;
	}

	public int next() {
		if (flag && i1 < v1.size()) {
			flag = false;
			return v1.get(i1++);
		} else if (!flag && i2 < v2.size()) {
			flag = true;
			return v2.get(i2++);
		} else if (i1 < v1.size()) {
			return v1.get(i1++);
		} else {
			return v2.get(i2++);
		}
	}

	public boolean hasNext() {
		return !(i1 == v1.size() && i2 == v2.size());
	}
}
