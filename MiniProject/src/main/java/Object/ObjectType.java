package main.java.Object;

import javafx.scene.shape.Rectangle;

public abstract class ObjectType {
    protected double mass;
    protected double position;
    protected double velocity;
    protected double acceleration;
    protected Rectangle shape;

    public ObjectType(double mass) {
        this.mass = mass;
        this.position = 0;
        this.velocity = 0;
        this.acceleration = 0;
    }

    public void setShape(Rectangle shape) {
        this.shape = shape;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void applyForce(double force) {
        this.acceleration = force/mass;
    }

    public void update(double deltaTime, Surface surface) {
        double friction = surface.calFriction(this);
        double netForce = (acceleration*mass) - friction;
        this.acceleration = netForce/mass;
        this.velocity = this.acceleration*deltaTime;
        this.position = this.velocity*deltaTime;

        shape.setTranslateX(position);
    }

    public void reset() {
        this.position = 0;
        this.velocity = 0;
        this.acceleration = 0;
        shape.setTranslateX(200);
    }

    public abstract double getSize();
}
