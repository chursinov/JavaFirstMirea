package ru.mirea.task12.opt1;

import java.util.Scanner;

public class InputList {
    public static void Input(Student ListOfStudent[], int n){
        String name;
        int id;
        int score;
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i < n;i++){
            System.out.print("Enter the name: ");
            name = sc.next();
            System.out.print("Enter the ID: ");
            id = sc.nextInt();
            System.out.print("Enter the Score: ");
            score = sc.nextInt();
            ListOfStudent[i] = new Student(name, id,score);
        }
    }
    public static void Output(Student ListOfStudent[], int n){
        for (int i = 0;i < n;i++){
            System.out.println(ListOfStudent[i].toString());
        }
    }
}
