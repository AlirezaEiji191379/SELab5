package Services.AreaCalculator;

import Services.Abstractions.IShapeAreaCalculator;
import Shapes.Rectangle;

public class RectangleAreaCalculator implements IShapeAreaCalculator<Rectangle> {
    @Override
    public int computeArea(Rectangle rectangle) {
        return rectangle.getHeight() * rectangle.getWeight();
    }
}
