package board;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
    public void testCalculateNextPositionNegative() {
        Assert.assertThrows("board position can not have negative number", NegetivePositionNotSupportedException.class, () -> basicBoard.calculateNextPosition(-1, 1));
    }

}