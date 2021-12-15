package ru.mirea.task26;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
