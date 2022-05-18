import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class IntejerMtest {
//7.Given an integer M perform the following conditional actions:
//If M is multiple of 3 and 5 then return "Good Number".
//If M is only multiple of 3 and not of 5 then return "Bad Number"
//If M is only multiple of 5 and not of 3 then return "Poor Number"
//If M doesn't satisfy any of the above conditions then return "-1"
        @Order(1)
        @Test
       // @RepeatedTest(5)
        public void IntejerMtestHeppyPath(){

            int m = 15;


            String expectedResult = "Good Number";

            IntegerM M = new IntegerM();
            String actualResult = M.integerM(m);

            Assertions.assertEquals(expectedResult, actualResult);
        }
    @Order(2)
    @Test
    // @RepeatedTest(5)
    public void IntejerMtestHeppyPath1(){

        int m = 9;


        String expectedResult = "Bad Number";

        IntegerM M = new IntegerM();
        String actualResult = M.integerM(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(3)
    @Test
    // @RepeatedTest(5)
    public void IntejerMtestHeppyPath2(){

        int m = 10;


        String expectedResult = "Poor Number";

        IntegerM M = new IntegerM();
        String actualResult = M.integerM(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(4)
    @Test
    // @RepeatedTest(5)
    public void IntejerMtestHeppyPath3(){

        int m = 4;


        String expectedResult = " -1 ";

        IntegerM M = new IntegerM();
        String actualResult = M.integerM(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }


}
