package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Polynomial {

    private ArrayList<Monomial> monomials;


    public Polynomial() {
        monomials = new ArrayList<Monomial>();
    }

    public void addMonomial(Monomial m){
        this.monomials.add(m);
    }

    public List<Monomial> getMonomial(){
        return monomials;
    }

    public Monomial getMonomialWithSamePower(int power){
        for (Monomial m:monomials) {
            if(power == m.getPower()) {
                return m;
            }
        }
        return null;
    }

    public void sort(){
        monomials.sort(new MonomialComparator());
    }

    public String toString(){
       String result = "";
        for (Monomial m: monomials) {
            result += m.toString();
        }
        return result;
    }

    public static Polynomial createPolynomialFromString(String input){
        String pattern = "([+-]?\\d+)x\\^(\\d+)";
        Pattern p = Pattern.compile(pattern);
        Polynomial polynom = new Polynomial();
        Matcher m = p.matcher(input);
        int currentEnd = 0;

        while(m.find()){
            int coefficient = Integer.parseInt(m.group(1));
            int power = Integer.parseInt(m.group(2));
            Monomial monom = new Monomial(coefficient, power);
            polynom.addMonomial(monom);
            if(m.start() != currentEnd){
                throw new IllegalArgumentException("Invalid polynomial");
            }
            currentEnd = m.end();
        }

        if(currentEnd != input.length()){
            throw new IllegalArgumentException("Invalid polynomial");
        }

        return polynom;
    }
}
