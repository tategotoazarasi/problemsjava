package leetcode.find_all_possible_recipes_from_given_supplies;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
		HashMap<String, Node> nodes = new HashMap<>();
		for (int i = 0; i < recipes.length; i++) {
			if (!nodes.containsKey(recipes[i])) {
				Node node = new Node(recipes[i]);
				nodes.put(recipes[i], node);
			}
			Node node = nodes.get(recipes[i]);
			for (String ingredient : ingredients.get(i)) {
				if (!nodes.containsKey(ingredient)) {
					Node node2 = new Node(ingredient);
					nodes.put(ingredient, node2);
					node.next.add(node2);
				} else {
					Node node2 = nodes.get(ingredient);
					node.next.add(node2);
				}
			}
		}
		for (String supply : supplies) {
			if (nodes.containsKey(supply)) {
				nodes.get(supply).flag = true;
			}
		}
		boolean flag = true;
		while (flag) {
			flag = false;
			for (String recipe : recipes) {
				boolean f2      = true;
				Node    curnode = nodes.get(recipe);
				for (Node node : curnode.next) {
					if (!node.flag) {
						f2 = false;
						break;
					}
				}
				if (f2 && !curnode.flag) {
					curnode.flag = true;
					flag         = true;
				}
			}
		}
		List<String> list = new LinkedList<>();
		for (String recipe : recipes) {
			Node curnode = nodes.get(recipe);
			if (curnode.flag) {
				list.add(curnode.name);
			}
		}
		return list;
	}
}
