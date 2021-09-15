package ru.mirea.task3.opt3;
import java.lang.*;
public class TestBook1 {
    public static void main(String[] args){
        Book1 uno = new Book1(345, "HarryPotter", "Fiction");
        Book1 due = new Book1(345, "HarryPotter2", "Fiction");
        uno.Summary();
        due.Summary();
    }
}