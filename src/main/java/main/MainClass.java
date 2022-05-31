package main;

import controller.Controller;
import view.View;

public class MainClass {

    public static void main (String[] args){
        View view = new View();
        view.setVisible(true);
        Controller controller = new Controller(view);
    }
}
