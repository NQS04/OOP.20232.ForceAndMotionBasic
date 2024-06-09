package main.java.force;

public class ChangeableForce {
    protected double magnitude;
    private double rootX;
    private double rootY;

    public ChangeableForce(double rootX, double RootY, double magnitude) {
        this.magnitude = magnitude;
        this.rootX = rootX;
        this.rootY = rootY;
    }

    public ChangeableForce(double rootX, double rootY) {
        this.rootX = rootX;
        this.rootY = rootY;
    }
    public double getMagnitude() {
        return magnitude;
    }
    public double getRootX() {
        return rootX;
    }
    public double getRootY() {
        return rootY;
    }


    public void setRootX(double rootX) {
        this.rootX = rootX;
    }
    public void setRootY(double rootY) {
        this.rootY = rootY;
    }
    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }
}

