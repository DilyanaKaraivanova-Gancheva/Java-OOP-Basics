package FragileBaseClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Animal {
    protected ArrayList<Food> foodEaten;

    public final void eat(Food food) {
        this.foodEaten.add(food);

    }

    public final void eatAll(Food[] foods) {
        Collections.addAll(foodEaten,foods);

    }
}
