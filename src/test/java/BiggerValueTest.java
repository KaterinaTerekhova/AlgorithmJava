import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BiggerValueTest {

    @Test
    public void biggerValueHappyPathPositiveNum() {
        int numA = 3333;
        int numB = 9999;
        int expectedResult = 9999;


        BiggerValue bv = new BiggerValue(); //объект
        int actualResult = BiggerValue.biggerValueAlgorithm(numA,numB);  // Act

        Assertions.assertEquals(expectedResult, actualResult);
    }
}

