package GameUnitTests.SuiteTestRuns;
import static org.junit.Assert.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import GameUnitTests.Categories.*;
import org.junit.rules.TestName;

public class Test1 {

 @Rule
   public TestName testName =new TestName();
  @Before
  public  void printNames(){
      System.out.println(testName.getMethodName());
  }
 int a =2;
    int b =3;
    int expected =5;
    int actual =a+b;

  @Test
  @Category(Right.class)
  public void aPlusB (){
      assertEquals(expected,actual);
  }

  @Test
  @Category(Wrong.class)
    public  void aBB(){
      assertNotEquals(a,b);

  }
}
