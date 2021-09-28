package ru.mirea.task1.opt5;
import java.util.Random;
import java.util.*;

public class RandomMas {
    public static void inputRandom(int[] array,Random random){
        for (int i = 0; i < 10;i++){
            array[i] = random.nextInt();
        }
    }
    public static void inputMathRandom(int[] array){
        for (int i = 0;i < 10;i++){
            array[i] = (int) (Math.random() * 100);
        }
    }
    public static void output(int[] array){
        for(int i = 0;i < 10;i++){
        System.out.println(array[i]);
        }
    }
    public static void main(String[] args){
        Random random = new Random();
        int[] array = new int[10];
        RandomMas mas = new RandomMas();
        mas.inputRandom(array,random);
        System.out.println("Случайно сгенерированный массив с помощью класса Random");
        mas.output(array);
        Arrays.sort(array);
        System.out.println("Отсортированный массив");
        mas.output(array);
        System.out.println("Случайно сгенерированный массив с помощью Math.random");
        mas.inputMathRandom(array);
        mas.output(array);
        Arrays.sort(array);
        System.out.println("Отсортированный массив");
        mas.output(array);

    }
}
