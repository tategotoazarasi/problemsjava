package leetcode.find_all_possible_recipes_from_given_supplies;

import java.util.Vector;

public class Node {
	public String       name;
	public Vector<Node> next;
	public boolean      flag;

	public Node(String name) {
		this.name = name;
		this.flag = false;
		this.next = new Vector<>();
	}
}
