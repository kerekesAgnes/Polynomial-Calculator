import model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractOperationTest {

    @Test
    public void testSubtractBasic(){
        Polynomial firstPolynomial = Polynomial.createPolynomialFromString("+3x^2+1x^1-5x^0");
        Polynomial secondPolynomial = Polynomial.createPolynomialFromString("+3x^2+1x^1-5x^0");
        Operation subtract = new SubtractOperation();
        Polynomial result = subtract.perform(firstPolynomial, secondPolynomial);
        String resultString = result.toString();
        assertEquals("+0x^2+0x^1+0x^0", resultString);
    }
}
