package ru.mirea.task10.opt15;

public class Main {
    public static void main(String[] args){
        System.out.println(recursion(543321));
    }
    public static String recursion(int n){
        if (n < 10) return Integer.toString(n);
        else {
            System.out.println(n % 10);
            return recursion(n / 10);
        }
    }
}
