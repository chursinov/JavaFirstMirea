package ru.mirea.task8.opt2;

public class Main {
    public static void main(String[] args){
        String s = "";
        for (int i = 0;i< args.length;i++){
            s+=args[i];
        }
        new Window(s).setVisible(true);

    }
}