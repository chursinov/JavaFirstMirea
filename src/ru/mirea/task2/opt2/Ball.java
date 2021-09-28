package ru.mirea.task2.opt2;
import java.lang.*;
public class Ball {
    private String color;
    private int size;
    private String sport;
    public Ball(String a,int b, String c){
        color = a;
        size= b;
        sport = c;
    }
    public int GetSize(int Size){
        return Size;
    }
    public String GetColor(String color){
        return color;
    }
    public String GetGenre(String sport){
        return sport;
    }
    public void Summary(){
        System.out.println("The color of ball is "+ color +" and the size is " + size);
    }
}