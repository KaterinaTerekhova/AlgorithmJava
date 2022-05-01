import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class AscendingSequenceTest {

    @Order(2)
    @Test
        public void  testAscendingSequenceHappyPath(){

        int start = 0;
        int end = 5;
        int step = 1;
        int[] expectedResult = {0,1,2,3,4,5};  //это все Arrange

        AscendingSequence as = new AscendingSequence(); //объект
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);  // Act

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }

    @Order(1)
    @Test
    public void  testAscendingSequenceHappyPathNegativeNumbers(){

        //{-10,-9,-8,-7}

        int start = -10;
        int end = -7;
        int step = 1;
        int[] expectedResult = {-10,-9,-8,-7};  //это все Arrange

        AscendingSequence as = new AscendingSequence(); //объект
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);  // Act

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
}
