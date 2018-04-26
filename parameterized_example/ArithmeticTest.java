/**
 * https://www.guru99.com/junit-parameterized-test.html
 */

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ArithmeticTest {

    private int firstNumber;
    private int secondNumber;
    private int expectedResult;
    private Arithmetic arithmetic;

    // constructor, store test data
    public ArithmeticTest(int firstNumber, int secondNumber, int expectedResult) {
        super();
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][] {{1,2,3}, {11,22,33}, {111,222,333}});
    }

    @Before
    public void initialize() {
        arithmetic = new Arithmetic();

    }

    @Test
    public void testArithmetic() {
        System.out.println("Sum of Numbers = : " + expectedResult);
        assertEquals(expectedResult, arithmetic.sum(firstNumber, secondNumber));
    }
}