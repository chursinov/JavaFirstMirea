package ru.mirea.task28;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bike bike1 = Bike.Tourneo();
        Bike bike2 = Bike.Tourneo();
        System.out.println(bike1.Name());
        List<Bike> expected = new ArrayList<>();
        expected.add(bike1);
        List<Bike> actual = new ArrayList<>();
        actual.add(bike1);
        actual.add(bike2);
        Assert.assertEquals(expected, actual);
    }
}
