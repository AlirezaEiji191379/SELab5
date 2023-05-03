package Shapes;

import Exceptions.InvalidLengthException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareTests {
    @ParameterizedTest
    @CsvSource({"0","-1"})
    public void SetLength_ShouldThrowsException_WhenTheLengthIsInvalid(int length)
    {
        assertThrows(InvalidLengthException.class,() -> {
            var fakeSquare = new Square(4);
            fakeSquare.setLength(length);
        });
    }


}
