package leetcode.design_most_recently_used_queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MRUQueueTest {
	@Test
	void test1() {
		MRUQueue q = new MRUQueue(8);
		Assertions.assertEquals(3, q.fetch(3));
		Assertions.assertEquals(6, q.fetch(5));
		Assertions.assertEquals(2, q.fetch(2));
		Assertions.assertEquals(2, q.fetch(8));
	}

	@Test
	void test2() {
		MRUQueue q = new MRUQueue(3);
		int[]    p = {2, 1, 2, 2, 2, 3, 2, 1, 1, 2};
		int[]    a = {2, 1, 2, 1, 2, 2, 1, 3, 2, 3};
		for (int i = 0; i < 10; i++) {
			Assertions.assertEquals(a[i], q.fetch(p[i]));
		}
	}
}