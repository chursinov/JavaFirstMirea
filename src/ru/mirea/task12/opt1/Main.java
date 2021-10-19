package ru.mirea.task12.opt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String name;
        int id;
        int score;
        InputList s0 = new InputList();
        System.out.print("Enter the amount of students: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student ListOfStudent[] = new Student[n];
        s0.Input(ListOfStudent, n);
        Sorting s1 = new Sorting();
        s1.InsertionSorting(ListOfStudent);
        System.out.println("Sorted by ID");
        s0.Output(ListOfStudent, n);
        QuickSort s2 = new QuickSort();
        s2.quickSort(ListOfStudent,0,n - 1);
        System.out.println("Sorted by GPA");
        s0.Output(ListOfStudent, n);
        System.out.println("---Sorted by merge---");
        MergeSort s3 = new MergeSort();
        System.out.print("Input count of students: ");
        int n2 = sc.nextInt();
        Student listOfStudent2[] = new Student[n2];
        s0.Input(listOfStudent2, n2);
        int mergen = n+n2;
        Student mergedList[] = new Student[mergen];
        for (int i = 0; i < n; i++) {
            mergedList[i] = ListOfStudent[i];
        }
        for (int i = 0; i < n2; i++) {
            mergedList[i+n] = listOfStudent2[i];
        }
        s3.mergeSort(mergedList,mergen);
        s0.Output(mergedList,mergen);
    }
}
