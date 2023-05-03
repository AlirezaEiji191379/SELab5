package Services.AreaCalculator;

import Services.Abstractions.IShapeAreaCalculator;
import Shapes.Rectangle;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleAreaCalculatorTests {

    private IShapeAreaCalculator<Rectangle> _sut;
    public RectangleAreaCalculatorTests()
    {
        _sut = new RectangleAreaCalculator();
    }

    @ParameterizedTest
    @CsvSource({"1,2,2","2,3,6","10,5,50"})
    public void Calculate_ShouldCalculateAreaCorrectly_WhenTheRectangleWidthAndHeightAreValid(int weight,int height,int expectedArea)
    {
        //Arrange
        var fakeRectangle = new Rectangle(weight,height);
        //Act
        var result = _sut.computeArea(fakeRectangle);
        //Assert
        assertEquals(expectedArea,result);

    }



}
