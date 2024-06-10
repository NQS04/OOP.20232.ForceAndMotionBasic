package force;

public class NonChangeableForce {
    protected double magnitude;
    private double rootX;
    private double rootY;

    public NonChangeableForce(double rootX, double RootY, double magnitude) {
        this.magnitude = magnitude;
        this.rootX = rootX;
        this.rootY = rootY;
    }

    public NonChangeableForce(double rootX, double rootY) {
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

}
