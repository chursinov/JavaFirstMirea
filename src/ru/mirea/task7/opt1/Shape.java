package ru.mirea.task7.opt1;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public boolean isFilled(){
        return filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle(){
        super();
    }
    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super();
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth(){
        return width;};
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    @Override
    public double getArea(){
        return width * length;
    }
    @Override
    public double getPerimeter(){
        return 2*width + 2*length;
    }
    @Override
    public String toString(){return "This " +this.color +" Rectangle with width:"+this.width+ " and length="+this.length+" Area="+this.getArea()+" and Perimeter = "+getPerimeter();};
}
class Circle extends Shape{
    protected double radius;
    public Circle(){
        super();
    };
    public Circle(double radius){
        super();
        this.radius = radius;
    };
    public Circle(double radius, String color,boolean filled){
        super();
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    };
    public double getRadius(){
        return this.radius;
    };
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return 3.14 * radius * radius;
    };
    @Override
    public double getPerimeter(){
        return 2 * 3.14 * radius;
    }
    @Override
    public String toString(){
        return "This " +this.color +" circle with radius:"+this.radius+" Area="+this.getArea()+" and Perimeter = "+getPerimeter();};
}
class Square extends Rectangle{
    protected double side;
    public Square(){
        super();
    };
    public Square(double side){
        super();
        this.side = side;
    };
    public Square(double side, String color, boolean filled){
        super();
        this.side = side;
        this.color = color;
        this.filled = filled;
    };
    public double getSide(){
        return this.side;
    };
    public void setSide(double side){
        this.side = side;
    };
    @Override
    public double getArea(){
        return side * side;
    };
    @Override
    public double getPerimeter(){
        return 4 * side;
    }
    @Override
    public String toString(){
        return "This" +this.color +" Square with side:"+this.side+ " length="+this.side + " and width "+this.side;
    };
}
