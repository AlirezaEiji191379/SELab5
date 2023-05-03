package Shapes;

import Exceptions.InvalidLengthException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTests {

    @ParameterizedTest
    @CsvSource({"0","-1"})
    public void SetWidth_ShouldThrowsException_WhenTheRectangleWidthIsInvalid(int height)
    {
        assertThrows(InvalidLengthException.class,() -> {
            var fakeRectangle = new Rectangle(5,6);
            fakeRectangle.setWeight(height);
        });
    }

    @ParameterizedTest
    @CsvSource({"0","-1"})
    public void SetHeight_ShouldThrowsException_WhenTheRectangleHeightIsInvalid(int weight)
    {
        assertThrows(InvalidLengthException.class,() -> {
            var fakeRectangle = new Rectangle(5,6);
            fakeRectangle.setHeight(weight);
        });
    }
}
