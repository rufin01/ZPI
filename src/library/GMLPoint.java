package library;

public class GMLPoint {

    public double x;
    public double y;
    public double z;
    public float theta;
    public float phi;
    public float psi;
    public double time;

    public GMLPoint(double x, double y, double z, float theta, float phi, float psi, double time){
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
