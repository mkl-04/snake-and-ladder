package board;

import java.util.Map;

public class BasicBoard {

    private static final Integer BOARD_WINNING_POSITION = 100;

    public Integer calculateNextPosition(int initialPlayerPosition, int diceValue) {
        if (initialPlayerPosition < 0) {
            throw new NegativePositionNotSupportedException(String.format("Board position can not be negative.Passed value is = %d", initialPlayerPosition));
        }
        if (diceValue < 1 || diceValue > 6) {
            throw new InvalidDiceValueException(String.format("Dice value should be between 1 to 6. Passed value is = %d", diceValue));
        }
        return initialPlayerPosition + diceValue;
    }
}
