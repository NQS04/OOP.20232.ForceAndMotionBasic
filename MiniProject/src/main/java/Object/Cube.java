package main.java.Object;

public class Cube extends ObjectType {
    private double sideLength;

    public Cube(double mass, double sideLength) {
        //
    }

    @Override
    public double getSize() {
        return sideLength;
    }
}
