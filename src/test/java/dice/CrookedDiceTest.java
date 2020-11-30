package dice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CrookedDiceTest {

    private CrookedDice dice;
    private List<Integer> diceArray;

    @Before
    public void setup() {
        dice = new CrookedDice();
        diceArray = Arrays.asList(2, 4, 6);
    }

    @Test
    public void testThrowDice() {
        Integer number = dice.throwDice();
        Assert.assertTrue("dice should have a number between 2,4, 6", diceArray.contains(number));
    }

    @Test
    public void testThrowDiceMultipleTimes() {
        for (int i = 0; i < 10; i++) {
            Integer number = dice.throwDice();
            Assert.assertTrue("dice should have a number between 2,4, 6", diceArray.contains(number));
        }
    }
}
