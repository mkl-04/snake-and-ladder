package dice;

import java.util.Random;

public class NormalDice implements Dice {
    public Integer throwDice() {
        Random random = new Random();
        int max = 6;
        int min = 1;
        return random.nextInt(max - min + 1) + min;
    }
}
