import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
//10.Написать алгоритм PeakElement,  который принимает на вход массив целых чисел и возвращает значения
// пиковых элементов (элементы, которые больше своих соседей).
//Test Data:
//{3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
public class PeakElementTest {

    @Test
    @Order(1)
    public void testPeakElementHeppyPath() {
        //{3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
        int[] array = {3, 2, 7,4,8, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 8,23};

        PeakElement peakElement1 = new PeakElement();
        int[] actualResult = peakElement1.peakElement(array);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    @Order(2)
    public void testPeakElementHeppyPath1() {
        //{3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
        int[] array = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};

        PeakElement peakElement1 = new PeakElement();
        int[] actualResult = peakElement1.peakElement(array);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    @Order(3)
    public void testPeakElementNeg() {
        //{3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
        int[] array = {2, 2, 2, 2, 2, 2, 2, 2};
        int[] expectedResult = {};

        PeakElement peakElement1 = new PeakElement();
        int[] actualResult = peakElement1.peakElement(array);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}