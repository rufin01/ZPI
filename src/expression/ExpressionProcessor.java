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

			System.out.println(e.getClass());

			if(e instanceof VariableDeclaration) {
				VariableDeclaration decl = (VariableDeclaration) e;

				values.put(decl.id,  (Object) decl.value);
				evaluations.add((Object) decl.value);
			}
			else if (e instanceof Number || e instanceof Variable || e instanceof Addition || e instanceof Multiplication){	// e instanceof Number, Variable, Addition, Multiplication
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
				GMLEdge_copy result = (GMLEdge_copy)getStructureResult(e);
				evaluations.add(result);
			}
			else if (e instanceof GMLNode){	// e instanceof Number, Variable, Addition, Multiplication
				GMLNode_copy result = (GMLNode_copy)getStructureResult(e);
				evaluations.add(result);
			}
			else if (e instanceof GMLPoint){	// e instanceof Number, Variable, Addition, Multiplication
				GMLPoint_copy result = (GMLPoint_copy)getStructureResult(e);
				System.out.println("Point(" + result.x + ", " + result.y + ", " + result.z + ")");
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
		else if(e instanceof GMLEdge) {
			Expression node1 = ((GMLEdge) e).node1;
			Expression node2 = ((GMLEdge) e).node2;

			GMLNode_copy node1_alt = null;
			if(node1 instanceof Variable) node1_alt = new GMLNode_copy((GMLNode_copy)getEvalResultNode((Expression)getEvalResult(node1)));
			else if (node1 != null) node1_alt = (GMLNode_copy)getStructureResult(node1);

			GMLNode_copy node2_alt = null;
			if(node2 instanceof Variable) node2_alt = new GMLNode_copy((GMLNode_copy)getEvalResultNode((Expression)getEvalResult(node2)));
			else if (node2 != null) node2_alt = (GMLNode_copy)getStructureResult(node2);

			return new GMLEdge_copy(node1_alt, node2_alt);
		}
		else if(e instanceof GMLNode){
			getEvalResultNode(e);
		}
		else if(e instanceof GMLPoint){
			getEvalResultPoint(e);
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
//		else if(e instanceof NumericOperation) {
//			/*
//			 * Not working because it was originally pasted from tutorial
//			 *
//			 * The idea is to have more than one (int) numeric types and try to
//			 * somehow navigate between them
//			 */
//
//
//			Addition add = (Addition) e;
//			Object left = getEvalResult(add.left);
//			Object right = getEvalResult(add.right);
//			result = left + right;
//		}
//		else if(e instanceof Subtraction) {
//			Subtraction sub = (Subtraction) e;
//			Object left = getEvalResult(sub.left);
//			Object right = getEvalResult(sub.right);
//			result = left - right;
//		}
//		else if(e instanceof Multiplication) {
//			Multiplication mul = (Multiplication) e;
//			Object left = getEvalResult(mul.left);
//			Object right = getEvalResult(mul.right);
//			result = left * right;
//		}
//		else {	// e instanceof Division
//			Division div = (Division) e;
//			Object left = getEvalResult(div.left);
//			Object right = getEvalResult(div.right);
//			result = left / right;
//		}

		return result;
	}

	private Object getEvalResultNode(Expression e) {
		Expression point = ((GMLNode) e).point;
		Expression vpoint = ((GMLNode) e).vpoint;
		Expression apoint = ((GMLNode) e).apoint;

		System.out.println(point);

		GMLPoint_copy point_alt = null;
		if(point instanceof Variable) point_alt = new GMLPoint_copy((GMLPoint_copy)getEvalResultPoint((Expression)getEvalResult(point)));
		else if (point != null) point_alt = (GMLPoint_copy)getStructureResult(point);

		System.out.println(point_alt.x);
		System.out.println(point_alt.y);
		System.out.println(point_alt.z);

		GMLPoint_copy vpoint_alt = null;
		if(vpoint instanceof Variable) vpoint_alt = new GMLPoint_copy((GMLPoint_copy)getEvalResultPoint((Expression)getEvalResult(vpoint)));
		else if (vpoint != null) vpoint_alt = (GMLPoint_copy)getStructureResult(vpoint);

		GMLPoint_copy apoint_alt = null;
		if(apoint instanceof Variable) apoint_alt = new GMLPoint_copy((GMLPoint_copy)getEvalResultPoint((Expression)getEvalResult(apoint)));
		else if (apoint != null) apoint_alt = (GMLPoint_copy)getStructureResult(apoint);

		return new GMLNode_copy(point_alt, vpoint_alt, apoint_alt);
	}

	private Object getEvalResultPoint(Expression e) {
		Expression x = ((GMLPoint) e).x;
		Expression y = ((GMLPoint) e).y;
		Expression z = ((GMLPoint) e).z;
		Expression time = ((GMLPoint) e).time;
		Expression phi = ((GMLPoint) e).phi;
		Expression psi = ((GMLPoint) e).psi;
		Expression theta = ((GMLPoint) e).theta;

		Number<Double> x_d = null;
		if(x instanceof Variable) x_d = new Number<Double>(new Double(getEvalResult(x).toString()));
		else if (x != null) x_d = (Number<Double>)x;

		Number<Double> y_d = null;
		if(y instanceof Variable) y_d = new Number<Double>((Double) getEvalResult(y));
		else if (y != null) y_d = (Number<Double>)y;

		Number<Double> z_d = null;
		if(z != null && y instanceof Variable) z_d = new Number<Double>(new Double(getEvalResult(z).toString()));
		else if (z != null) z_d = (Number<Double>)z;

		Number<Long> time_d = null;
		if(time instanceof Variable) time_d = new Number<Long>(new Long(getEvalResult(time).toString()));
		else if (time != null) time_d = (Number<Long>)time;

		Number<Double> phi_d = null;
		if(phi instanceof Variable) phi_d = new Number<Double>(new Double(getEvalResult(phi).toString()));
		else if (phi != null) phi_d = (Number<Double>)phi;

		Number<Double> psi_d = null;
		if(psi instanceof Variable) psi_d = new Number<Double>(new Double(getEvalResult(psi).toString()));
		else if (psi != null) psi_d = (Number<Double>)psi;

		Number<Double> theta_d = null;
		if(theta instanceof Variable) theta_d = new Number<Double>(new Double(getEvalResult(theta).toString()));
		else if (theta != null) theta_d = (Number<Double>)theta;

		if(x_d != null && y_d != null && z_d != null && time_d != null && phi_d != null && psi_d != null && theta_d != null){
			return new GMLPoint_copy(x_d.num, y_d.num, z_d.num, theta_d.num, phi_d.num, psi_d.num, time_d.num);
		}
		else if(x_d != null && y_d != null && z_d != null && time_d != null){
			return new GMLPoint_copy(x_d.num, y_d.num, z_d.num, time_d.num);
		}
		else if(x_d != null && y_d != null && z_d != null) {
			return new GMLPoint_copy(x_d.num, y_d.num, z_d.num);
		}
		else return null;
	}
}
