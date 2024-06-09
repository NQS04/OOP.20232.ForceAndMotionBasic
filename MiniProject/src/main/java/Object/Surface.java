package main.java.Object;

public class Surface {
    private double staticFrictionCoef;
    private double kineticFrictionCoef;

    public Surface(double staticFrictionCoef, double kineticFrictionCoef) {
        super();
        this.staticFrictionCoef = staticFrictionCoef;
        this.kineticFrictionCoef = kineticFrictionCoef;
    }

    public void setStaticFrictionCoef(double staticFrictionCoef) {
        this.staticFrictionCoef = staticFrictionCoef;
    }
    public void setKineticFrictionCoef(double kineticFrictionCoef) {
        this.kineticFrictionCoef = kineticFrictionCoef;
    }
    public double getStaticFrictionCoef() {
        return staticFrictionCoef;
    }
    public double getKineticFrictionCoef() {
        return kineticFrictionCoef;
    }

}

