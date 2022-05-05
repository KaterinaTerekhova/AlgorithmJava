import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenTest {

    @Test
    public void oddEvenHappyPath(){

        long number = 238L;
        String expectedResult = "Even";

        OddEven oe = new OddEven();
        String actualResult = oe.oddEven(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
