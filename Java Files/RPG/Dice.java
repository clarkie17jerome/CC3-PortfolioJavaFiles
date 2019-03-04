package rpg;

import java.util.Random;

public class Dice {

    private static Random random;

    public Dice() {
        random = new Random();
    }

    public int roll() {
        int num = random.nextInt(6) + 1;
        return num;
    }
}
