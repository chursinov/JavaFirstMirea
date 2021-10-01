package ru.mirea.task7.opt2;
public class MovablePoint implements Movable{
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;
    public MovablePoint(){
        x = 0;
        y = 0;
        xSpeed = 0;
        ySpeed = 0;
    }
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public String toString(){
        return "MovablePoint: " + "x=" + x + ", y=" + y;
    }
    public void moveUp(){
        this.y += ySpeed;
    }
    public void moveRight(){
        this.x += xSpeed;
    }
    public void moveLeft(){
        this.x -= xSpeed;
    }
    public void moveDown(){
        this.y -=ySpeed;
    }

}