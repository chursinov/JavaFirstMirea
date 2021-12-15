package ru.mirea.task23;

public class Main {
    public static void main(String[] args) {
        Phone IPhone7 = new Phone("Apple Iphone 7", 800, 2016);
        Phone A2 = new Phone("Xiaomi mi A2", 250, 2018);
        Phone A3 = new Phone("Xiaomi mi A3", 200, 2019);
        Phone IPhoneX = new Phone("IPhone X", 950, 2019);
        Phone S22 = new Phone("Samsung Galaxy S22", 1200, 2021);

        System.out.println("2 = 3?");
        System.out.println(A2.equals(A3));
        System.out.println("3 = 4?");
        System.out.println(A3.equals(IPhoneX));
        System.out.println("4 = 5?");
        System.out.println(IPhoneX.equals(S22));
        System.out.println("1 = 5?");
        System.out.println(IPhone7.equals(S22));
        System.out.println("3 = 1?");
        System.out.println(A3.equals(IPhone7));

        System.out.println("Какие у них хэш-коды?");
        System.out.println(A2.hashCode());
        System.out.println(IPhone7.hashCode());
        System.out.println(A3.hashCode());
        System.out.println(S22.hashCode());
        System.out.println(IPhoneX.hashCode());
    }
}
