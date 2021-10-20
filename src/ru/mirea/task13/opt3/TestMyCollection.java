package ru.mirea.task13.opt3;

public class TestMyCollection {
    public static void Main(String[] args){
        MyCollection<Integer> integers = new MyCollection<>();
        for(int i = 0; i<20;i++)
            integers.add(i);
        System.out.println(integers);
        for(int i = 5; i < 13; i++)
            integers.remove(i);
        System.out.println(integers);
        System.out.println(integers.get(5));
        System.out.println();

        MyCollection<String> strs = new MyCollection<>();
        System.out.println(strs);
        for (int i = 0; i < 10; i++) {
            strs.add("String number " + (i+1));
        }
        System.out.println(strs);
        System.out.println();

        MyCollection<String> strs2 = new MyCollection<>();
        System.out.println(strs2);
        strs2.remove(5);
        System.out.println(strs2.get(5));
        System.out.println(strs.get(5));
        System.out.println(strs2);
        System.out.println(strs2);
    }
}
