import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOccurrencesTest {
    @Test
    public void numbOccurTestPositive(){
        int[] a = {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};
        int[][] expectedResult = {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}};

        NumberOccurrences numOk = new NumberOccurrences();
        int[][] actualResult = numOk.numberOccurrencesAlgoritm(a);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
}
