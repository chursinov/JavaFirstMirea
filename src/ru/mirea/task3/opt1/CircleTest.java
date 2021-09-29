package ru.mirea.task3.opt1;
import java.util.*;

public class CircleTest {
    public static void main(String[] args){
        Circle circle1 = new Circle(6);
        circle1.SetRadius(10);
        Circle circle2 = new Circle(7);
        System.out.println("The radius of a circle is " + circle1.GetRadius() + " and area is " + circle1.Area());
        System.out.println("The radius of a circle is " + circle2.GetRadius() + " and area is " + circle2.Area());
    }
}
