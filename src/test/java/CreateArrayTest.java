import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.CreateArray;
import project_utils.OddEven;

public class CreateArrayTest {
    @Test
    public void testCreateIntArray() {
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int five = 5;
        int[] expectedResult = {1, 2, 3, 4, 5};
        int[] actualResult = new CreateArray().createIntArray(one, two, three, four, five);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateDoubleArray() {
        double one = 1.1;
        double two = 2.5;
        double three = 3.7;
        double four = 4.0;
        double five = 5.5;
        double[] expectedResult = {1.1, 2.5, 3.7, 4.0, 5.5};
        double[] actualResult = new CreateArray().createDoubleArray(one, two, three, four, five);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateStringArray() {
        String one = "It";
        String two = "was";
        String three = "an";
        String four = "apple";
        String fife = "pie";
        String[] expectedResult = {"It", "was", "an", "apple", "pie" };
        String[] actualResult = new CreateArray().createStringArray(one, two, three, four, fife);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateArrayFromText() {
        String array = "It was an apple pie";
        String[] expectedResult = {"It", "was", "an", "apple", "pie" };
        String[] actualResult = new CreateArray().createArrayFromText(array);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMultiplesOf() {
        int number = 2;
        int[] expectedResult = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] actualResult = new CreateArray().multiplesOf(number);
        Assert.assertEquals(actualResult,expectedResult);

    }
}
