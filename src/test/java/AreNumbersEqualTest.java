import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
//6.Напишите алгоритм AreNumbersEqual, который принимает на вход 2 любых int числа, и возвращает
//0, если числа равны
//-1, если первое число меньше второго
//1, если первое число больше второго
//
//Test Data:
//89, 89
//Expected result: 0
//-89, 89
//Expected result: -1
//89, -89
//Expected result: 1
public class AreNumbersEqualTest {
    @Order(1)
    @Test
    @RepeatedTest(20)
    public void AreNumbersEqualHappyPath(){

        int a = 89;
        int b = 89;

        int expectedResult = 0;

        AreNumbersEqual bigV = new AreNumbersEqual();
        int actualResult = bigV.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(2)
    @Test
    public void AreNumbersEqualHappyPath1(){

        int a = 89;
        int b = -89;

        int expectedResult = 1;

        AreNumbersEqual bigV = new AreNumbersEqual();
        int actualResult = bigV.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(3)
    @Test
    public void AreNumbersEqualHappyPath2(){

        int a = -89;
        int b = 89;

        int expectedResult = -1;

        AreNumbersEqual bigV = new AreNumbersEqual();
        int actualResult = bigV.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
