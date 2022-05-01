import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest {

    @Test
    public void minMaxAveMHappyPath(){
        int[] get = {1,2,3,4,5,6,7,8};
        int min = 2;
        int max = 6;
        double[] expectedResult = {3,7,5};

        MinMaxAve mma = new MinMaxAve();
        double[] actualResult = MinMaxAve.minMaxAveAlgorithm(get,min,max);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
}
