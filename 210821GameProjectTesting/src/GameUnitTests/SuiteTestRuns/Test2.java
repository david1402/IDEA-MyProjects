package GameUnitTests.SuiteTestRuns;
import static org.junit.Assert.*;
import org.junit.*;
import GameUnitTests.Categories.*;
import org.junit.experimental.categories.Category;
import org.junit.rules.TestName;

public class Test2 {

    @Rule
    public TestName testName= new TestName();
    @Before
    public void printEveryMethodName(){
        System.out.println(testName.getMethodName());
    }
    int car =0;
    @Test
    @Category(Right.class)
    public void IfNull(){
        assertTrue(car==0);
    }
    @Test
    @Category(Wrong.class)
    public void assFalse(){
        assertFalse(car!=0);
    }

}
