



import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

    public class FindDigitWithoutPairTest {

        private FindDigitWithoutPair findDigitWithoutPair;

        @Before
        public void init() {
            findDigitWithoutPair = new FindDigitWithoutPair();
        }


        @Test
        public void testSimple() {
            int[] arr = {2, 2, 130,5, 5 };
            assertEquals( 130,findDigitWithoutPair.findSingle(arr));

        }

        @Test
        public void testOnlyTwo() {
            int[] arr = {2, 2, 2 };
            assertEquals( 2,findDigitWithoutPair.findSingle(arr));
        }

        @Test
        public void testThreeTwo() {
            int[] arr = {2, 2, 2,5, 5 };
            assertEquals( 2,findDigitWithoutPair.findSingle(arr));
        }

        @Test
        public void testFourOne() {
            int[] arr = {2, 2,2,2, 5 };
            assertEquals( 5,findDigitWithoutPair.findSingle(arr));
        }

        @Test
        public void testNegative() {
            int[] arr = {2, -2,2,-2, -5 };
            assertEquals( -5,findDigitWithoutPair.findSingle(arr));
        }






}
