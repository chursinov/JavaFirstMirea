package ru.mirea.task13.opt1;
import java.util.ArrayList;

public class List {
    public static void main(String[] args){
        ArrayList <String> List = new ArrayList<String>();
        List.add("Item1");
        List.add("Item2");
        List.add("Item3");
        System.out.println("In list we have " + List.size() + " element(s)");
        for (String s:List){
            System.out.println(s);
        }
        if (List.contains("Item1")){
            System.out.println("List contains Item1");        }
        else System.out.println("List doesn't contain Item1");
        if (List.contains("Item2")){
            System.out.println("List contains Item2");        }
        else System.out.println("List doesn't contain Item2");
        if (List.contains("Item3")){
            System.out.println("List contains Item3");        }
        else System.out.println("List doesn't contain Item3");
        List.remove("Item2");
        System.out.println("In list we have " + List.size() + " element(s)");
        for (String s:List){
            System.out.println(s);
        }
        if (List.contains("Item2")){
            System.out.println("List contains Item2");        }
        else System.out.println("List doesn't contain Item2");
        if (List.contains("Item1")){
            System.out.println("List contains Item1");        }
        else System.out.println("List doesn't contain Item1");
    }
}
