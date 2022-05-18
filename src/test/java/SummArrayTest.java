import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//3.Написать алгоритм SumArray, который возвращает сумму всех чисел массива
//Test Data:
//{0, 1, 2, 3, 4, 5} → 15
//{-7, -3} → -10
public class SummArrayTest {

    @Test
    public void testSumArrayTestPositive_1() {
        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SummArray suA = new SummArray();
        int actualResult = suA.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayTestPositive_2() {
        int[] array = {-7, -3};
        int expectedResult = -10;

        SummArray suA = new SummArray();
        int actualResult = suA.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayTestNegativeEmptyArray() {
        int[] array = {};
        int expectedResult = 0;

        SummArray suA = new SummArray();
        int actualResult = suA.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayTestNegativeOneValueArray() {
        int[] array = {5};
        int expectedResult = 5;

        SummArray suA = new SummArray();
        int actualResult = suA.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }





}
