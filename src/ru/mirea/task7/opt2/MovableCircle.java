package ru.mirea.task7.opt2;

public class MovableCircle implements Movable {
    private int radius;
    MovablePoint center = new MovablePoint();
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center.x = x;
        center.y = y;
        center.xSpeed = xSpeed;
        center.ySpeed = ySpeed;
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "MovableCircle: " + "radius=" + radius + ", center = {" + center.x + "," + center.y + "}";
    }
    public void moveUp(){
        center.y += center.ySpeed;
    }
    public void moveRight(){
        center.x += center.xSpeed;
    }
    public void moveLeft(){
        center.x -= center.xSpeed;
    }
    public void moveDown(){
        center.y -= center.ySpeed;
    }
}