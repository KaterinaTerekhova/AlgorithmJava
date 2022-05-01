import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseArrayTest {

    @Test
    public void reverseArrayHappyPath(){

        int[] arr2 = {2, 7, 3, 10};
        int n = 4;
        int[] expectedResult = {10, 3, 7, 2};

        ReverseArray ra = new ReverseArray();
        int[] actualResult = ReverseArray.reverseArrayAlgorithm(arr2,n);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
}
