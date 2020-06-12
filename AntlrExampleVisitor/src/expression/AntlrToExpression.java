package expression;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import antlr.ExprBaseVisitor;
import antlr.ExprParser;
import antlr.ExprParser.AddSubContext;
import antlr.ExprParser.MulDivContext;
import antlr.ExprParser.NumberContext;
import antlr.ExprParser.VariableContext;
import antlr.ExprParser.VariableDeclarationContext;
import operators.Addition;
import operators.Division;
import operators.Multiplication;
import operators.Subtraction;

public class AntlrToExpression extends ExprBaseVisitor<Expression> {
	
	/*
	 * Given that all visit_* methods are called in a top-down fashion,
	 * we can be sure that the order in which we add declared variables in the `vars`
	 * is identical to how they are declared in the input program.
	 */
	
	private List<String> vars; 		// stores all the variables declared in the program so far
	private List<String> semanticErrors; 	// 1. duplicate declaration 2. reference to undeclared variable
	// Note that semantic errors are different from syntax errors.
	
	public AntlrToExpression(List<String> semanticErrors) {
		this.vars = new ArrayList<>();
		this.semanticErrors = semanticErrors;
		
	}
	
	@Override
	public Expression visitVariableDeclaration(VariableDeclarationContext ctx) {
		// ID is a method generated to correspond to the token ID in the source grammar.
		Token idToken = ctx.ID().getSymbol();		// equivalent to: ctx.getChild(0).getSymbol()
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;
		
		String id = ctx.getChild(0).getText();
		// Maintaining the vars list for semantic error reporting
		if (vars.contains(id)) {
			semanticErrors.add("Error: variable " + id + " already declared (" + line + ", " + column + ")");
		}
		else {
			vars.add(id);
		}
		
		String type = ctx.expr().getText();
		Object value = null;
		
		
		switch(ctx.TYPE().getSymbol().getType()){
			case ExprParser.INT:
				if(!ctx.expr().isEmpty()) value = Integer.valueOf(ctx.expr().getText());
				return new VariableDeclaration<Integer>(id, type, (Integer) value);
			case ExprParser.FLOAT:
				if(!ctx.expr().isEmpty()) value = Double.valueOf(ctx.expr().getText());
				return new VariableDeclaration<Double>(id, type, (Double) value);
//			case ExprParser.GRAPH:
//				/*
//				 * jakos tak to pewnie by wygladalo:
//				 * 
//				 * return new VariableDeclaration<GMLGraph>(id, type, (GMLGraph) value);
//				 * 
//				 */
//				break;
//			case ExprParser.EDGE:
//				break;
//			case ExprParser.NODE:
				
			default:
				return new VariableDeclaration<Object>(id, type, value);		// should not ever reach this code
		}
		
	}

	@Override
	public Expression visitMulDiv(MulDivContext ctx) {
		Expression left = visit(ctx.getChild(0));		// recursively visit left subtree of the current Multiplication node
		Expression right = visit(ctx.getChild(2)); 		// getChild(1) is a multiplication sign
		if( ctx.op.getType() == ExprParser.MUL) return new Multiplication(left, right);
		return new Division(left, right);
	}

	@Override
	public Expression visitAddSub(AddSubContext ctx) {
		Expression left = visit(ctx.getChild(0));		// recursively visit left subtree of the current Multiplication node
		Expression right = visit(ctx.getChild(2)); 		// getChild(1) is a addition sign
		if( ctx.op.getType() == ExprParser.ADD) return new Addition(left, right);
		return new Subtraction(left, right);
	}

	@Override
	public Expression visitVariable(VariableContext ctx) {
		Token idToken = ctx.ID().getSymbol();		// equivalent to: ctx.getChild(0).getSymbol()
		int line = idToken.getLine();
		int column = idToken.getCharPositionInLine() + 1;
		
		String id = ctx.getChild(0).getText();
		if(!vars.contains(id)) {
			semanticErrors.add("Error: variable " + id + " not declared (" + line + ", " + column + ")");
		}
		return new Variable(id);
	}

	@Override
	public Expression visitNumber(NumberContext ctx) {
		String numText = ctx.getChild(0).getText();
		int num = Integer.parseInt(numText);
		return new Number<Integer>(num);
	}
	
}
