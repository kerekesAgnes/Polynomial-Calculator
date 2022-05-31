package model;

public class DerivativeOperation implements Operation{

    @Override
    public Polynomial perform(Polynomial p1, Polynomial p2) {
        Polynomial result = new Polynomial();

        for(Monomial m : p1.getMonomial()){
            if(m.getPower() != 0){
                int derivativeCoefficient = m.getCoefficient() * m.getPower();
                int derivativePower = m.getPower() - 1;
                Monomial derivativeMonomial = new Monomial(derivativeCoefficient, derivativePower);
                result.addMonomial(derivativeMonomial);
            }
        }

        return result;
    }
}
