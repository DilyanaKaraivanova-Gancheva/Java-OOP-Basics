package RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList {
    private Random rnd;

    public Object getRandomElement(){
        Random random = new Random();
        int index = this.rnd.nextInt(super.size());
        Object element = super.get(index);
        super.set(index,super.size() - 1);
        super.remove(super.size() - 1);
        return element;
    }
}
