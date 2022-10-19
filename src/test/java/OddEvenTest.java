import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import project_utils.OddEven;

public class OddEvenTest {
    //------------1-----------
    @Test
    public void testNumberOdd() {
        //-345 →  “Odd”
        int number = -345;
        String expectedResult = "Odd";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testNumberZeroEven() {
        //0 →  “Even”
        int number = 0;
        String expectedResult = "Even";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testNumberEven() {
        //222222 →  “Even”
        int number = 222222;
        String expectedResult = "Even";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //--------------------------2-------------
    @Test
    // Test Data:
    // Input = {-45, 590, 234, 985, 12, 68}
    // Expected Result =  {590, 985, 68}

    public void testOddIndices() {
        int[] number = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};
        int[] actualResult = new OddEven().oddIndices(number);
        Assert.assertEquals(actualResult, expectedResult);

    }

    //------3------------
    @Test
    //Test Data:
    //{0, 1, 2, 3, 4, 5} → 15
    //{-7, -3} → -10
    public void testSumArrayPositiveNumbers() {
        int[] number = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;
        int actualResult = new OddEven().sumArray(number);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumArrayNegativeNumbers() {
        int[] number = {-7, -3};
        int expectedResult = -10;
        int actualResult = new OddEven().sumArray(number);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //---------------------4------------
    @Test
    public void testBiggerValue() {
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;
        int actualResult = new OddEven().biggerValue(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //---------5--------------
    @Test
    public void testIsPositiveNumber_positiveNumber() {
        int number = 555;
        boolean expectedResult = true;
        boolean actualResult = new OddEven().isPositiveNumber(number);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIsPositiveNumber_NumberZero() {
        int number = 0;
        boolean expectedResult = true;
        boolean actualResult = new OddEven().isPositiveNumber(number);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIsPositiveNumber_NumberNegative() {
        int number = -555;
        boolean expectedResult = false;
        boolean actualResult = new OddEven().isPositiveNumber(number);
        Assert.assertEquals(actualResult, expectedResult);
    }

    //-----------------6-----------
    @Test
    public void testAreNumbersEqual_NumbersEqual() {
        int a = 89;
        int b = 89;
        int expectedResult = 0;
        int actualResult = new OddEven().areNumbersEqual(a, b);
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testAreNumbersEqual_SecondNumbersMoreFirst() {
        int a = -89;
        int b = 89;
        int expectedResult = -1;
        int actualResult = new OddEven().areNumbersEqual(a, b);
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testAreNumbersEqual_FirstNumbersMoreSecond() {
        int a = 89;
        int b = -89;
        int expectedResult = 1;
        int actualResult = new OddEven().areNumbersEqual(a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
