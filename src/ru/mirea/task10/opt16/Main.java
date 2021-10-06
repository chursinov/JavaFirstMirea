package ru.mirea.task10.opt16;

import java.util.Scanner;

public class Main {

    public static void recursion(long max, int count){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n > 0){
            if (n > max){
                recursion(n,1);
            }
            else if (n == max){
                recursion(max, ++count);
            }
            else {
                recursion(max,count);
            }

        }
        else{
            System.out.println(count);
        }
    }
    public static void main(String[] args){
        recursion(30,0);
    }
}
