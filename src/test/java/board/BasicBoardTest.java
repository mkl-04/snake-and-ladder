package board;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicBoardTest {

    private BasicBoard basicBoard;

    @Before

    public void setUp() {
        basicBoard = new BasicBoard();
    }

    @Test
    public void testCalculateNextPosition() {
        int nextPosition = basicBoard.calculateNextPosition(1, 1);
        assertEquals(2, nextPosition);
    }

    @Test
    public void testCalculateNextPositionBoundary() {
        int nextPosition = basicBoard.calculateNextPosition(1, 6);
        assertEquals(7, nextPosition);
    }

    @Test
    public void testCalculateNextPositionNegative() {
        Assert.assertThrows("Board position can not be negative.Passed value is = -1", NegativePositionNotSupportedException.class, () -> basicBoard.calculateNextPosition(-1, 1));
    }

    @Test
    public void testCalculateNextPositionInvalidDiceValue7() {
        Assert.assertThrows("Dice value should be between 1 to 6. Passed value is = 7", InvalidDiceValueException.class, () -> basicBoard.calculateNextPosition(1, 7));
    }

    @Test
    public void testCalculateNextPositionInvalidDiceValue0() {
        Assert.assertThrows("Dice value should be between 1 to 6. Passed value is = 0", InvalidDiceValueException.class, () -> basicBoard.calculateNextPosition(1, 0));
    }

    @Test
    public void testCalculateNextPositionWhenSnakePresent() {
        int nextPosition = basicBoard.calculateNextPosition(12, 2);
        assertEquals(7, nextPosition);
    }

}