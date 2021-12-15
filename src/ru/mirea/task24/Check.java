package ru.mirea.task24;

public class Check {
    public static boolean checkIP(String inputt) {
        return inputt.matches("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
    }
}
