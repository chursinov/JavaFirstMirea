package ru.mirea.task27.opt1;

import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Map<String, String> fi = Map.of(
            "Artemiy", "Chursinov",
                "Dmitro", "Chursinov",
                "Sergey", "Sergeev",
                "Dmitry", "Dmitriev",
                "Alekasnder","Kostylev",
                        "Brian", "May",
                "Akakiy","Akakievich",
                "Olga", "Platonova",
                "Zurab", "Puturidze",
                        "Artur", "Puturidze"
        );
        System.out.println(fi);
        Set<String> f = new HashSet<>();
        fi = fi.entrySet()
                .stream()
                .filter(entry -> f.add(entry.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.printf("After: %s%n", f);
    }
}
