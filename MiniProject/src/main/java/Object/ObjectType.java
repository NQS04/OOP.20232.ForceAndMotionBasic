package main.java.Object;

import javafx.scene.shape.Rectangle;
import main.java.exception.InvalidInputException;

import main.java.exception.*;
import main.java.force.*;

public abstract class ObjectType {
    protected double mass;
    protected double x;
    protected double y;
    protected double velocity;
    protected double acceleration;
    protected Rectangle shape;
    protected Surface surface;

    protected NonChangeableForce gravitationalForce;
    protected NonChangeableForce normalForce;
    protected ChangeableForce actorForce;
    protected ChangeableForce frictionalForce;

    public ObjectType(double mass, double x, double y, ChangeableForce actorForce, Surface surface) throws InvalidInputException {
        if(mass <= 0) {
            throw new InvalidInputException("Error, pls input a positive value!");
        }

        this.mass = mass;
        this.x = x;
        this.y = y;
        this.velocity = 0;
        this.acceleration = 0;
        this.surface = surface;
        this.gravitationalForce = new NonChangeableForce(x, y, mass*10);
        this.normalForce = new NonChangeableForce(x, y, mass*10);
        this.frictionalForce = new ChangeableForce(x, 0, 0);
        this.actorForce = actorForce;
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

    public double getSumForce() {
        return this.actorForce.getMagnitude() - this.frictionalForce.getMagnitude(); 
    }

    public void updateVelocity(double deltaT) {
        this.velocity = this.velocity + this.acceleration*deltaT;
    }
    public void updateAcceleration() {
        this.acceleration = this.getSumForce()/this.mass;
    }

    public void updatePosition(double deltaT) {
        this.x = this.x + this.velocity*deltaT;
    }

    public void updateForceRoot() {
		this.gravitationalForce.setRootX(this.x);
		this.normalForce.setRootX(this.x);
		this.actorForce.setRootX(this.x);
		this.frictionalForce.setRootX(this.x);
    }

    public void reset() {
        this.x = 0;
        this.y = 0;
        this.acceleration = 0;
        shape.setTranslateX(200);
    }
    public abstract double getSize();
}
