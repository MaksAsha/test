package ru.job4j.chess.figures;

import ru.job4j.chess.models.Cell;
import ru.job4j.chess.models.Figure;
import ru.job4j.chess.exceptions.ImpossibleMoveException;

public class Queen extends Figure {

    public Queen(Cell cell) {
        super(cell);
    }

    @Override
    public Cell[] way(Cell source, Cell dest) throws ImpossibleMoveException {
        return new Cell[0];
    }

    @Override
    public Figure copy(Cell dest) {
        return new Queen(dest);
    }
}
