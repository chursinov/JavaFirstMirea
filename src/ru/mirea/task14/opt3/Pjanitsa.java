package ru.mirea.task14.opt3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Pjanitsa {
    Deque<Integer> firstPlayer, secondPlayer;

    public Pjanitsa(String fp, String sp) {
        this.firstPlayer = new ArrayDeque<>();
        this.secondPlayer = new ArrayDeque<>();
        for(int i = 0; i < 5; i ++){
            this.firstPlayer.add(Integer.parseInt(fp.substring(i, i+1)));
            this.secondPlayer.add(Integer.parseInt(sp.substring(i, i+1)));
        }
    }

    public String play(){
        int count = 0;
        while(!firstPlayer.isEmpty() && !secondPlayer.isEmpty() && count < 106){
            if(firstPlayer.peek() > secondPlayer.peek() && secondPlayer.peek() != 0){
                firstPlayer.add(firstPlayer.remove());
                firstPlayer.add(secondPlayer.remove());

            }else{
                secondPlayer.add(firstPlayer.remove());
                secondPlayer.add(secondPlayer.remove());
            }
            count++;
        }
        String res = "";
        if(firstPlayer.isEmpty()) res += "second ";
        else if (secondPlayer.isEmpty()) res += "first ";
        res += count;
        if(count >= 106) res += " botva";
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Pjanitsa("13579", "24680").play());
        System.out.println(new Pjanitsa("12345", "67890").play());
        System.out.println(new Pjanitsa("13029", "42685").play());
    }

}
