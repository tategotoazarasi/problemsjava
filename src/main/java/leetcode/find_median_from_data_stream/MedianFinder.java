package leetcode.find_median_from_data_stream;

import java.util.PriorityQueue;

/**
 * 295. 数据流的中位数
 */
public class MedianFinder {
	private final PriorityQueue<Integer> max;
	private final PriorityQueue<Integer> min;

	/**
	 * 初始化 MedianFinder 对象。
	 */
	public MedianFinder() {
		max = new PriorityQueue<>((o1, o2) -> -Integer.compare(o1, o2));
		min = new PriorityQueue<>(Integer::compare);
	}

	/**
	 * 将数据流中的整数 num 添加到数据结构中。
	 */
	public void addNum(int num) {
		if (max.isEmpty()) {
			max.add(num);
		} else if (num < max.peek()) {
			max.add(num);
		} else {
			min.add(num);
		}
		while (max.size() - min.size() >= 2) {
			min.add(max.poll());
		}
		while (min.size() - max.size() >= 2) {
			max.add(min.poll());
		}
	}

	/**
	 * 返回到目前为止所有元素的中位数。与实际答案相差10^-5以内的答案将被接受。
	 */
	public double findMedian() {
		if (max.size() == min.size()) {
			return ((double) (max.peek() + min.peek())) / 2;
		} else if (max.size() > min.size()) {
			return max.peek();
		} else {
			return min.peek();
		}
	}
}