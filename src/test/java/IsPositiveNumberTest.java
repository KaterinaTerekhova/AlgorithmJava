import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {

    @Order(3)
    @Test
    public void isPositiveNumberHappyPathPositiveNum() {
        int argument = 555;
        boolean expectedResult = true;


        IsPositiveNumber pn = new IsPositiveNumber(); //объект
        boolean actualResult = IsPositiveNumber.isPositiveNumber(argument);  // Act

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(1)
    @Test
    public void isPositiveNumberHappyPathNull() {
        int argument = 0;
        boolean expectedResult = true;


        IsPositiveNumber pn = new IsPositiveNumber(); //объект
        boolean actualResult = IsPositiveNumber.isPositiveNumber(argument);  // Act

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void isPositiveNumberHappyPathNegativeNum() {
        int argument = -555;
        boolean expectedResult = false;


        IsPositiveNumber pn = new IsPositiveNumber(); //объект
        boolean actualResult = IsPositiveNumber.isPositiveNumber(argument);  // Act

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
