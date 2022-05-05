import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerMTest {

    @Test
    public void integerMHuppyPathGood(){

        int m = 30;
        java.lang.String expectedResult = "Good Number";

        Integer as = new Integer();
        java.lang.String actualResult = as.integerM(m);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void integerMHuppyPathPoor(){

        int m = 25;
        java.lang.String expectedResult = "Poor Number";

        Integer as = new Integer();
        java.lang.String actualResult = as.integerM(m);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void integerMHuppyPathUnexpected(){

        int m = 8;
        java.lang.String expectedResult = "does not satisfy";

        Integer as = new Integer();
        java.lang.String actualResult = as.integerM(m);
        Assertions.assertEquals(expectedResult, actualResult);
    }




}
