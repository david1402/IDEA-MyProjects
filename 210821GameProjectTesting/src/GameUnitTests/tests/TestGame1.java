package GameUnitTests.tests;
import static org.junit.Assert.assertEquals;
import GameUnitTests.Game;
import GameUnitTests.WrongWordLengthException;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import GameUnitTests.Game;
import org.junit.rules.TestName;

public class TestGame1 {
    Game game =new Game();

@Rule
    public TestName testName= new TestName();
@After
    public void printEveryMethodName(){
        System.out.println(testName.getMethodName());
    }
@Before
    public void init (){
        game.startGame("procrastination","some description");
    }

    @Test
    public void testStartGame(){
        assertEquals(0,game.getAttempts());
        assertEquals(0,game.getBalance());
    }
    @Test
    public  void testAttempts()throws WrongWordLengthException {
        game.openLetter('a');
        assertEquals(1,game.getAttempts());
        game.openLetter(('x'));
        assertEquals(2,game.getAttempts());
        game.openWord("procrastination");
        assertEquals(3,game.getAttempts());
        game.openWord("procrastination");
        assertEquals(4,game.getAttempts());
    }


}
