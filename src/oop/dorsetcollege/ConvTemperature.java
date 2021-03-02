//STUDENT NAME: Taiane Vieira da Silva
//STUDENT ID: 21913

package oop.dorsetcollege;


import java.awt.*;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ConvTemperature extends JFrame {

    JRadioButton btCelsius;
    JRadioButton btFahr;
    JButton convFahToCel;
    JButton convCelToFah;
    JTextField txtCelsius;
    JTextField txtFahr;
    JPanel panel1;
    JPanel panel2;

    public ConvTemperature () {

        super ("Temperature Conversion");
        setLayout (new FlowLayout ());

        //Setting colors to be used on the panel
        Color orange = new Color(253, 136, 47);
        Color blue = new Color(18, 96, 153);
        panel1 = new JPanel(new GridLayout());
        panel2 = new JPanel(new GridLayout());
        panel1.setBackground(orange);
        panel2.setBackground(blue);

        //The code bellow is to create the radio buttons
        btCelsius = new JRadioButton ("Celsius");
        add (btCelsius);
        btCelsius.setBackground(orange);
        btCelsius.setForeground(Color.WHITE);
        txtCelsius = new JTextField (10);
        txtCelsius.setBackground(Color.WHITE);
        //txtCelsius.setForeground(Color.WHITE);
        add (txtCelsius);

        btFahr = new JRadioButton ("Fahrenheit: ");
        add (btFahr);
        btFahr.setBackground(orange);
        btFahr.setForeground(Color.WHITE);
        txtFahr = new JTextField (10);
        txtFahr.setBackground(Color.WHITE);
        //txtFahr.setForeground(Color.WHITE);
        add (txtFahr);

        //Buttons for convertion
        convCelToFah = new JButton ("Celsius to Fahrenheit");
        convCelToFah.setBackground(blue);
        convCelToFah.setForeground(Color.WHITE);
        add (convCelToFah);

        convFahToCel = new JButton ("Fahrenheit to Celsius");
        convFahToCel.setBackground(blue);
        convFahToCel.setForeground(Color.WHITE);
        add (convFahToCel);

        //Code to set the layout for the panel
        JPanel panel = new JPanel(new GridLayout(2, 2, 12, 10));
        panel.add(btCelsius);
        panel.add(btFahr);
        panel.add(txtCelsius);
        panel.add(txtFahr);
        panel.setBackground(orange);
        add(panel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(convCelToFah);
        buttonPanel.add(convFahToCel);
        add(buttonPanel, BorderLayout.SOUTH);
        buttonPanel.setBackground(orange);

        convCelToFah.addActionListener(new ListenerCelsius ());
        convFahToCel.addActionListener(new ListenerFahr ());

    }

    //Code with the commands to calculate the conversion from Celsius to Fahrenheit
    private class ListenerCelsius implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            if (event.getSource() == convCelToFah){
                int convCelToFah = (int) (( 9.0/5.0 * (((Double.parseDouble(txtCelsius.getText())) + 32))));
                txtFahr.setText(convCelToFah + " °F");
                txtCelsius.requestFocus();
                txtCelsius.selectAll();
            }

        }
    }

    //Code with the commands to calculate the conversion from Fahrenheit to Celsius
    private class ListenerFahr implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            if (event.getSource() == convFahToCel){
                int convFahToCel = (int) ((5.0/9.0 * (((Double.parseDouble(txtFahr.getText())) -32))));
                txtCelsius.setText(convFahToCel + " °C");
                txtFahr.requestFocus();
                txtFahr.selectAll();
            }

        }
    }

}