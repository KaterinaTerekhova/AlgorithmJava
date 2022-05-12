import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    @Test
    public void reverseStringPathPositive(){

        String strNew = "Abracadabra";
        String expectedResult = "arbadacarbA";

        ReverseString rs = new ReverseString();
        String actualResult = rs.reverseStringAlgorithm(strNew);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
