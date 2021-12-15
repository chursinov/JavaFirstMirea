package ru.mirea.task29;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;

public class Main {

    public void main(String[] args) throws IOException,ClassNotFoundException {
        String symbol = "USD";
        int costInRubles = 100;
/*
        CurrencyInfo currencyInfo = new CurrencyInfo(costInRubles, symbol);
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\rando\\Desktop\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(currencyInfo);
        objectOutputStream.close();
*/
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\rando\\Desktop\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        CurrencyInfo currencyInfo = (CurrencyInfo) objectInputStream.readObject();
        System.out.println(currencyInfo.to_string());
    }
}
