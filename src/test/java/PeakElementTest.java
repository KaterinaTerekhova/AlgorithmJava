import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PeakElementTest {

    @Test
    public void peakElementHuppyPath(){
        int[] arr = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};

        PeakElement pe = new PeakElement();
        int[] actualResult = pe.peakElement(arr);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
