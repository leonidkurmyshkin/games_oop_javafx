package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlackTest extends TestCase {
    @Test
    public void testPosition() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        assertThat(bishop.position(),is(Cell.C1));
    }

    @Test
    public void testCopy() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Figure newBishop = bishop.copy(Cell.E3);
        assertThat(newBishop.position(),
                is(Cell.E3));
    }

    @Test
    public void testWayC1G5() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Cell[] way = bishop.way(Cell.G5);
        Cell[] expWay = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(way, is(expWay));
    }
}