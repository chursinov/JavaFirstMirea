package ru.mirea.task16.MineSweeper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import ru.mirea.task16.MineSweeper.Sweeper.*;
import ru.mirea.task16.MineSweeper.Sweeper.Box;


public class JavaSweeper extends JFrame {
    private JPanel panel;
    private JLabel label;
    private Game game;
    private final int COLS = 9;
    private final int ROWS = 9;
    private final int BOMBS = 10;
    private final int IMAGE_SIZE = 50;
    public static void main(String[] args) {
        new JavaSweeper().setVisible(true);
    }
    private JavaSweeper(){
        game = new Game(COLS, ROWS, BOMBS);
        game.start();
        new UDate();
        setImages();
        initLabel();
        initPanel();
        initFrame();
    }
    private void initLabel(){
        label = new JLabel("Hello!");
        add(label, BorderLayout.SOUTH);
    }
    private void initPanel(){
        panel = new JPanel()
        {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (Coord coord : Ranges.getAllCoords())
                {
                    g.drawImage((Image)game.getBox(coord).image,coord.x * IMAGE_SIZE,coord.y * IMAGE_SIZE,this);
                }
            }
        };
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX() / IMAGE_SIZE;
                int y = e.getY() / IMAGE_SIZE;
                Coord coord = new Coord(x,y);
                if (e.getButton() == MouseEvent.BUTTON1)
                    game.pressLeftButton(coord);
                if (e.getButton() == MouseEvent.BUTTON3)
                    game.pressRightButton(coord);
                if (e.getButton() == MouseEvent.BUTTON2)
                    game.start();
                label.setText(getMessage());
                panel.repaint();
            }
        });
        panel.setPreferredSize(new Dimension(
                Ranges.getSize().x * IMAGE_SIZE,
                Ranges.getSize().y * IMAGE_SIZE));
        add(panel);
    }
    private String getMessage(){
        switch (game.getState())
        {
            case PLAYED: return "Think twice";
            case BOMBED: return "You bombed";
            case WINNER: return "You WON!!!";
            default: return "Welcome";
        }
    }
    private void initFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("JavaSweeper");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setIconImage(getImage("icon"));
        pack();
    }
    private void setImages(){
        for (Box box : Box.values())
            box.image = getImage(box.name());
    }
    private Image getImage(String name){
        String filename = "C:\\Users\\rando\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task16\\MineSweeper\\res\\img\\" + name.toLowerCase() + ".png";
        ImageIcon icon = new ImageIcon(filename);
        return icon.getImage();
    }
}
