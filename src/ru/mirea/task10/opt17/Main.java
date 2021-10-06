package ru.mirea.task10.opt17;

import java.util.Scanner;

public class Main {
    public static int recursion(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0){
            return Math.max(n,recursion());
        }
        else return 0;
    }
    public static void main(String[] args){
        System.out.println(recursion());
    }
}
