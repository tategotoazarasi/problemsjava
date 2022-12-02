package lintcode.lintcode2378;

public class Solution {
	final User user;

	public Solution() {
		user = new User();
	}

	public User getUser(String arg) {
		user.setName(arg);
		return user;
	}
}
