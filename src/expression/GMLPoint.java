package expression;

public class GMLPoint extends Expression {

    public Expression x;
    public Expression y;
    public Expression z;
    public Expression theta;   //manipulation in X axis
    public Expression phi;     //manipulation in Y axis
    public Expression psi;     //manipulation in Z axis
    public Expression time;

    public GMLPoint(Expression x, Expression y, Expression z, Expression theta, Expression phi, Expression psi, Expression time){
        this.x = x;
        this.y = y;
        this.z = z;
        this.theta = theta;
        this.phi = phi;
        this.psi = psi;
        this.time = time;
    }

    public GMLPoint(Expression x, Expression y, Expression z, Expression theta, Expression phi, Expression psi){
        this.x = x;
        this.y = y;
        this.z = z;
        this.theta = theta;
        this.phi = phi;
        this.psi = psi;
    }

    public GMLPoint(Expression x, Expression y, Expression z, Expression time){
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
}
