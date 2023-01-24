/*
Write a Swing program to create frame window and three text fields to input 
three floating point numbers from the user and displays sum, average and largest 
of these three numbers in a dialog box.
 */
package swings;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator implements ActionListener {

      JTextField num1TextField, num2TextField, num3TextField;
      JButton sumButton, averageButton, largestButton;
      JLabel resultLabel;

      public Calculator() {
            JFrame frame = new JFrame("Calculator");
            frame.setSize(250, 250);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new FlowLayout());
            frame.setLocationRelativeTo(null);
            
//            JLabel header = new JLabel("Calculator");
//            header.setFont(new Font("Arial Bold", Font.BOLD, 20));
//            frame.add(header);
//            
            num1TextField = new JTextField(20);
            num2TextField = new JTextField(20);
            num3TextField = new JTextField(20);

//            Panel panel = new Panel(new GridLayout(3, 2, 10, 10));
//            panel.add(new Label("Number 1"));
//            panel.add(num1TextField);
//            panel.add(new Label("Number 2"));
//            panel.add(num2TextField);
//            panel.add(new Label("Number 3"));
//            panel.add(num3TextField);
//            frame.add(panel);
            
            frame.add(new JLabel("num1"));
            frame.add(num1TextField);
            frame.add(new JLabel("num2"));
            frame.add(num2TextField);
            frame.add(new JLabel("num3"));
            frame.add(num3TextField);
            
            
            
            
            sumButton = new JButton("Sum");
            sumButton.addActionListener(this);
            frame.add(sumButton);

            averageButton = new JButton("Average");
            averageButton.addActionListener(this);
            frame.add(averageButton);

            largestButton = new JButton("Largest");
            largestButton.addActionListener(this);
            frame.add(largestButton);
            
            frame.setVisible(true);
      }

      @Override
      public void actionPerformed(ActionEvent e) {
            double n1, n2, n3;
            try {
                  n1 = Double.parseDouble(num1TextField.getText());
                  n2 = Double.parseDouble(num2TextField.getText());
                  n3 = Double.parseDouble(num3TextField.getText());
            }
            catch (NumberFormatException | NullPointerException ex) {
                  JOptionPane.showMessageDialog(null, "Invalid input.");
                  return;
            }            
            
            if (e.getActionCommand().equals("Sum")) {
                  JOptionPane.showMessageDialog(null, "Sum = " + (n1 + n2 + n3));
            }
            else if (e.getActionCommand().equals("Average")) {
                  JOptionPane.showMessageDialog(null, "Average = " + ((n1 + n2 + n3) / 3));
            }
            else {
                  double largest = (n1 > n2 && n1 > n3)? n1 : (n2 > n3)? n2 : n3;
                  JOptionPane.showMessageDialog(null, "Largest = " + largest);
            }
      }
      
      public static void main(String[] args) {
            new Calculator();
      }
}
