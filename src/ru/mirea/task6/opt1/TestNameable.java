package ru.mirea.task6.opt1;

public class TestNameable {
    public static void main(String[] args) {
        Nameable nameable = new Planet("Saturn", 1500,9000);
        nameable.GetName();
        Nameable nameable1 = new Car("Mazda", 3500, 120);
        nameable1.GetName();
        Nameable nameable2 = new Animal("Тигр", 5000, 50);
        nameable2.GetName();
    }
}
