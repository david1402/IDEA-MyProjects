package GameUnitTests.tests;

import GameUnitTests.Game;
import GameUnitTests.WrongWordLengthException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import static org.junit.Assume.*;

public class AssertionsTests {

    @Test
    public void whenAssertingEquality_thenEqual() {

        String expected = "Baeldung";
        String actual = "Baeldung";
        assumeTrue("actual input parameter is wrong", expected=="Baeldung");
        assertEquals("They are not equal!", expected, actual);
    }

    @Test
    public void whenAssertingArraysEquality_thenEqual() {
        char[] expected = {'J', 'u', 'n', 'i', 't'};
        char[] actual = "Junit".toCharArray();



        assertArrayEquals(expected, actual);

    }

    @Test
    public void whenAssertingNull_thenTrue() {
        Object car = null;

        assertNull("The car should be null", car);
    }

    @Test
    public void whenAssertingNotSameObject_thenDifferent() {
        Object cat = new Object();
        Object dog = new Object();


        assertNotSame(cat, dog);
    }

    @Test
    public void whenAssertingConditions_thenVerified() {
        assertTrue("5 is greater then 4", 5 > 4);
        assertFalse("5 is not greater then 6", 5 > 6);
    }

    @Test(expected = WrongWordLengthException.class)
    public void whenCheckingExceptionMessage_thenEqual() throws WrongWordLengthException {
        Game game = new Game();
        game.startGame("apple", "description");

        game.openWord("aple");
        fail("Exception not thrown");

    }
    @Test
    public void testAssertThatHasItems() {
        assertThat(
                Arrays.asList("Java", "Kotlin", "Scala"),
                hasItems("Java", "Kotlin"));
    }

    @Test(expected = NullPointerException.class)
    public void whenExceptionThrown_thenExpectationSatisfied() {
        String test = null;
        test.length();
    }



        @Rule
        public TemporaryFolder temporaryFolder = new TemporaryFolder();

        @Test
        public void testRun() throws IOException {
            assertTrue( temporaryFolder.newFolder().exists() );
        }
    }

