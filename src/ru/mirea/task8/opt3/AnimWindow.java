package ru.mirea.task8.opt3;

import java.awt.*;
import javax.swing.*;
import java.lang.*;

public class AnimWindow {
    public static void main(String[] args) throws InterruptedException{
        JFrame anim = new JFrame("Animation");
        anim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        anim.setSize(640,480);
        anim.setVisible(true);
        JLabel picture = new JLabel("", JLabel.CENTER);
        anim.add(picture);

        while(true) {
            picture.setIcon(new ImageIcon("C:\\Users\\rando\\Desktop\\Учёба\\Java\\1.gif"));
            Thread.sleep(25);
            picture.setIcon(new ImageIcon("C:\\Users\\rando\\Desktop\\Учёба\\Java\\2.gif"));
            Thread.sleep(25);
            picture.setIcon(new ImageIcon("C:\\Users\\rando\\Desktop\\Учёба\\Java\\3.gif"));
            Thread.sleep(25);
            picture.setIcon(new ImageIcon("C:\\Users\\rando\\Desktop\\Учёба\\Java\\4.gif"));
            Thread.sleep(25);
            picture.setIcon(new ImageIcon("C:\\Users\\rando\\Desktop\\Учёба\\Java\\5.gif"));
            Thread.sleep(25);
            picture.setIcon(new ImageIcon("C:\\Users\\rando\\Desktop\\Учёба\\Java\\6.gif"));
            Thread.sleep(25);
            picture.setIcon(new ImageIcon("C:\\Users\\rando\\Desktop\\Учёба\\Java\\7.gif"));
            Thread.sleep(25);
            picture.setIcon(new ImageIcon("C:\\Users\\rando\\Desktop\\Учёба\\Java\\8.gif"));
            Thread.sleep(25);
            picture.setIcon(new ImageIcon("C:C:\\Users\\rando\\Desktop\\Учёба\\Java\\9.gif"));
            Thread.sleep(25);
            picture.setIcon(new ImageIcon("C:\\Users\\rando\\Desktop\\Учёба\\Java\\10.gif"));
            Thread.sleep(25);
            picture.setIcon(new ImageIcon("C:\\Users\\rando\\Desktop\\Учёба\\Java\\11.gif"));
            Thread.sleep(25);
            picture.setIcon(new ImageIcon("C:\\Users\\rando\\Desktop\\Учёба\\Java\\12.gif"));
            Thread.sleep(25);
            break;
        }
    }
}
