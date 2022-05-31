package model;

import java.util.Comparator;

public class MonomialComparator implements Comparator<Monomial> {
    public int compare(Monomial m1, Monomial m2) {
        return m2.getPower() - m1.getPower();
    }
}
