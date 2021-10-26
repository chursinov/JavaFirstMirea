package ru.mirea.task14.opt2;
import java.util.Stack;

public class Pjanitsa {
    Stack <Integer> firstPlayer;
    Stack <Integer> secondPlayer;
    public Pjanitsa(String firstPlayer, String secondPlayer){
        this.firstPlayer = new Stack<>();
        this.secondPlayer = new Stack<>();
        for (int i = 4; i >= 0;i--){
            this.firstPlayer.push(Integer.parseInt(firstPlayer.substring(i, i + 1)));
            this.secondPlayer.push(Integer.parseInt(firstPlayer.substring(i, i + 1)));
        }
    }
    private void pushBack( Stack<Integer> s, Integer item) {
        Stack<Integer> ns = new Stack<>();
        while (!s.isEmpty())
            ns.push(s.pop());
        s.push(item);
        while (!ns.isEmpty())
            s.push(ns.pop());
    }
    public String play(){
        int count = 0;
        while(!firstPlayer.isEmpty() && !secondPlayer.isEmpty() && count <= 106){
            if(firstPlayer.peek() > secondPlayer.peek() && secondPlayer.peek() != 0){
                pushBack(firstPlayer, firstPlayer.pop());
                pushBack(firstPlayer, secondPlayer.pop());
            }else{
                pushBack(secondPlayer, firstPlayer.pop());
                pushBack(secondPlayer, secondPlayer.pop());
            }
            count++;
        }
        String res = "";
        if(firstPlayer.isEmpty()) res += "SECOND ";
        else res += "FIRST ";
        res += count;
        if(count >= 106) res += "BOTVA";
        return res;
    }
    public static void main(String[] args) {
        System.out.println(new Pjanitsa("13579", "24680").play());
        System.out.println(new Pjanitsa("12345", "67890").play());
        System.out.println(new Pjanitsa("13029", "42685").play());
    }
}
