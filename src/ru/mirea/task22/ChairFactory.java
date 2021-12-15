package ru.mirea.task22;

abstract class ChairFactory implements Chair {
    public void createChair(ChairType chairType){
        Chair chair = null;
        switch (chairType){
            case VICTORIAN:
                chair = new Victorian() {
                    public void Sit(Chair chair) {
                        System.out.println("You are sitting on Victorian Chair");
                    }
                };
                break;
            case MAGIC:
                chair = new Magic() {
                    public void Sit(Chair chair) {
                        System.out.println("You are sitting on Victorian Chair");
                    }
                };
                break;
            case MULTIFUNCTIONAL:
                chair = new Multifunctional() {
                    public void Sit(Chair chair) {
                        System.out.println("You are sitting on Victorian Chair");
                    }
                };
                break;
        }
    }
}
