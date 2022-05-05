import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class AreNumbersEqualTest {

    @Order(1)
    @Test
    public void testAreNumbersEqualHappyPathPositiveNum() {
        int ff = 89;
        int gg = 89;
        int expectedResult = 0;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = AreNumbersEqual.areNumbersEqualAlgorithm(ff, gg);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testAreNumbersEqualHappyPathOneNegativeNum() {
        int ff = -89;
        int gg = 89;
        int expectedResult = -1;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = AreNumbersEqual.areNumbersEqualAlgorithm(ff, gg);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testAreNumbersEqualHappyPathAnotherNegativeNum() {
        int ff = 89;
        int gg = -89;
        int expectedResult = 1;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = AreNumbersEqual.areNumbersEqualAlgorithm(ff, gg);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testAreNumbersEqualINegativePath() {
        int ff = 89;
        int gg = -89;
        int expectedResult = 0;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = AreNumbersEqual.areNumbersEqualAlgorithm(ff, gg);
        Assertions.assertEquals(expectedResult, actualResult);
    }

}
