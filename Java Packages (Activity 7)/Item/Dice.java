package rpg;

import java.util.Random;

public class Dice {

    private static Random random;

    public Dice() {
        //new object random
        random = new Random();
    }

    //Whenever you want to increase their damage
    public int roll() {
        int num = random.nextInt(10) + 1;
        return num;
    }
}
