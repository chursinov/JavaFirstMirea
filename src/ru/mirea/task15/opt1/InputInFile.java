package ru.mirea.task15.opt1;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class InputInFile {
    public static void main(String[] args){
        Scanner reader = null;
        FileWriter writer = null;
        String inputText;
        try{
            reader = new Scanner(System.in);
            OutputStream outputStream = new FileOutputStream("C:\\Users\\rando\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task15\\text.txt");
            while (true) {
                inputText = reader.nextLine();
                if (inputText.equals("EXIT")) {
                    break;
                }
                outputStream.write((inputText + "\n").getBytes());
            }
            outputStream.close();
            reader.close();
        }
        catch (IOException e){
            System.out.println("A fatal exception occurred!");
        }
    }
}
