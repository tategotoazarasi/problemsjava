package leetcode.find_all_possible_recipes_from_given_supplies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

	@Test
	void findAllRecipes() {
		Solution sol = new Solution();
		Assertions.assertEquals(List.of("bread"),
		                        sol.findAllRecipes(new String[]{"bread"},
		                                           List.of(List.of("yeast", "flour")),
		                                           new String[]{"yeast", "flour", "corn"}));
		Assertions.assertEquals(List.of("bread", "sandwich"),
		                        sol.findAllRecipes(new String[]{"bread", "sandwich"},
		                                           List.of(List.of("yeast", "flour"), List.of("bread", "meat")),
		                                           new String[]{"yeast", "flour", "meat"}));
		Assertions.assertEquals(List.of("bread", "sandwich", "burger"),
		                        sol.findAllRecipes(new String[]{"bread", "sandwich", "burger"},
		                                           List.of(List.of("yeast", "flour"),
		                                                   List.of("bread", "meat"),
		                                                   List.of("sandwich", "meat", "bread")),
		                                           new String[]{"yeast", "flour", "meat"}));
		Assertions.assertEquals(List.of(),
		                        sol.findAllRecipes(new String[]{"bread"},
		                                           List.of(List.of("yeast", "flour")),
		                                           new String[]{"yeast"}));
	}
}