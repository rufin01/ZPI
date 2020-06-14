package expression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import operators.Addition;
import operators.Division;
import operators.Multiplication;
import operators.Numeric;
import operators.Subtraction;

public class ExpressionProcessor {
	List<Expression> list;
	public Map<String, Object> values;	/* symbol table for storing values of variables */
	
	public ExpressionProcessor(List<Expression> list) {
		this.list = list;
		values = new HashMap<>();
	}
	
	public List<String> getEvaluationResults() {
		List<String> evaluations = new ArrayList<>();
		
		for (Expression e: list) {
			if(e instanceof VariableDeclaration) {
				VariableDeclaration decl = (VariableDeclaration) e;
				values.put(decl.id,  (Object) decl.value);
			}
			else if (e instanceof Number || e instanceof Variable || e instanceof Addition || e instanceof Addition){	// e instanceof Number, Variable, Addition, Multiplication
				String input = e.toString();
				Object result = getEvalResult(e);
				evaluations.add(input + " is " + result);
			}
			else {	// 	e instanceof Node Point
				String input = e.toString();
				Object result = getStructureResult(e);
				
			}
		}
		
		
		return evaluations;
	}
	
	private Object getStructureResult(Expression e) {
		// TODO Auto-generated method stub
		return null;
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
