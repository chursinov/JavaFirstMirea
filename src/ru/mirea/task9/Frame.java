package ru.mirea.task9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.*;

public class Frame{
    int gACMilan = 0;
    int gFCRealMadrid = 0;
    public Frame(){
        JFrame frame = new JFrame("FootballMatch");
        frame.setLayout(null);
        frame.setSize(640,480);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JLabel labelResult = new JLabel("Result: " + gACMilan + " x " + gFCRealMadrid);
        labelResult.setBounds(280,20,100,10);
        JLabel labelLastScorer = new JLabel("Last Scorer: N/A");
        labelLastScorer.setBounds(270,50,200,10);
        JLabel labelWinner = new JLabel("Winner: N/A");
        labelWinner.setBounds(280,80,200,10);
        JButton goalForACMilan = new JButton("AC Milan");
        goalForACMilan.setBounds(160,10,100,30);
        JButton goalForFCRealMadrid = new JButton("FC Real Madrid");
        goalForFCRealMadrid.setBounds(380,10,150,30);
        JButton Restart = new JButton("Restart");
        Restart.setBounds(280,110,100,20);
        frame.add(Restart);
        frame.add(goalForACMilan);
        frame.add(goalForFCRealMadrid);
        frame.add(labelLastScorer);
        frame.add(labelResult);
        frame.add(labelWinner);
        goalForFCRealMadrid.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gFCRealMadrid++;
                labelLastScorer.setText("Last scorer: FC Real Madrid");
                labelResult.setText("Result: " + gACMilan + " x " + gFCRealMadrid);
                if (gACMilan > gFCRealMadrid) labelWinner.setText("Winner: AC Milan");
                if (gACMilan == gFCRealMadrid) labelWinner.setText("Draw");
                if (gACMilan < gFCRealMadrid) labelWinner.setText("Winner: FC Real Madrid");
            }
        });
        goalForACMilan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gACMilan++;
                labelLastScorer.setText("Last scorer: AC Milan");
                labelResult.setText("Result: " + gACMilan + " x " + gFCRealMadrid);
                if (gACMilan > gFCRealMadrid) labelWinner.setText("Winner: AC Milan");
                if (gACMilan == gFCRealMadrid) labelWinner.setText("Draw");
                if (gACMilan < gFCRealMadrid) labelWinner.setText("Winner: FC Real Madrid");
            }
        });
        Restart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gACMilan = 0;
                gFCRealMadrid = 0;
                labelResult.setText("Result: " + gACMilan + " x " + gFCRealMadrid);
                labelLastScorer.setText("Last Scorer: N/A");
                labelWinner.setText("Winner: N/A");
            }
        });
    }
}
