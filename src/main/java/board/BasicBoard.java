package board;

import java.util.Map;

public class BasicBoard {

    private static final Integer BOARD_WINNING_POSITION = 100;

    public Integer calculateNextPosition(Integer initialPlayerPosition, Integer diceValue) {
        return initialPlayerPosition + diceValue;
    }
}
