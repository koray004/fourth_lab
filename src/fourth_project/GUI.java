package fourth_project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class GUI extends JFrame{
    JTextField t1 = new JTextField(20);
    JTextField t2 = new JTextField(20);
    JButton s1 = new JButton("Addition");
    JButton s2 = new JButton("Subtraction");
    JButton s3 = new JButton("Multiplication");
    JButton s4 = new JButton("Division");
    JButton s5 = new JButton("Clear");
    double a, k;
    double result;

    GUI(){
        super("Example");
        setLayout(new FlowLayout());
        setSize(250,180); // размер окну
        Handler handler = new Handler();
        add(t1);
        add(t2);
        add(s1);
        add(s2);
        add(s3);
        add(s4);
        add(s5);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        s5.addActionListener(handler);
        s1.addActionListener(handler);
        s2.addActionListener(handler);
        s3.addActionListener(handler);
        s4.addActionListener(handler);
    }
    public class Handler implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            try{
                a = Double.parseDouble(t1.getText());
                k = Double.parseDouble(t2.getText());
                if(e.getSource() == s5){
                    t1.setText(null);
                    t2.setText(null);
                }
                else if(e.getSource() == s1){
                    result = a + k;
                    JOptionPane.showMessageDialog(null,
                            "result = "+ result);
                }
                else if(e.getSource() == s2){
                    result = a - k;
                    JOptionPane.showMessageDialog(null,
                            "result = "+ result);
                }
                else if(e.getSource() == s3){
                    result = a * k;
                    JOptionPane.showMessageDialog(null,
                            "result = "+ result);
                }
                else if(e.getSource() == s4){
                    result = a / k;
                    JOptionPane.showMessageDialog(null,
                            "result = "+ result);
                }else
                    JOptionPane.showMessageDialog(null,
                            "Error!! ",
                            "Alert" , JOptionPane.ERROR_MESSAGE);
            }catch (Exception ex){

                JOptionPane.showMessageDialog(null,
                        "Error!!",
                        "Alert" , JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new GUI();
    }

}