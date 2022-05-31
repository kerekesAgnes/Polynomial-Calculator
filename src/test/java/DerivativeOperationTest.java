import model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DerivativeOperationTest {
    @Test
    public void testDerivativeOperation(){
        Polynomial polynomial = Polynomial.createPolynomialFromString("+3x^2+1x^1-5x^0");
        Polynomial p2 = new Polynomial();
        Operation derivative = new DerivativeOperation();
        Polynomial result = derivative.perform(polynomial, p2);
        String resultString = result.toString();
        assertEquals("+6x^1+1x^0", resultString);
    }
}
