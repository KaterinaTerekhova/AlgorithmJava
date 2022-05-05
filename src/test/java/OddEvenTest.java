import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenTest {

    @Test
    public void oddEvenHappyPathPositive(){

        long number = 238;
        java.lang.String expectedResult = "Even";

        OddEven as = new OddEven();
        java.lang.String actualResult = as.oddEven(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void oddEvenHappyPathNegative(){

        long number = -214748346 ;
        java.lang.String expectedResult = "Even";

        OddEven as = new OddEven();
        java.lang.String actualResult = as.oddEven(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void oddEvenHappyPathZero(){

        long number = 0;
        java.lang.String expectedResult = "Even";

        OddEven as = new OddEven();
        java.lang.String actualResult = as.oddEven(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void oddEvenHappyPathOddNum(){

        long number = 239;
        java.lang.String expectedResult = "Odd";

        OddEven as = new OddEven();
        java.lang.String actualResult = as.oddEven(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void oddEvenHappyPathLong(){

        long number = (2147483647 + 1);
        java.lang.String expectedResult = "Undefined";

        OddEven as = new OddEven();
        java.lang.String actualResult = as.oddEven(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
