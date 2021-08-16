package GameUnitTests.Categories;

import GameUnitTests.tests.TestWord;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.ExcludeCategory(Right.class)
@Suite.SuiteClasses(TestWord.class)
public class CategoriesRunner {


}
