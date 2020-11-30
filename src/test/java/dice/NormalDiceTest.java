package dice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class NormalDiceTest {

    private NormalDice dice;
    private List<Integer> diceArray;

    @Before
    public void setup() {
        dice = new NormalDice();
        diceArray = Arrays.asList(1, 2, 3, 4, 5, 6);
    }

    @Test
    public void testThrowDice() {
        Integer number = dice.throwDice();
        Assert.assertTrue("dice should have a number between 1 to 6", diceArray.contains(number));
    }

    @Test
    public void testThrowDiceMultipleTimes() {
        for (int i = 0; i < 10; i++) {
            Integer number = dice.throwDice();
            Assert.assertTrue("dice should have a number between 1 to 6", diceArray.contains(number));
        }
    }
}