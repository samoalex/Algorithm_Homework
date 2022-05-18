import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

//1.Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,  если число нечетное,
// и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.
//
//Test Data:
//-345 →  “Odd”
//0 →  “Even”
//222222 →  “Even”
//2147483647 + 1 →  “Undefined”

public class HW9test {
    @Order(1)
    @Test
    //@RepeatedTest(20)
    public void testOddEvenHeppyPositivOddNumber(){
        long number = 1;
        String expectedResult = "Odd";

        HW9 as = new HW9();
        String actualResult = as.oddEvenAlgoritm(number);
        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Order(2)
    @Test

    public void testOddEvenHeppyPositivEvenNumber(){
        long number = 2;
        String expectedResult = "Even";

        HW9 as = new HW9();
        String actualResult = as.oddEvenAlgoritm(number);
        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Order(3)
    @Test

    public void testOddEvenHeppyNegativOddNumber(){
        long number = -1;
        String expectedResult = "Odd";

        HW9 as = new HW9();
        String actualResult = as.oddEvenAlgoritm(number);
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(4)
    @Test

    public void testOddEvenHeppyNegativEvenNumber(){
        long number = -2;
        String expectedResult = "Even";

        HW9 as = new HW9();
        String actualResult = as.oddEvenAlgoritm(number);
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(5)
    @Test

    public void testOddEvenHeppyZeroEvenNumber(){
        long number = 0;
        String expectedResult = "Even";

        HW9 as = new HW9();
        String actualResult = as.oddEvenAlgoritm(number);
        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Order(6)
    @Test

    public void testOddEvenHeppyNegativUndefined(){
        long number = -2147483649l;
        String expectedResult = "Undefined";

        HW9 as = new HW9();
        String actualResult = as.oddEvenAlgoritm(number);
        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Order(7)
    @Test

    public void testOddEvenHeppyPositivUndefined(){
        long number = 2147483649l;
        String expectedResult = "Undefined";

        HW9 as = new HW9();
        String actualResult = as.oddEvenAlgoritm(number);
        Assertions.assertEquals(expectedResult,actualResult);
    }
//2.Написать алгоритм OddIndices, который принимает массив чисел,  и возвращает массив значений нечетных индексов
//Test Data:
//Input = {-45, 590, 234, 985, 12, 68}
//Expected Result =  {590, 985, 68}
    @Test
    public void testHW_9TestPositiveOddIndices() {
    int[] array = {-45, 590, 234, 985, 12, 68};
    int[] expectedResult = {590, 985, 68};

    HW9 oddArr = new HW9();
    int[] actualResult = oddArr.oddIndices(array);

    Assertions.assertArrayEquals(expectedResult, actualResult);
}

    @Test
    public void testHW_9TestPositiveOddIndicesZeros() {
        int[] array = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] expectedResult = {0, 0, 0, 0};

        HW9 oddArr = new HW9();
        int[] actualResult = oddArr.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testHW_9TestNegativeOddIndicesEmptyArray() {
        int[] array = {};
        int[] expectedResult = {};

        HW9 oddArr = new HW9();
        int[] actualResult = oddArr.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testHW_9TestPositiveOddIndicesOneValueArray() {
        int[] array = {25};
        int[] expectedResult = {};

        HW9 oddArr = new HW9();
        int[] actualResult = oddArr.oddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
//3.Написать алгоритм SumArray, который возвращает сумму всех чисел массива
//Test Data:
//{0, 1, 2, 3, 4, 5} → 15
//{-7, -3} → -10




}
