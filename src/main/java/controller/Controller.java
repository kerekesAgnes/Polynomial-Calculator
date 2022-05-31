package controller;

import model.*;
import view.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private View view;

    public Controller(View view){
        this.view = view;

        this.view.addAddButtonListener(new ActionListener() {
            String userInputP1 = "";
            String userInputP2 = "";
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    userInputP1 = view.getPolynomial1();
                    userInputP2 = view.getPolynomial2();
                    Polynomial p1 = Polynomial.createPolynomialFromString(userInputP1);
                    Polynomial p2 = Polynomial.createPolynomialFromString(userInputP2);
                    Operation add = new AddOperation();
                    Polynomial result = add.perform(p1, p2);
                    view.updateResultLabel(result.toString());
                } catch(IllegalArgumentException ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        this.view.addSubtractButtonListener(new ActionListener() {
            String userInputP1 = "";
            String userInputP2 = "";
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    userInputP1 = view.getPolynomial1();
                    userInputP2 = view.getPolynomial2();
                    Polynomial p1 = Polynomial.createPolynomialFromString(userInputP1);
                    Polynomial p2 = Polynomial.createPolynomialFromString(userInputP2);
                    Operation subtract = new SubtractOperation();
                    Polynomial result = subtract.perform(p1, p2);
                    view.updateResultLabel(result.toString());
                } catch(IllegalArgumentException ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        this.view.addDerivativeButtonListener(new ActionListener() {
            String userInputP1 = "";
            String userInputP2 = "";
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    userInputP1 = view.getPolynomial1();
                    userInputP2 = view.getPolynomial2();
                    Polynomial p1 = Polynomial.createPolynomialFromString(userInputP1);
                    Polynomial p2 = Polynomial.createPolynomialFromString(userInputP2);
                    Operation derivative = new DerivativeOperation();
                    Polynomial result = derivative.perform(p1, p2);
                    view.updateResultLabel(result.toString());
                } catch(IllegalArgumentException ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

}
