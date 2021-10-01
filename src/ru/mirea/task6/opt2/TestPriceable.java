package ru.mirea.task6.opt2;

public class TestPriceable {
    public static void main(String[] args) {
        Priceable priceable1 = new Car(150);
        priceable1.getPrice();
        Priceable priceable2 = new Milk(89);
        priceable2.getPrice();
        Priceable priceable3 = new Cookie(190);
        priceable3.getPrice();
    }
}
