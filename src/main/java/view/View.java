package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View  extends JFrame{
    private JTextField p1TextField;
    private JTextField p2TextField;
    private JLabel p1TextLabel;
    private JLabel p2TextLabel;
    private JLabel resultTextLabel;
    private JLabel resultLabel;
    private JButton addButton;
    private JButton subtractButton;
    private JButton derivativeButton;

    public View(){
        setTitle("Polynomial Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 550, 400);
        getContentPane().setLayout(null);

        p1TextLabel = new JLabel("First Polynomial =");
        p1TextLabel.setBounds(40, 30, 120, 20);
        getContentPane().add(p1TextLabel);

        p2TextLabel = new JLabel("Second Polynomial =");
        p2TextLabel.setBounds(40, 80, 130, 20);
        getContentPane().add(p2TextLabel);

        resultTextLabel = new JLabel("Result = ");
        resultTextLabel.setBounds(80, 180, 120, 20);
        getContentPane().add(resultTextLabel);

        resultLabel = new JLabel("");
        resultLabel.setBounds(200, 180, 300, 20);
        getContentPane().add(resultLabel);

        p1TextField = new JTextField();
        p1TextField.setBounds(200, 30, 200, 20);
        getContentPane().add(p1TextField);

        p2TextField = new JTextField();
        p2TextField.setBounds(200, 80, 200, 20);
        getContentPane().add(p2TextField);

        addButton = new JButton("Add");
        addButton.setBounds(100, 120, 80, 20);
        getContentPane().add(addButton);

        subtractButton = new JButton("Subtract");
        subtractButton.setBounds(200, 120, 100, 20);
        getContentPane().add(subtractButton);

        derivativeButton = new JButton("Derivative P1");
        derivativeButton.setBounds(320, 120, 120, 20);
        getContentPane().add(derivativeButton);
    }

    public void addAddButtonListener(ActionListener actionListener){
        this.addButton.addActionListener(actionListener);
    }

    public void addSubtractButtonListener(ActionListener actionListener){
        this.subtractButton.addActionListener(actionListener);
    }

    public void addDerivativeButtonListener(ActionListener actionListener){
        this.derivativeButton.addActionListener(actionListener);
    }

    public String getPolynomial1(){
        return this.p1TextField.getText();
    }

    public String getPolynomial2(){
        return this.p2TextField.getText();
    }

    public void updateResultLabel(String newValue) {
        this.resultLabel.setText(newValue);
    }

}
