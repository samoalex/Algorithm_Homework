import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class MaxAveAlgorithmTest {
    //8.Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
// Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
// и среднее среди всех значений между 2-мя индексами.
//
//Test Data:
//({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
    @Order(1)
    @Test
//    @RepeatedTest(3)
    public void MinMaxAveTestValid_1() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = {3, 7, 5};

        MaxAveAlgorithm newArray = new MaxAveAlgorithm();
        int[] actualResult = newArray.minMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test

    public void MinMaxAveTestValidEmptyArray() {

        int[] array = {};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = new int[]{};

        MaxAveAlgorithm newArray = new MaxAveAlgorithm();
        int [] actualResult = newArray.minMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test

    public void MinMaxAveTestIndex1IsNegative() {

        int[] array = {2, 4, 7, 10};
        int index1 = -2;
        int index2 = 6;
        int[] expectedResult = new int[]{};

        MaxAveAlgorithm newArray = new MaxAveAlgorithm();
        int [] actualResult = newArray.minMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test

    public void MinMaxAveTestIndex1BiggerThanIndex2() {

        int[] array = {2, 4, 7, 10};
        int index1 = 3;
        int index2 = 2;
        int[] expectedResult = new int[]{};

        MaxAveAlgorithm newArray = new MaxAveAlgorithm();
        int [] actualResult = newArray.minMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test

    public void MinMaxAveTestIndex1EqualIndex2() {

        int[] array = {2};
        int index1 = 0;
        int index2 = 0;
        int[] expectedResult = {2, 2, 2};

        MaxAveAlgorithm newArray = new MaxAveAlgorithm();
        int [] actualResult = newArray.minMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test

    public void MinMaxAveTestZeroValues() {

        int[] array = {0, 0, 0, 0};
        int index1 = 1;
        int index2 = 2;
        int[] expectedResult = {0, 0, 0};

        MaxAveAlgorithm newArray = new MaxAveAlgorithm();
        int [] actualResult = newArray.minMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test

    public void MinMaxAveTestTwoValues() {

        int[] array = {4, 20};
        int index1 = 0;
        int index2 = 1;
        int[] expectedResult = {4, 20, 12};

        MaxAveAlgorithm newArray = new MaxAveAlgorithm();
        int [] actualResult = newArray.minMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test

    public void MinMaxAveTestIndex2IsOver() {

        int[] array = {4, 20};
        int index1 = 0;
        int index2 = 3;
        int[] expectedResult = {};

        MaxAveAlgorithm newArray = new MaxAveAlgorithm();
        int [] actualResult = newArray.minMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    public void MinMaxAveTestIndexIsNegative() {

        int[] array = {4, 20};
        int index1 = -1;
        int index2 = 2;
        int[] expectedResult = {};

        MaxAveAlgorithm newArray = new MaxAveAlgorithm();
        int [] actualResult = newArray.minMaxAveAlgorithm(array, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
