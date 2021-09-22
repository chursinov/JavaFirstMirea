package ru.mirea.task1.opt2;

import java.util.Scanner;

public class SumElementsOfMas {
    public static int sum(int n, int[] myArray){
        int sum = 0;
        for (int i = 0;i < n;i++){
            sum += myArray[i];
        }
        return sum;
    }
    public static int sum1(int n, int[] myArray){
        int sum = 0;
        int i = 0;
        while (i < n){
            sum += myArray[i];
            i++;
        }
        return sum;
    }
    public static int sum2(int n, int[] myArray){
        int sum = 0;
        int i = 0;
        do {sum += myArray[i];
            i++;}
        while (i < n);
        return sum;
    }
    public static  void input(int n,int[] myArray){
        for (int i = 0; i < n;i++){
            System.out.printf("a[");
            System.out.printf("%d",i);
            System.out.printf("] = ");
            Scanner sc = new Scanner(System.in);
            if(sc.hasNextInt()) {
                myArray[i] = sc.nextInt();
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =0;
        System.out.println("Введите целое число");
        if(sc.hasNextInt()){
            n = sc.nextInt();
        }
        else System.out.println("Вы ввели нецелое число");
        int[] array = new int[n];
        SumElementsOfMas sum = new SumElementsOfMas();
        sum.input(n, array);
        System.out.println("for:");
        System.out.println(sum(n, array));
        System.out.println("while:");
        System.out.println(sum1(n, array));
        System.out.println("do while:");
        System.out.println(sum2(n, array));
    }
}
