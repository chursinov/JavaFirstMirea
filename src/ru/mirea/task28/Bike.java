package ru.mirea.task28;

import org.junit.Test;

public class Bike {
    public Chair chair;
    public Wheel[] wheels;
    public static class Wheel {

        public int size;
        public boolean readyy = false;
        public Wheel(int size) {
            this.size = size;
        }
    }
    public static class Chair {
        private final String title;
        public boolean ready;

        public Chair(String title) {
            this.title = title;
        }

        public boolean isReady(boolean readyy) {
            return ready;
        }

    }

    public Bike(Chair chair, Wheel[] wheels) {
        this.chair = chair;
        this.wheels = wheels;
    }
    public void ready() {
        chair.isReady(true);
    }
    public String Name(){
        return "bike";
    }
    public static Bike Tourneo() {
        return new Bike(
                new Chair("comfort"),
                        new Wheel[]{
                                new Wheel(26),
                                new Wheel(26)
                        }

                ){
            @Override
            public String Name() {
                return "Tourneo bike";
            }
        };
    }
}
