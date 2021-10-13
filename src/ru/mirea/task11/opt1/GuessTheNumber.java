package ru.mirea.task11.opt1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GuessTheNumber extends JFrame {
    public int attempts = 3;
    int rand = (int) (Math.random() * 20);
    public GuessTheNumber(){
        JFrame frame = new JFrame("GuessTheNumber");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane();
        frame.setSize(640,480);
        frame.setLayout(null);
        JButton but1 = new JButton("Guess Number!");
        but1.setBounds(250,240,150,20);
        frame.add(but1);
        JButton but2 = new JButton("Restart!");
        but2.setBounds(250,280,150,20);
        frame.add(but2);
        JLabel labelAttempts = new JLabel("Attempts left: 3");
        labelAttempts.setBounds(280,320,150,20);
        frame.add(labelAttempts);
        JTextField inputOfNumber = new JTextField();
        inputOfNumber.setBounds(80,240,150,20);
        frame.add(inputOfNumber);
        JLabel inputLabel = new JLabel("Input your number!");
        inputLabel.setBounds(100,220,150,20);
        frame.add(inputLabel);
        JLabel infoLabel = new JLabel("");
        infoLabel.setBounds(50,280,150,20);
        frame.add(infoLabel);
        frame.setVisible(true);
        but1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    int x = Integer.parseInt(inputOfNumber.getText().trim());
                    inputOfNumber.setText("");
                    if (x > rand){
                        attempts--;
                        infoLabel.setText("Your number - " + x + " is more");
                        labelAttempts.setText("Attempts left: " + attempts);
                    }
                    if (x < rand){
                        attempts--;
                        infoLabel.setText("Your number - " + x + " is less");
                        labelAttempts.setText("Attempts left: " + attempts);
                    }
                    if (x == rand){
                        JOptionPane.showMessageDialog(null,"You have won","Congratulations",JOptionPane.INFORMATION_MESSAGE);
                    }
                    if (attempts == 0){
                        JOptionPane.showMessageDialog(null, "Attempts is left, the number was " + rand, "Game Over!", JOptionPane.INFORMATION_MESSAGE);
                    }

                }
                catch (Exception b){
                    JOptionPane.showMessageDialog(null, "Error!","ALERT",JOptionPane.ERROR_MESSAGE);
                };
            }
        });
        but2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                attempts = 3;
                rand = (int) (Math.random() * 20);
                inputOfNumber.setText("");
                labelAttempts.setText("Attempts left: 3");
                infoLabel.setText("");
            }
        });
    }
}
