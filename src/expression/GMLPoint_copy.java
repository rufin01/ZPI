package expression;

public class GMLPoint_copy extends Expression {

    public double x;
    public double y;
    public double z;
    public double theta;   //manipulation in X axis
    public double phi;     //manipulation in Y axis
    public double psi;     //manipulation in Z axis
    public double time;

    public GMLPoint_copy(double x, double y, double z, double theta, double phi, double psi, double time){
        this.x = x;
        this.y = y;
        this.z = z;
        this.theta = theta;
        this.phi = phi;
        this.psi = psi;
        this.time = time;
    }

    public GMLPoint_copy(double x, double y, double z, double time){
        this.x = x;
        this.y = y;
        this.z = z;
        this.time = time;
    }

    public GMLPoint_copy(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public GMLPoint_copy(GMLPoint_copy point){
        this.x = point.x;
        this.y = point.y;
        this.z = point.z;
        this.theta = point.theta;
        this.phi = point.phi;
        this.psi = point.psi;
        this.time = point.time;
    }

}
