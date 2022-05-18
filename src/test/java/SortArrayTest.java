import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortArrayTest {

    @Test

    public void sortArrayTestPositive(){
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        SortArray sArr = new SortArray();
        int[] actualResult = sArr.sortArrayAlgorithm(array);
        Assertions.assertArrayEquals(actualResult,expectedResult);
    }

    @Test
    public void sortArrayTestPositiveNegNum(){
        int[] array = {-4, 3, 7, 12, 5, 2, -9, 4, 12};
        int[] expectedResult = {-9, -4, 2, 3, 4, 5, 7, 12, 12};

        SortArray sArr = new SortArray();
        int[] actualResult = sArr.sortArrayAlgorithm(array);
        Assertions.assertArrayEquals(actualResult,expectedResult);
    }

    @Test
    public void sortArrayTestPositiveEmptyArray(){
        int[] array = {};
        int[] expectedResult = {};

        SortArray sArr = new SortArray();
        int[] actualResult = sArr.sortArrayAlgorithm(array);
        Assertions.assertArrayEquals(actualResult,expectedResult);
    }

    @Test
    public void sortArrayTestPositiveEOneNumberArray(){
        int[] array = {4};
        int[] expectedResult = {4};

        SortArray sArr = new SortArray();
        int[] actualResult = sArr.sortArrayAlgorithm(array);
        Assertions.assertArrayEquals(actualResult,expectedResult);
    }
}
