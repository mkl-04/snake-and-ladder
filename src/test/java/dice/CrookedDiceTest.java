package dice;

import org.junit.Before;

import java.util.Arrays;
import java.util.List;

public class CrookedDiceTest {

    private CrookedDice dice;
    private List<Integer> diceArray;

    @Before
    public void setup() {
        dice = new CrookedDice();
        diceArray = Arrays.asList( 2, 4, 6);
    }
}
