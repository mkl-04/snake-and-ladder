package dice;

import java.util.Random;

public class CrookedDice implements Dice {
    public Integer throwDice() {
        Random random = new Random();
        int max = 6;
        int min = 1;
        int result = random.nextInt(max - min + 1) + min;
        return result % 2 == 0 ? result : result + 1;
    }
}
