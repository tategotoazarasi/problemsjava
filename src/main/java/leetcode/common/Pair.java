package leetcode.common;

public class Pair<T, E> {
	public T first;
	public E second;

	public Pair(T t, E e) {
		first  = t;
		second = e;
	}

	@Override public int hashCode() {
		int result = first.hashCode();
		result = 31 * result + second.hashCode();
		return result;
	}

	@Override public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Pair)) return false;

		Pair<?, ?> pair = (Pair<?, ?>) o;

		if (!first.equals(pair.first)) return false;
		return second.equals(pair.second);
	}
}