package ru.mirea.task8.opt2;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private JLabel picLabel;
    private Container component;

    public Window(String s) {
        setTitle("Picture");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640,480);
        startWindow(s);
    }
    private void startWindow(String s) {
        component = new Container();
        component = getContentPane();
        component.setLayout(new GridLayout());
        picLabel = new JLabel(new ImageIcon(s));
        component.add(picLabel);
    }
}