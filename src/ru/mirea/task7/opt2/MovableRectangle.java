package ru.mirea.task7.opt2;

public class MovableRectangle implements Movable {
    MovablePoint UpLeft = new MovablePoint();
    MovablePoint DownRight = new MovablePoint();
    public MovableRectangle(int x1,int x2, int y1, int y2,int xSpeed,int ySpeed){
        UpLeft.x = x1;
        UpLeft.y = y1;
        DownRight.x = x2;
        DownRight.y = y2;
        UpLeft.xSpeed = xSpeed;
        UpLeft.ySpeed = ySpeed;
        DownRight.xSpeed = xSpeed;
        DownRight.ySpeed = ySpeed;
    }
    @Override
    public String toString(){
        return "MovableRectangle: " + "UpLeft = {" + UpLeft.x  + "," + UpLeft.y +"}" + " DownRight = {" + DownRight.x  + "," + DownRight.y + '}';
    }
    public void moveUp(){
        UpLeft.y += UpLeft.ySpeed;
        DownRight.y += UpLeft.ySpeed;
    }
    public void moveRight(){
        UpLeft.x += UpLeft.xSpeed;
        DownRight.x += DownRight.xSpeed;
    }
    public void moveLeft(){
        UpLeft.x -= UpLeft.xSpeed;
        DownRight.x -= UpLeft.xSpeed;
    }
    public void moveDown(){
        UpLeft.y -= UpLeft.ySpeed;
        DownRight.y -= UpLeft.ySpeed;
    }
}
