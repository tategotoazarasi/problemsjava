/**
 * LintCode 2378. final 变量不可变
 */
package lintcode.lintcode2378;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


public class Main {
	public static void main(String[] args) throws NoSuchFieldException {
		Solution solution = new Solution();
		User     uer      = solution.getUser(args[0]);
		Class    clazz    = Solution.class;
		Field    field    = clazz.getDeclaredField("user");

		if (!Modifier.isFinal(field.getModifiers())) {
			throw new RuntimeException(
					"You need to make sure that the variable user is final");
		}

		System.out.println(uer.getName());
	}
}
