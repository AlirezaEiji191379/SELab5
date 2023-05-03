package Services.Abstractions;

public interface IShapeAreaCalculator<TShape> {
    int computeArea(TShape shape);
}
