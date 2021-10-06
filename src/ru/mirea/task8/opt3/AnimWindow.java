package ru.mirea.task8.opt3;

import java.awt.*;
import javax.swing.*;
import java.lang.*;

public class AnimWindow {
    public static void main(String[] args) throws InterruptedException{
        JFrame anim = new JFrame("Animation");
        anim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        anim.setSize(640,480);
        anim.setLocationRelativeTo(null);
        anim.setVisible(true);
        JLabel picture = new JLabel("", JLabel.CENTER);
        anim.add(picture);

        while(true) {
            picture.setIcon(new ImageIcon("C:\\Users\\IVC1-5\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\1.gif"));
            Thread.sleep(200);
            picture.setIcon(new ImageIcon("C:\\Users\\IVC1-5\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\2.gif"));
            Thread.sleep(200);
            picture.setIcon(new ImageIcon("C:\\Users\\IVC1-5\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\3.gif"));
            Thread.sleep(200);
            picture.setIcon(new ImageIcon("C:\\Users\\IVC1-5\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\4.gif"));
            Thread.sleep(200);
            picture.setIcon(new ImageIcon("C:\\Users\\IVC1-5\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\5.gif"));
            Thread.sleep(200);
            picture.setIcon(new ImageIcon("C:\\Users\\IVC1-5\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\6.gif"));
            Thread.sleep(200);
            picture.setIcon(new ImageIcon("C:\\Users\\IVC1-5\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\7.gif"));
            Thread.sleep(200);
            picture.setIcon(new ImageIcon("C:\\Users\\IVC1-5\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\8.gif"));
            Thread.sleep(200);
            picture.setIcon(new ImageIcon("C:\\Users\\IVC1-5\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\9.gif"));
            Thread.sleep(200);
            picture.setIcon(new ImageIcon("C:\\Users\\IVC1-5\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\10.gif"));
            Thread.sleep(200);
            picture.setIcon(new ImageIcon("C:\\Users\\IVC1-5\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\11.gif"));
            Thread.sleep(200);
            picture.setIcon(new ImageIcon("C:\\Users\\IVC1-5\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task8\\opt3\\12.gif"));
            Thread.sleep(200);

        }
    }
}
