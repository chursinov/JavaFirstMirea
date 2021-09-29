package ru.mirea.task5.opt1;
import java.lang.*;
public class TestDish{
    public static void main(String[] args){
        knife m1 = new knife("Volodya",49);
        spoon m2 = new spoon("Olya",12);
        plate m3 = new plate("Oleg",12);
        m1.DisplayInfo();
        m2.DisplayInfo();
        m3.DisplayInfo();
    }
}
