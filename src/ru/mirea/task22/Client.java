package ru.mirea.task22;

public class Client implements Chair {
    public void Sit(Chair chair){
        chair.Sit(chair);
    }
}
