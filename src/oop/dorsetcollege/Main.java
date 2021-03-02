//STUDENT NAME: Taiane Vieira da Silva
//STUDENT ID: 21913

package oop.dorsetcollege;

import javax.swing.*;
import java.awt.*;


public class Main {

    public static void main(String[] args) {

        Color orange = new Color(253,136,47);
        ConvTemperature app = new ConvTemperature ();
        app.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        app.setSize (500, 150);
        app.setVisible (true);
        app.getContentPane().setBackground(orange);

    }

}