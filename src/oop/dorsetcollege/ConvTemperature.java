//STUDENT NAME: Taiane Vieira da Silva
//STUDENT ID: 21913

package oop.dorsetcollege;

        import java.awt.BorderLayout;
        import java.awt.FlowLayout;
        import java.awt.GridLayout;
        import javax.swing.JTextField;
        import javax.swing.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import javax.swing.JButton;

public class ConvTemperature extends JFrame {

    JLabel lbCelsius;
    JLabel lbFahr;
    JButton convFahToCel;
    JButton convCelToFah;
    JTextField txtCelsius;
    JTextField txtFahr;

    public ConvTemperature () {

        super ("Temperature Convertor");
        setLayout (new FlowLayout ());

        lbCelsius = new JLabel ("Celsius:       ", SwingConstants.LEFT);
        lbCelsius.setToolTipText("Temperture measurement of scale and unit.");
        add (lbCelsius);
        txtCelsius = new JTextField (10);
        add (txtCelsius);

        lbFahr = new JLabel ("Fahrenheit: ", SwingConstants.LEFT);
        lbFahr.setToolTipText("Scale in Fahrenheit");
        add (lbFahr);
        txtFahr = new JTextField (10);
        add (txtFahr);

        convCelToFah = new JButton ("Convertion from Celsius to Fahrenheit");
        add (convCelToFah);

        convFahToCel = new JButton ("Convertion from Fahrenheit to Celsius");
        add (convFahToCel);


        JPanel panel = new JPanel(new GridLayout(2, 2, 12, 6));
        panel.add(lbCelsius);
        panel.add(lbFahr);
        panel.add(txtCelsius);
        panel.add(txtFahr);
        add(panel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(convCelToFah);
        buttonPanel.add(convFahToCel);
        add(buttonPanel, BorderLayout.SOUTH);

        convCelToFah.addActionListener(new ListenerCelsius ());
        convFahToCel.addActionListener(new ListenerFahr ());

    }


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