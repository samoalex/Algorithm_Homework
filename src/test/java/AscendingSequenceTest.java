import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AscendingSequenceTest {
    AscendingSequence as;

    @BeforeEach
    void setUp(){
        as = new AscendingSequence();
    }

    @Order(1)
   // @RepeatedTest(10)
    @Test
    public void testAscendingSequenceHappyPath(){
        //0, 1 , 2 , 3 , 4, 5
        int start = 0;
        int end = 5;
        int step = 1;
        int[] expectedResult = {0, 1, 2, 3, 4, 5};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequence(start,end,step);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
    @Order(2)
    @Test
    public void testAscendingSequenceHappyPathNegativeNumber(){
        //-10, -9 , -8 , -7
        int start = -10;
        int end = -7;
        int step = 1;
        int[] expectedResult = {-10, -9 , -8 , -7};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequence(start,end,step);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
    @Order(3)
    @Test
    public void testAscendingSequenceHappyPathNegativePozitiveNumber(){
        //-5, -4 , -3 , -2, -1, 0, 1, 2, 3, 4, 5
        int start = -5;
        int end = 5;
        int step = 1;
        int[] expectedResult = {-5, -4 , -3 , -2, -1, 0, 1, 2, 3, 4, 5};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequence(start,end,step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testAscendingSequenceStepTwo(){
        //0, 2, 4,
        int start = 0;
        int end = 5;
        int step = 2;
        int[] expectedResult = { 0, 2, 4};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequence(start,end,step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testAscendingSequenceStartLargerThenEnd(){
        //
        int start = 5;
        int end = 0;
        int step = 2;
        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequence(start,end,step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testAscendingStepNegative(){
        //
        int start = 0;
        int end = 5;
        int step = -1;
        int[] expectedResult = {};


        int[] actualResult = as.ascendingSequence(start,end,step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testAscendingStepZero(){
        //
        int start = 0;
        int end = 5;
        int step = -1;
        int[] expectedResult = {};


        int[] actualResult = as.ascendingSequence(start,end,step);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
