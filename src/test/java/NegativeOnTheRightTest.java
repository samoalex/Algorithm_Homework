import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NegativeOnTheRightTest {
    //14.Написать алгоритм NegativeOnTheRight, который принимает на вход массив целых чисел,
    // и возвращает массив,  в котором все негативные числа находятся во второй половине массива
    //Test Data:
    //{4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}
    @Test

    public void negativeOnTheRightTestPositive(){
        int[] array = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult = {4, 7, 5, 9, 4, 12, -2, -12, -3};

        NegativeOnTheRight negR = new NegativeOnTheRight();
        int[] actualResult = negR.negativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
