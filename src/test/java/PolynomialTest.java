import model.Polynomial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PolynomialTest {
    @Test
    public void testPolynomial(){
        Polynomial polynomial = Polynomial.createPolynomialFromString("+3x^2+1x^1-5x^0");
        String resultString = polynomial.toString();
        assertEquals("+3x^2+1x^1-5x^0", resultString);
    }

}
