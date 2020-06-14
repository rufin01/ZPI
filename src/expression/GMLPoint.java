package expression;

public class GMLPoint extends Expression {

    public double x;
    public double y;
    public double z;
    public double theta;   //manipulation in X axis
    public double phi;     //manipulation in Y axis
    public double psi;     //manipulation in Z axis
    public double time;

    public GMLPoint(double x, double y, double z, double theta, double phi, double psi, double time){
        this.x = x;
        this.y = y;
        this.z = z;
        this.theta = theta;
        this.phi = phi;
        this.psi = psi;
        this.time = time;
    }

    public GMLPoint(double x, double y, double z, double time){
        this.x = x;
        this.y = y;
        this.z = z;
        this.time = time;
    }

    public GMLPoint(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

}
