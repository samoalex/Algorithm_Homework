import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseArrayTest {
    @Test
    public void reversArrayAlgoritmTestPositive_1() {
        int[] array = {2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};

        ReverseArray revA = new ReverseArray();
        int[] actualResult = revA.reversArrayAlgoritm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void reversArrayAlgoritmTestNegative() {
        int[] array = {};
        int[] expectedResult = {};

        ReverseArray revA = new ReverseArray();
        int[] actualResult = revA.reversArrayAlgoritm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void reversArrayAlgoritmTestNegative1() {
        int[] array = {-1, -5 , 10, -4};
        int[] expectedResult = {-4, 10, -5, -1};

        ReverseArray revA = new ReverseArray();
        int[] actualResult = revA.reversArrayAlgoritm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}