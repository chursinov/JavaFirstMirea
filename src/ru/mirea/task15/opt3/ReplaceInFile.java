package ru.mirea.task15.opt3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ReplaceInFile {
    public static void main(String[] args){
        System.out.println("Enter what to replace");
        Scanner sc = new Scanner(System.in);
        String targ = sc.nextLine();
        System.out.println("Enter by what");
        Scanner scc = new Scanner(System.in);
        String RepWith = scc.nextLine();
        Replace(targ,RepWith);
    }
    public static void Replace(String target, String ReplaceWith){
        try {
            BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\rando\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task15\\text.txt"));
            String line;
            StringBuffer inputBuffer = new StringBuffer();

            while ((line = file.readLine()) != null) {
                inputBuffer.append(line);
                inputBuffer.append('\n');
            }
            String inputStr = inputBuffer.toString();
            file.close();
            inputStr = inputStr.replace(target, ReplaceWith);
            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\rando\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task15\\text.txt");
            fileOut.write(inputStr.getBytes());
            fileOut.close();
        }catch (Exception e) {
            System.out.println("Problem reading file.");
        }
    }
}
