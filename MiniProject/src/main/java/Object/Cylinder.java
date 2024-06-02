package main.java.Object;

import main.java.force.ChangeableForce;

public class Cylinder extends ObjectType {
    private double radius;
    public Cylinder(double mass, double radius, double x, double y, ChangeableForce actorForce, Surface surface) {
        //
    }

    @Override
    public double getSize() {
        return radius*2;
    }
}
