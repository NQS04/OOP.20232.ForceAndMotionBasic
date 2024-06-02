package main.java.force;

public class ChangeableForce extends Force {
    public ChangeableForce(double rootX, double rootY, double magnitude) {
        super(rootX, rootY, magnitude);
    }

	public void setMagnitude(double magnitude) {
		this.magnitude = magnitude;
	}
}
