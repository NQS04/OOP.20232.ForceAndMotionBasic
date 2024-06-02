package main.java.Object;

public class Cube extends ObjectType {
    private double sideLength;

    public Cube(double mass, double sideLength) {
        super(mass);
        this.sideLength = sideLength;
    }

    @Override
    public double getSize() {
        return sideLength;
    }
}
