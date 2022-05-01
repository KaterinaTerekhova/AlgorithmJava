import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class SumArrayTest {
    @Order(1)
    @Test
    public void sumArrayHappyPathPositiveNum() {
        int[] getNew = new int[]{1,2,3,4,5};
        int expectedResult = 15;


        SumArray sa = new SumArray(); //объект
        int actualResult = SumArray.sumArrayAlgorithm(getNew);  // Act

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void sumArrayHappyPathNegativeNum() {
        int[] getNew = new int[]{-7,-3};
        int expectedResult = -10;


        SumArray sa = new SumArray(); //объект
        int actualResult = SumArray.sumArrayAlgorithm(getNew);  // Act

        Assertions.assertEquals(expectedResult, actualResult);
    }
}

