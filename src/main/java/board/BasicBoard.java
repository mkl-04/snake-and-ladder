package board;

import dice.Dice;
import dice.NormalDice;
import model.Player;

import java.util.HashMap;
import java.util.Map;

public class BasicBoard {

    private static final Integer BOARD_WINNING_POSITION = 100;

    public BasicBoard() {
        this.snakePosition = new HashMap<>();
        snakePosition.put(14, 7);
    }

    private final Map<Integer, Integer> snakePosition;


    public Integer calculateNextPosition(int initialPlayerPosition, int diceValue) {
        if (initialPlayerPosition < 0) {
            throw new NegativePositionNotSupportedException(String.format("Board position can not be negative.Passed value is = %d", initialPlayerPosition));
        }
        if (diceValue < 1 || diceValue > 6) {
            throw new InvalidDiceValueException(String.format("Dice value should be between 1 to 6. Passed value is = %d", diceValue));
        }

        Integer nextDicePosition = initialPlayerPosition + diceValue;
        if (snakePosition.containsKey(nextDicePosition)) {
            nextDicePosition = nextDicePosition - snakePosition.get(nextDicePosition);
        }
        return nextDicePosition;
    }

    public static void main(String[] args) {
        Player player1 = new Player(1, 0);
        BasicBoard basicBoard = new BasicBoard();
        Dice normalDice = new NormalDice();
        for (int i = 0; i < 10; i++) {
            int diceValue = normalDice.throwDice();
            System.out.println("dice value " + diceValue);
            int playerNextPosition = basicBoard.calculateNextPosition(player1.getPosition(), diceValue);
            System.out.println("player next position " + playerNextPosition);
            if (playerNextPosition == BOARD_WINNING_POSITION) {
                System.out.println("Hooray!! you have reached the final point " + playerNextPosition);
                break;
            }
            player1.setPosition(playerNextPosition);
        }
    }
}
