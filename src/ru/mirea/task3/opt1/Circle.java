package ru.mirea.task3.opt1;

public class Circle {
    public int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    public void SetRadius(int radius){
        this.radius = radius;
    }
    public int GetRadius(){
        return radius;
    }
    public double Area(){
        double a = 3.14 * radius * radius;
        return a;
    }
}
