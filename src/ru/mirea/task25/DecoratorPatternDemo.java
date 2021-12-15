package ru.mirea.task25;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        RedshapeDecorator redshapedecorator = new RedshapeDecorator(circle);
        circle.draw();
        redshapedecorator.draw();
    }
}
