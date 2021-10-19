package ru.mirea.task12.opt1;

public class Student {
    private String name = "";
    private int  score = 0;
    private int id = 0;
    public Student(String name, int id, int score){
        this.name = name;
        this.score = score;
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    public int getScore(){
        return this.score;
    }
    public String toString(){
        return "Student № " + getId() +
                "\nFull Name - " + getName() +
                "\nFinal Score - " + getScore() + '\n';
    }
}
