package Shapes;

import Exceptions.InvalidLengthException;

public class Rectangle {
    private int height;
    private int weight;

    public Rectangle(int weight,int height) throws InvalidLengthException {
        this.setHeight(height);
        this.setWeight(weight);
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setHeight(int height) throws InvalidLengthException {
        if(0 >= height)
            throw new InvalidLengthException("the height can not be lower than or equal to 0");
        this.height = height;
    }

    public void setWeight(int weight) throws InvalidLengthException {
        if(0 >= weight)
            throw new InvalidLengthException("the weight can not be lower than or equal to 0");
        this.weight = weight;
    }


}
