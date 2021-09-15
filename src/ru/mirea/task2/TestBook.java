package ru.mirea.lab1;
import java.lang.*;
public class TestBook {
    public static void main(String[] args){
        Book uno = new Book(345, "HarryPotter", "Fiction");
        Book due = new Book(345, "HarryPotter2", "Fiction");
        uno.Summary();
        due.Summary();
    }
}