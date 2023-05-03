package Shapes;

import Exceptions.InvalidLengthException;

public class Square {
    private int length;

    public Square(int length) throws InvalidLengthException {
        this.setLength(length);
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) throws InvalidLengthException {
        if(0 >= length)
            throw new InvalidLengthException("the length of square must be greater than zero!");
        this.length = length;
    }
}
