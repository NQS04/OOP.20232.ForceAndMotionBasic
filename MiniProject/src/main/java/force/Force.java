package main.java.force;

public abstract class Force {
    protected double magnitude;
    protected double rootX;
    protected double rootY;

    public double getMagnitude() {
        return magnitude;
    }

    public void setRootX(double rootX) {
        this.rootX = rootX;
    }
    public void setRootY(double rootY) {
        this.rootY = rootY;
    }

    public Force(double rootX, double rootY, double magnitude) {
        this.magnitude = magnitude;
        this.rootX = rootX;
        this.rootY = rootY;
    }

    public Force(double rootX, double rootY) {
        this.rootX = rootX;
        this.rootY = rootY;
    }

}
