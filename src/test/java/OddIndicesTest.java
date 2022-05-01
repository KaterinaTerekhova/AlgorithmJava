import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {

    @Test
    public void oddIndicesHappyPath() {
        int[] arr = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {-45, 985};


        OddIndices oi = new OddIndices(); //объект
        int[] actualResult = OddIndices.oddIndicesAlgorithm(arr);  // Act

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}