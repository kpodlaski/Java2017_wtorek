package pl.uni.lodz.wfis.java2017w.zajecia6;

import javafx.scene.input.KeyCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Krzysztof Podlaski on 11.04.2017.
 */
public class MyBorderForm {
    private JTextField imieTextField;
    private JPanel panel1;
    private JButton wielkiKlikButton;
    private JRadioButton radioRadioButton;
    private JCheckBox myCheckBox;
    private JTextArea textArea1;

    public MyBorderForm() {
        wielkiKlikButton.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imieTextField.setText("Ala ma kota");
            }
        });

        imieTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                System.out.println(e.getKeyCode());
                if (KeyEvent.VK_B == e.getKeyCode())
                {
                    System.out.print("B");
                }
            }
        });
        imieTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(imieTextField.getText());
            }
        });
        textArea1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                System.out.println(textArea1.getText());
            }
        });
    }

    public static void main(String[] a){
        JFrame jframe = new JFrame("Moja Aplikacjia");
        jframe.setSize(200,400);
        MyBorderForm myBorderForm = new MyBorderForm();
        jframe.add(myBorderForm.panel1, BorderLayout.EAST);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        jframe.setLocation(screenSize.width/2,screenSize.height/2);
        jframe.setVisible(true);
        for (int i=0; i<1000; i++){
            System.out.println(i);
        }
        System.out.println("Koniec Programu");

    }
}
