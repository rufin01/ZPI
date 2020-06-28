package expression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import operators.Addition;
import operators.Division;
import operators.Multiplication;
import operators.NumericOperation;
import operators.Subtraction;

public class ExpressionProcessor {
	List<Expression> list;
	public Map<String, Object> values;	/* symbol table for storing values of variables */
	
	public ExpressionProcessor(List<Expression> list) {
		this.list = list;
		values = new HashMap<>();
	}
	
	public List<Object> getEvaluationResults() {
		List<Object> evaluations = new ArrayList<>();

		for (Expression e: list) {
			if(e instanceof VariableDeclaration) {
				VariableDeclaration decl = (VariableDeclaration) e;
				values.put(decl.id,  (Object) decl.value);
				evaluations.add((Object) decl.value);
			}
			else if (e instanceof Number || e instanceof Variable || e instanceof Addition || e instanceof Addition){	// e instanceof Number, Variable, Addition, Multiplication
				String input = e.toString();
//				Object result = getEvalResult(e);
				Object result = null;
				evaluations.add(input + " is " + result);
			}
			else if (e instanceof GMLGraph){	// e instanceof Number, Variable, Addition, Multiplication
				GMLGraph result = (GMLGraph)getStructureResult(e);
				evaluations.add(result);
			}
			else if (e instanceof GMLEdge){	// e instanceof Number, Variable, Addition, Multiplication
				GMLEdge result = (GMLEdge)getStructureResult(e);
				evaluations.add(result);
			}
			else if (e instanceof GMLNode){	// e instanceof Number, Variable, Addition, Multiplication
				GMLNode result = (GMLNode)getStructureResult(e);
				evaluations.add(result);
			}
			else if (e instanceof GMLPoint){	// e instanceof Number, Variable, Addition, Multiplication
				GMLPoint result = (GMLPoint)getEvalResult(e);
				evaluations.add(result);
			}
			else {	// 	e instanceof Node Point
				String input = e.toString();
				Object result = getStructureResult(e);
			}
		}

		return evaluations;
	}

	private Object getStructureResult(Expression e) {
		Object result = null;

		if(e instanceof GMLGraph){

		}
		else if(e instanceof GMLEdge){
			Expression expr1 = ((GMLEdge) e).getNode1();
			Expression expr2 = ((GMLEdge) e).getNode2();

			GMLNode expr1_value = null;
			if(expr1 instanceof Variable){
				expr1_value = (GMLNode)getEvalResult(expr1);
			}
			Object expr1_eval = getStructureResult(expr1);
			Object expr2_eval = getStructureResult(expr2);
			if(expr1_eval instanceof GMLNode && expr2_eval instanceof GMLNode){

			}
			GMLEdge_copy e_copy = new GMLEdge_copy();
		}
		else if(e instanceof GMLNode){

		}
		else if(e instanceof GMLPoint){

			Expression x = ((GMLPoint) e).x;
			Expression y = ((GMLPoint) e).y;
			Expression z = ((GMLPoint) e).z;
			Expression time = ((GMLPoint) e).time;
			Expression phi = ((GMLPoint) e).phi;
			Expression psi = ((GMLPoint) e).psi;
			Expression theta = ((GMLPoint) e).theta;

			Number<Double> x_d = null;
			if(x != null && x instanceof Variable) x_d = (Number<Double>)getEvalResult(x);
			else if (x != null) x_d = (Number<Double>)x;

			Number<Double> y_d = null;
			if(y != null && y instanceof Variable) y_d = (Number<Double>)getEvalResult(y);
			else if (y != null) y_d = (Number<Double>)y;

			Number<Double> z_d = null;
			if(z != null && y instanceof Variable) z_d = (Number<Double>)getEvalResult(z);
			else if (z != null) z_d = (Number<Double>)z;

			Number<Double> time_d = null;
			if(time != null && time instanceof Variable) time_d = (Number<Double>)getEvalResult(time);
			else if (time != null) time_d = (Number<Double>)time;

			Number<Double> phi_d = null;
			if(phi != null && phi instanceof Variable) phi_d = (Number<Double>)getEvalResult(phi);
			else if (phi != null) phi_d = (Number<Double>)phi;

			Number<Double> psi_d = null;
			if(psi != null && psi instanceof Variable) psi_d = (Number<Double>)getEvalResult(psi);
			else if (psi != null) psi_d = (Number<Double>)psi;

			Number<Double> theta_d = null;
			if(theta != null && theta instanceof Variable) theta_d = (Number<Double>)getEvalResult(theta);
			else if (theta != null) theta_d = (Number<Double>)theta;

			if(x_d != null && y_d != null && z_d != null && time_d != null && phi_d != null && psi_d != null && theta_d != null){
				return new GMLPoint(x_d, y_d, z_d, time_d, phi_d, psi_d, theta_d);
			}
			else if(x_d != null && y_d != null && z_d != null && time_d != null){
				return new GMLPoint(x_d, y_d, z_d, time_d);
			}
			else if(x_d != null && y_d != null && z_d != null) {
				return new GMLPoint(x_d, y_d, z_d);
			}
			else System.err.println("Errorek");
		}

		return result;
	}

	private Object getEvalResult(Expression e) {
		Object result = 0;

		if(e instanceof Number) {
			Number num = (Number) e;
			result = num.num;
		}
		else if(e instanceof Variable) {
			Variable var = (Variable) e;
			result = values.get(var.id);
		}
		else if(e instanceof NumericOperation) {
			/*
			 * Not working because it was originally pasted from tutorial
			 *
			 * The idea is to have more than one (int) numeric types and try to
			 * somehow navigate between them
			 */


			Addition add = (Addition) e;
			Object left = getEvalResult(add.left);
			Object right = getEvalResult(add.right);
			result = left + right;
		}
		else if(e instanceof Subtraction) {
			Subtraction sub = (Subtraction) e;
			Object left = getEvalResult(sub.left);
			Object right = getEvalResult(sub.right);
			result = left - right;
		}
		else if(e instanceof Multiplication) {
			Multiplication mul = (Multiplication) e;
			Object left = getEvalResult(mul.left);
			Object right = getEvalResult(mul.right);
			result = left * right;
		}
		else {	// e instanceof Division
			Division div = (Division) e;
			Object left = getEvalResult(div.left);
			Object right = getEvalResult(div.right);
			result = left / right;
		}

		return result;
	}
}
