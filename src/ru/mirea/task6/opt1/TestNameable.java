package ru.mirea.task6.opt1;

public class TestNameable {
    public static void main(String[] args) {
        Nameable nameable = new Planet("Saturn");
        nameable.getName();
        Nameable nameable1 = new Car("Mazda");
        nameable1.getName();
        Nameable nameable2 = new Animal("Тигр");
        nameable2.getName();
    }
}
