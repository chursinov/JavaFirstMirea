package ru.mirea.task5.opt3;

public class FurnitureShop {
    public static void main(String[] args){
        Table t1 = new Table("Kitchen table",50);
        Table t2 = new Table("Hall Table",40);
        Chair t3 = new Chair("Room Chair",60);
        Chair t4 = new Chair("Toilet Chair",60);
        Locker t5 = new Locker("Locker in Bedroom", 180);
        System.out.println("            -----Tables-----");
        t1.DisplayInfo();
        t2.DisplayInfo();
        System.out.println(" \n           -----Chairs-----");
        t3.DisplayInfo();
        t4.DisplayInfo();
        System.out.println(" \n           -----Lockers-----");
        t5.DisplayInfo();
    }
}
