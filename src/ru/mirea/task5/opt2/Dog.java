package ru.mirea.task5.opt2;

public abstract class Dog {
    private String name;
    public String getName() {
        return name;
    }
    public abstract void DisplayInfo();
    public Dog(String name){
        this.name = name;
    };
}
class ChiHuahHuah extends Dog {
    private int height;
    public ChiHuahHuah(String name, int height){
        super(name);
        this.height = height;
    }
    public void DisplayInfo(){
        System.out.println("ChiHuahHuah " + super.getName() + " have " + height + "cm of height");
    }
}
class Stafford extends Dog {
    private int height;
    public Stafford(String name, int height){
        super(name);
        this.height = height;
    }
    public void DisplayInfo(){
        System.out.println("Stafford " + super.getName() + " have " + height + "cm of height");
    }
}
class Doberman extends Dog {
    private int height;
    public Doberman(String name, int height){
        super(name);
        this.height = height;
    }
    public void DisplayInfo(){
        System.out.println("Doberman " + super.getName() + " have " + height + "cm of height");
    }
}