package ru.mirea.task2.opt1;

public class Shape {
    private String name;
    public Shape(String name){
        this.name = name;
    }
    public String GetName(){
        return name;
    }
    public void Summary(){
        System.out.println("The name of a Shape is "+ GetName());
    }
}
