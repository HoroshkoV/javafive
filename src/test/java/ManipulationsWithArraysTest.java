import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.ManipulationsWithArrays;

public class ManipulationsWithArraysTest {
    @Test
    public void testMultiplуArrayByNumber() {
        int[] array = {1, 2, 3, 4, 5};
        int number = 3;
        int[] actualResult = {3, 6, 9, 12, 15};
        int[] expectedResult = new ManipulationsWithArrays().multiplуArrayByNumber(array, number);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToDoubleArray() {
        int[] array = {1, 2, 3, 4, 5};
        double[] actualResult = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] expectedResult = new ManipulationsWithArrays().toDoubleArray(array);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToIntArray() {
        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};
        int[] actualResult = {1, 2, 3, 4, 5};
        int[] expectedResult = new ManipulationsWithArrays().toIntArray(array);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToStringArray() {
        int[] array = {1, 2, 3, 4, 5};
        String[] actualResult = {"1", "2", "3", "4", "5"};
        String[] expectedResult = new ManipulationsWithArrays().toStringArray(array);
        Assert.assertEquals(actualResult,expectedResult);

    }
    @Test
    public void testToStringArrayDouble() {
        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};
        String[] actualResult = {"1.1", "2.5", "3.7", "4.0", "5.5"};
        String[] expectedResult = new ManipulationsWithArrays().toStringArray(array);
        Assert.assertEquals(actualResult,expectedResult);

    }

}
