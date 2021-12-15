package ru.mirea.task25;

public class RedshapeDecorator extends ShapeDecorator {
    public RedshapeDecorator(Shape shape){
        super(shape);
    }
    @Override
    public void draw(){
        super.draw();
        setRedBorder();
    }
    public void setRedBorder(){
        System.out.println("The Border is red");
    }
}
