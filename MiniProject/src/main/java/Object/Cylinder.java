package main.java.Object;

public class Cylinder extends ObjectType {
    private double radius;
    public Cylinder(double mass, double radius) {
        super(mass);
        this.radius = radius;
    }

    @Override
    public double getSize() {
        return radius*2;
    }
}
