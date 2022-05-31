package model;

import java.util.Comparator;

public class Monomial {

    private int coefficient;
    private int power;

    public Monomial(int coefficient, int power){
        this.coefficient = coefficient;
        this.power = power;
    }

    public int getCoefficient(){
        return this.coefficient;
    }

    public int getPower(){
        return this.power;
    }

    public String toString(){
       String result = "";
       if (coefficient < 0){
           result = "";
       }
       else{
           result = "+";
       }
       result += this.coefficient + "x^" + this.power;
        return result;
    }

}
