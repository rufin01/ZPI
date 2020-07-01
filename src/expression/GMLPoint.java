package expression;

public class GMLPoint extends Expression {

<<<<<<< HEAD
    public double x = 0;
    public double y = 0;
    public double z = 0;
    public double theta = 0;   //manipulation in X axis
    public double phi = 0;     //manipulation in Y axis
    public double psi = 0;     //manipulation in Z axis
    public double time = 0;
=======
    public Expression x;
    public Expression y;
    public Expression z;
    public Expression theta;   //manipulation in X axis
    public Expression phi;     //manipulation in Y axis
    public Expression psi;     //manipulation in Z axis
    public Expression time;
>>>>>>> 61002803e3cfa43fb1174f93c612a6b0d08e582a

    public GMLPoint(Expression x, Expression y, Expression z, Expression theta, Expression phi, Expression psi, Expression time){
        this.x = x;
        this.y = y;
        this.z = z;
        this.theta = theta;
        this.phi = phi;
        this.psi = psi;
        this.time = time;
    }

<<<<<<< HEAD
    public GMLPoint(double x, double y, double z, float theta, float phi, float psi){
        this.x = x;
        this.y = y;
        this.z = z;
        this.theta = theta;
        this.phi = phi;
        this.psi = psi;
    }

    public GMLPoint(double x, double y, double z, double time){
=======
    public GMLPoint(Expression x, Expression y, Expression z, Expression time){
>>>>>>> 61002803e3cfa43fb1174f93c612a6b0d08e582a
        this.x = x;
        this.y = y;
        this.z = z;
        this.time = time;
    }

    public GMLPoint(Expression x, Expression y, Expression z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public GMLPoint(){
    }
}
