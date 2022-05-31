package model;

public class AddOperation implements Operation {

    @Override
    public Polynomial perform(Polynomial p1, Polynomial p2) {
        Polynomial result = new Polynomial();

        for (Monomial m:p1.getMonomial()) {
            Monomial p2Monomial = p2.getMonomialWithSamePower(m.getPower());
            if(p2Monomial != null){
                int resultCoefficient = m.getCoefficient() + p2Monomial.getCoefficient();
                Monomial monomialResult = new Monomial(resultCoefficient, m.getPower());
                result.addMonomial(monomialResult);
            }
            else {
                Monomial monomialResult = new Monomial(m.getCoefficient(), m.getPower());
                result.addMonomial(monomialResult);
            }
        }
        for (Monomial m : p2.getMonomial()){
            Monomial p1Monomial = p1.getMonomialWithSamePower(m.getPower());
            if(p1Monomial == null){
                Monomial monomialResult = new Monomial(m.getCoefficient(), m.getPower());
                result.addMonomial(monomialResult);
            }
        }
        result.sort();
        return result;
    }

}
