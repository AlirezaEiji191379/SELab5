package Services.AreaCalculator;

import Exceptions.InvalidLengthException;
import Services.Abstractions.IShapeAreaCalculator;
import Shapes.Square;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareAreaCalculatorTests {

    private IShapeAreaCalculator<Square> _squareAreaCalculator;

    public SquareAreaCalculatorTests()
    {
        _squareAreaCalculator = new SquareAreaCalculator();
    }

    @ParameterizedTest
    @CsvSource({"1,1","2,4","3,9","4,16","5,25","6,36"})
    public void computeArea_ShouldReturnCorrectSquareArea_WhenTheLengthOfSquareIsValid(int length,int expected) throws InvalidLengthException {
        //Arrange
        var fakeSquare = new Square(length);
        //Act
        var result = _squareAreaCalculator.computeArea(fakeSquare);
        //Assert
        assertEquals(expected,result);
    }


}
