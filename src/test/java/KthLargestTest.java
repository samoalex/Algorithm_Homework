import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthLargestTest {
    //13.Написать алгоритм KthLargest, который принимает на вход массив целых чисел и число k, и возвращает
    // k-тый максимальный элемент.
    //Test Data:
    //({4, 3, 7, 12, 5, 2, 9, 4, 12}, 3) → 9
    @Test

    public void kthLargestTestPositive(){
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 3;
        int expectedResult = 9;

        KthLargest kthL = new KthLargest();
        int actualResult = kthL.kthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
