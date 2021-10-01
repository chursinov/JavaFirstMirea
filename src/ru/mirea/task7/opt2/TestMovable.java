package ru.mirea.task7.opt2;

public class TestMovable {
    public static void main(String[] args){
        MovableRectangle rectangle1 = new MovableRectangle(1,4,1,4,2,2);
        rectangle1.moveDown();
        rectangle1.moveRight();
        System.out.println(rectangle1.toString());
        MovableRectangle rectangle2 = new MovableRectangle(2,3,2,3,1,1);
        rectangle2.moveUp();
        rectangle2.moveLeft();
        System.out.println(rectangle2.toString());
        MovableCircle circle1 = new MovableCircle(5,5,3,4,5);
        circle1.moveDown();
        circle1.moveRight();
        System.out.println(circle1.toString());
        MovableCircle circle2 = new MovableCircle(4,8,2,1,4);
        circle2.moveUp();
        circle2.moveLeft();
        System.out.println(circle2.toString());
        MovablePoint point1 = new MovablePoint(1,1,1,1);
        point1.moveDown();
        point1.moveRight();
        System.out.println(point1.toString());
        MovablePoint point2 = new MovablePoint(0,0,1,1);
        point2.moveUp();
        point2.moveLeft();
        System.out.println(point2.toString());
    }
}
