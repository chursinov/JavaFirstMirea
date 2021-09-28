package ru.mirea.task2.opt2;
import java.lang.*;
public class TestBall {
    public static void main(String[] args){
        Ball uno = new Ball("White", 5, "Football");
        Ball due = new Ball("Black", 3, "HandBall");
        uno.Summary();
        due.Summary();
    }
}