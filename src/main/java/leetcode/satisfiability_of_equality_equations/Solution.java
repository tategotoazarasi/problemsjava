package leetcode.satisfiability_of_equality_equations;

import leetcode.common.UnionFind;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * 990. 等式方程的可满足性
 */
public class Solution {

	public boolean equationsPossible(String[] equations) {
		Set<Character> s = new HashSet<>();
		for (String equation : equations) {
			s.add(equation.charAt(0));
			s.add(equation.charAt(3));
		}
		UnionFind<Character> uf = new UnionFind<>(new ArrayList<>(s));
		for (String equation : equations) {
			if (equation.charAt(1) == '=') {
				uf.unite(equation.charAt(0), equation.charAt(3));
			}
		}
		for (String equation : equations) {
			if (equation.charAt(1) == '!' && uf.same(equation.charAt(0), equation.charAt(3))) {
				return false;
			}
		}
		return true;
	}
}