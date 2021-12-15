package ru.mirea.task25;

public abstract class ShapeDecorator {
    Shape shape = null;
    ShapeDecorator(Shape shape){
        this.shape = shape;
    }
    public void draw(){
        shape.draw();
    }
}
