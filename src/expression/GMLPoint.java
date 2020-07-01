package expression;

public class GMLPoint extends Expression {

    public double x = 0;
    public double y = 0;
    public double z = 0;
    public double theta = 0;   //manipulation in X axis
    public double phi = 0;     //manipulation in Y axis
    public double psi = 0;     //manipulation in Z axis
    public double time = 0;

    public GMLPoint(double x, double y, double z, float theta, float phi, float psi){
        this.x = x;
        this.y = y;
        this.z = z;
        this.theta = theta;
        this.phi = phi;
        this.psi = psi;
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
