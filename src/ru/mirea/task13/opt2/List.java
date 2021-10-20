package ru.mirea.task13.opt2;
import java.util.LinkedList;

public class List {
    public static void main(String[] args){
        LinkedList <String> List = new LinkedList<String>();
        List.add("Item2");
        List.add("Item3");
        List.add("Item4");
        List.add(1,"Item1");
        String a = new String("Item5");
        List.add(0,"Item5");
        for(String s : List){
            System.out.println(s);
        }
        if (List.contains("Item5")){
            System.out.println("LinkedList contains Item5");
        }
        else System.out.println("LinkedList doesn't contain Item5");
        List.removeFirst();
        List.removeLast();
        for (String s : List){
            System.out.println(s);
        }
        if (List.contains("Item5")){
            System.out.println("LinkedList contains Item5");
        }
        else System.out.println("LinkedList doesn't contain Item5");
        if (List.contains("Item2")){
            System.out.println("LinkedList contains Item2");
        }
        else System.out.println("LinkedList doesn't contain Item2");
        System.out.println("The first element is " + List.peekFirst());
        System.out.println("The Last element is " + List.peekLast());
    }
}
