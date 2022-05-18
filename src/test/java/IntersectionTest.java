import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntersectionTest {
    @Test
    public void intersectionPositive(){
        //Test Data:
        //{1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
        //{1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
        //{1, 2, 4, 5, 89}, {8, 9, 45} → {}

        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};

        Intersection intArr = new Intersection();
        int[] actualResult = intArr.intersection(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
