package main.java.Object;

public class Surface {
    private double staticFriction;
    private double kineticFriction;

    public Surface(double staticFriction, double kineticFriction) {
        this.staticFriction = staticFriction;
        this.kineticFriction = kineticFriction;
    }
    //Setter
    public void setStaticFriction(double staticFriction) {
        this.staticFriction = staticFriction;
    }
    public void setKineticFriction(double kineticFriction) {
        this.kineticFriction = kineticFriction;
    }
    public double getStaticFriction() {
        return staticFriction;
    }
    public double getKineticFriction() {
        return kineticFriction;
    }

    public double calFriction(ObjectType object) {
        if (object.velocity == 0) {
            return staticFriction*object.mass*9.81;
        }
        else {
            return kineticFriction*object.mass*9.81;
        }
    }
}
