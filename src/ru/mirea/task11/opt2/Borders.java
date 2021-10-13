package ru.mirea.task11.opt2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Borders extends JFrame {
    public Borders(){
        JFrame frame = new JFrame("Borders");
        frame.setSize(640,480);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        JLabel center = new JLabel("center",SwingConstants.CENTER);
        JLabel east = new JLabel("east",SwingConstants.CENTER);
        JLabel west = new JLabel("west",SwingConstants.CENTER);
        JLabel north = new JLabel("north",SwingConstants.CENTER);
        JLabel south = new JLabel("south",SwingConstants.CENTER);
        frame.add(center, BorderLayout.CENTER);
        frame.add(east, BorderLayout.EAST);
        frame.add(west, BorderLayout.WEST);
        frame.add(north, BorderLayout.NORTH);
        frame.add(south, BorderLayout.SOUTH);
        center.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                frame.setTitle("You are in CENTER");
            }
        });
        east.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                frame.setTitle("You are in EAST");
            }
        });
        west.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                frame.setTitle("You are in WEST");
            }
        });
        north.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                frame.setTitle("You are in NORTH");
            }
        });
        south.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                frame.setTitle("You are in SOUTH");
            }
        });

    }
}
