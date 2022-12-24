package leetcode.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * 并查集
 */
public class UnionFind<T> {
	private final Map<T, T>       parent = new HashMap<>();
	private final Map<T, Integer> rank   = new HashMap<>();
	private final Map<T, Integer> size   = new HashMap<>();

	public UnionFind(List<T> l) {
		for (T item : l) {
			parent.put(item, item);
			rank.put(item, 0);
			size.put(item, 1);
		}
	}

	public UnionFind(UnionFind<T> uf) {
		this.parent.putAll(uf.parent);
		this.rank.putAll(uf.rank);
		this.size.putAll(uf.size);
	}

	public void unite(T tx, T ty) {
		T x = find(tx);
		T y = find(ty);
		if (x == y) {
			return;
		}
		if (rank.get(x) < rank.get(y)) {
			parent.put(x, y);
			size.put(y, size.get(y) + size.get(x));
		} else {
			parent.put(y, x);
			size.put(x, size.get(x) + size.get(y));
			if (Objects.equals(rank.get(x), rank.get(y))) {
				rank.put(x, rank.get(x) + 1);
			}
		}
	}

	public boolean same(T x, T y) {
		return find(x) == find(y);
	}

	public int getSize(T t) {
		return size.get(t);
	}

	private T find(T t) {
		if (!parent.get(t).equals(t)) {
			parent.put(t, find(parent.get(t)));
		}
		return parent.get(t);
	}
}
