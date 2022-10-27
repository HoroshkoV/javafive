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

    @Test
    public void testMinMaxAve() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int a = 2;
        int b = 6;
        int[] expectedResult = new int[]{3, 7, 5};
        int[] actualResult = new OddEven().minMaxAve(array, a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIntersection_PositiveNumber() {
        int[] arrayOne = {1, 2, 4, 5, 89};
        int[] arrayTwo = {8, 9, 4, 2};
        int[] expectedResult = new int[]{2, 4};
        int[] actualResult = new OddEven().intersection(arrayOne, arrayTwo);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIntersection_NegativeNumber() {
        int[] arrayOne = {1, 2, 4, 5, 8, 9};
        int[] arrayTwo = {8, 9, -4, -2};
        int[] expectedResult = new int[]{8, 9};
        int[] actualResult = new OddEven().intersection(arrayOne, arrayTwo);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIntersection_NoMatches() {
        int[] arrayOne = {1, 2, 4, 5, 89};
        int[] arrayTwo = {8, 9, 45};
        int[] expectedResult = new int[]{};
        int[] actualResult = new OddEven().intersection(arrayOne, arrayTwo);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testPeakElement() {
        int[] peakElement = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};
        int[] actualResult = new OddEven().peakElement(peakElement);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testReverseArray() {
        int[] reverseArray = {2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};
        int[] actualResult = new OddEven().reverseArray(reverseArray);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testSortArray(){
        int[] sortArray ={4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};
        int[] actualResult = new OddEven().sortArray(sortArray);
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void teatKthLargest(){
        int[] kthLargest ={4, 3, 7, 13, 5, 2, 9, 4, 12};
        int number = 3;
        int expectedResult = 9;
        int actualResult = new OddEven().kthLargest(kthLargest,number);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
