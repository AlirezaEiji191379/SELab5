package Services.AreaCalculator;

import Services.Abstractions.IShapeAreaCalculator;
import Shapes.Square;

public class SquareAreaCalculator implements IShapeAreaCalculator<Square> {
    @Override
    public int computeArea(Square square) {
        return square.getLength() * square.getLength();
    }
}
