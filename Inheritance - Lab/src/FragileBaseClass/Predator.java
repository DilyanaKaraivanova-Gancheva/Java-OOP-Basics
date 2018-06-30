package FragileBaseClass;

public class Predator  extends Animal{
    private int health;

    public void feed(Food food){
        foodEaten.add(food);
        health++;

    }
}
