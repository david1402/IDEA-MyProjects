package GameUnitTests.tests;
import GameUnitTests.Categories.*;

import GameUnitTests.Word;
import GameUnitTests.WrongWordLengthException;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.TestName;

import static org.junit.Assert.assertEquals;

public class TestWord {
    @Rule
    public TestName testName= new TestName();
    @Before
    public void printEveryMethodName(){
        System.out.println(testName.getMethodName());
    }

    Word word = new Word("apple", "some description");
    @Test
    @Category(Right.class)
    public void testGetWordWithStars() {


        Word word = new Word("apple", "some description");
        assertEquals("*****", word.getWordWithStars());

    }

    @Test //lower, capital case, special symbols, cyrillic
    @Category(Right.class)
    public void testOpenLetterValidChar() {

        word.openLetter('a');
        assertEquals("a****", word.getWordWithStars());


        word.openLetter('b');
        assertEquals("a****", word.getWordWithStars());

        word.openLetter('p');
        assertEquals("app**", word.getWordWithStars());


    }

    @Test //lower, capital case, special symbols, cyrillic
    @Category(Wrong.class)
    public void testInvalidLetter() {

        Word word = new Word("apple", "some description");

        word.openLetter('A');
        assertEquals("*****", word.getWordWithStars());


        word.openLetter('%');
        assertEquals("*****", word.getWordWithStars());


        word.openLetter('р'); //cyrillic
        assertEquals("*****", word.getWordWithStars());


    }


    @Test //valid word
    @Category(Right.class)
    public void testOpenWordValid() throws WrongWordLengthException {

        word.openWord("apple");
        assertEquals("apple", word.getWordWithStars());


    }

    @Test(expected = WrongWordLengthException.class) //invalid word length
    @Category(Wrong.class)
    public void testOpenWordInvalidLength() throws WrongWordLengthException {

        Word word = new Word("apple", "some description");

        word.openWord("longword");


    }


}
