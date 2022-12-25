package leetcode.design_most_recently_used_queue;

import java.util.Map;
import java.util.TreeMap;

/**
 * 1756. 设计最近使用（MRU）队列
 */
public class MRUQueue {
	private final TreeMap<Integer, Integer> tm;
	private       int                       seq;

	/**
	 * 使用 n 个元素： [1,2,3,...,n] 构造 MRUQueue 。
	 */
	public MRUQueue(int n) {
		seq = 0;
		tm  = new TreeMap<>();
		for (int i = 1; i <= n; i++) {
			tm.put(++seq, i);
		}
	}

	/**
	 * 将第 k 个元素（从 1 开始索引）移到队尾，并返回该元素。
	 */
	public int fetch(int k) {
		var                         it    = tm.entrySet().iterator();
		Map.Entry<Integer, Integer> entry = null;
		for (int i = 0; i < k; i++) {
			entry = it.next();
		}
		assert entry != null;
		int ret = entry.getValue();
		tm.remove(entry.getKey());
		tm.put(++seq, ret);
		return ret;
	}
}