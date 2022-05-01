import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddIndicesAdditionalTest {

    @Test
    public void oddIndicesHappyPath() {
        int[] arr = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};


        OddIndices oi = new OddIndices(); //объект
        int[] actualResult = OddIndicesAdditional.oddIndicesAlgorithm1(arr);  // Act

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}