import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class BiggerValueTest {


    @Order(1)
    @Test
    public void testBiggerValueHappyPath(){

        int a = 3333;
        int b = 9999;

        int expectedResult = 9999;

        BiggerValue bigV = new BiggerValue();
        int actualResult = bigV.biggerValue(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testBiggerValuePositiveEquals() {
        int a = 9999;
        int b = 9999;
        int expectedResult = 9999;

        BiggerValue bigV = new BiggerValue();
        int actualResult = bigV.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBiggerValuePositiveB() {
        int a = 9999;
        int b = 15000;
        int expectedResult = 15000;

        BiggerValue bigV = new BiggerValue();
        int actualResult = bigV.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBiggerValuePositiveNegativeNumbers() {
        int a = -15;
        int b = -1;
        int expectedResult = -1;

        BiggerValue bigV = new BiggerValue();
        int actualResult = bigV.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }


}
