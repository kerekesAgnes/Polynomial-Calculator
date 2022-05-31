import model.AddOperation;
import model.Monomial;
import model.Operation;
import model.Polynomial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddOperationTest {
        @Test
        public void testAddBasic(){
                Polynomial firstPolynomial = Polynomial.createPolynomialFromString("+3x^2+1x^1-5x^0");
                Polynomial secondPolynomial = Polynomial.createPolynomialFromString("+3x^2+1x^1-5x^0");
                Operation add = new AddOperation();
                Polynomial result = add.perform(firstPolynomial, secondPolynomial);
                String resultString = result.toString();
                assertEquals("+6x^2+2x^1-10x^0", resultString);
        }
}


