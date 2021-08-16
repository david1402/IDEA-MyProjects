package GameUnitTests.SuiteTestRuns;

import GameUnitTests.Categories.Right;
import GameUnitTests.Categories.Wrong;
import org.junit.Rule;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.util.Locale;

//@RunWith(Suite.class)
@RunWith(Categories.class)
@Categories.IncludeCategory(Right.class)



@Suite.SuiteClasses({Test1.class,Test2.class})
public class SuiteHolder {

}
