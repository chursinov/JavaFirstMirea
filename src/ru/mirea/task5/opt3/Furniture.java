package ru.mirea.task5.opt3;

public abstract class Furniture {
    private String name;
    public String getName() {
        return name;
    }
    public abstract void DisplayInfo();
    public Furniture(String name){
        this.name = name;
    };
}
class Table extends Furniture {
    private int height;
    public Table(String name, int height){
        super(name);
        this.height = height;
    }
    public void DisplayInfo(){
        System.out.println("Table " + super.getName() + " have " + height + "cm of height");
    }
}
class Chair extends Furniture {
    private int height;
    public Chair(String name, int height){
        super(name);
        this.height = height;
    }
    public void DisplayInfo(){
        System.out.println("Chair " + super.getName() + " have " + height + "cm of height");
    }
}
class Locker extends Furniture {
    private int height;
    public Locker(String name, int height){
        super(name);
        this.height = height;
    }
    public void DisplayInfo(){
        System.out.println("Locker " + super.getName() + " have " + height + "cm of height");
    }
}
