package l1;

public abstract class Dish {
    private String name;
    public String getName() {
        return name;
    }
        public abstract void DisplayInfo();
       public Dish(String name){
            this.name = name;
        };
    }
class knife extends Dish{
    private int knifeLength;
    public knife(String name, int knifeLength){
        super(name);
        this.knifeLength = knifeLength;
    }
    public void DisplayInfo(){
        System.out.println("Knife " + super.getName() + " have " + knifeLength + "cm");
    }
}
class spoon extends Dish{
    private int spoonLength;
    public spoon(String name, int spoonLength){
        super(name);
        this.spoonLength = spoonLength;
    }
    public void DisplayInfo(){
        System.out.println("Knife " + super.getName() + " have " + spoonLength + "cm");
    }
}
class plate extends Dish{
    private int diameter;
    public plate(String name, int diameter){
        super(name);
        this.diameter = diameter;
    }
    public void DisplayInfo(){
        System.out.println("Knife " + super.getName() + " have " + diameter + "cm");
    }
}
