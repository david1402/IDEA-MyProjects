package GameUnitTests.tests;

import GameUnitTests.Word;
import GameUnitTests.WrongWordLengthException;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import static org.junit.Assert.assertEquals;

public class TestWord1 {
    Word word = new Word ("apple","some decription");

    @Rule
    public final TestName name =new TestName();
    @Before
    public void printTestNameAfter()
    {System.out.println(name.getMethodName());}

    @Test
    public void testGetWordwithStars(){
       assertEquals("*****",word.getWordWithStars());
    }
    @Test
    public void testOpenLetterValidChar(){
        word.openLetter('a');
        assertEquals("a****",word.getWordWithStars());

        word.openLetter('b');
        assertEquals("a****",word.getWordWithStars());

        word.openLetter('p');
        assertEquals("app**",word.getWordWithStars());
    }
    @Test
    public void testOpenLetterInvalidChar(){
        word.openLetter('A');
        assertEquals("*****",word.getWordWithStars());

        word.openLetter('%');
        assertEquals("*****",word.getWordWithStars());

        word.openLetter(('Ы'));
        assertEquals("*****",word.getWordWithStars());
    }
    @Test
    public void testOpenWordValid()throws WrongWordLengthException {
        word.openWord("apple");
        assertEquals("apple",word.getWordWithStars());
    }
    @Test(expected=WrongWordLengthException.class)
    public void testOpenWordInvalid()throws  WrongWordLengthException{
        word.openWord(("ZZZZZZZZZZZZZZZZZ"));

    }
}
