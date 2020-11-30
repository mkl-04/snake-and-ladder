package board;

import java.util.Map;

public class BasicBoard {

    private static final Integer BOARD_WINNING_POSITION = 100;

    public Integer calculateNextPosition(int initialPlayerPosition, int diceValue) {
        if (initialPlayerPosition < 0) {
            throw new NegativePositionNotSupportedException(String.format("Board position can not be negative.Passed value is = %d", initialPlayerPosition));
        }
        return initialPlayerPosition + diceValue;
    }
}
