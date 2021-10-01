package ru.mirea.task6.opt2;

public interface Priceable {
    void getPrice();
}
class Car implements Priceable{
    private int price;
    Car(int price){
        this.price = price;
    }
    public void getPrice() {
        System.out.println("The price of a car is " + price);
    }
}
class Milk implements Priceable{
    private int price;
    Milk(int price){
        this.price = price;
    }
    public void getPrice() {
        System.out.println("The price of a milk is " + price);
    }
}
class Cookie implements Priceable{
    private int price;
    Cookie(int price){
        this.price = price;
    }
    public void getPrice() {
        System.out.println("The price of a cookie is " + price);
    }
}
