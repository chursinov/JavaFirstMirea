package ru.mirea.task3.opt3;
import java.lang.*;
public class Book1 {
    private int amountOfPages;
    private String title;
    private String genre;
    public Book1(int a,String b, String c){
        amountOfPages = a;
        title = b;
        genre = c;
    }
    public int GetPages(int amountOfPages){
        return amountOfPages;
    }
    public String GetTitle(String title){
        return title;
    }
    public String GetGenre(String genre){
        return genre;
    }
    public void Summary(){
        System.out.println("The title of a book is "+ title +" and the genre is " + genre);
    }
}
