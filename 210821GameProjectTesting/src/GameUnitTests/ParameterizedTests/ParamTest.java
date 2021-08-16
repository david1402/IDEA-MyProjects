package GameUnitTests.ParameterizedTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class ParamTest {
    int inputedValue;
    int expectedResult;


    public ParamTest(int inputedValue, int expectedResult) {
        this.inputedValue = inputedValue;
        this.expectedResult = expectedResult;
    }
    @Parameterized.Parameters
    public static List<Integer[]> data (){
        return Arrays.asList ( new Integer [][] {
                {1,2},{3,4},{5,6},{6,7}
        });
    }
    @Test
    public void testSum(){

        Sun temp = new Sun();
        int actualValue = temp.summ(inputedValue);
        assertEquals(expectedResult,actualValue);



    }
}
