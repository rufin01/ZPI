package expression;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr.ExprBaseVisitor;
import antlr.ExprParser;
import antlr.ExprParser.AddSubContext;
import antlr.ExprParser.ExprContext;
import antlr.ExprParser.GraphElementContext;
import antlr.ExprParser.MulDivContext;
import antlr.ExprParser.NodeAdditionContext;
import antlr.ExprParser.NodeContext;
import antlr.ExprParser.EdgeDeclarationContext;
import antlr.ExprParser.NodeDeclarationContext;
import antlr.ExprParser.NumberContext;
import antlr.ExprParser.PointDeclarationContext;
import antlr.ExprParser.UnaryMinusContext;
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
		
		String type = ctx.TYPE().getText();
		Object value = null;
		
		
		switch(ctx.TYPE().getSymbol().getText()){
			case "INT":
				if(!ctx.expr().isEmpty()) value = Integer.valueOf(ctx.expr().getText());
				return new VariableDeclaration<Integer>(id, type, (Integer) value);
			case "FLOAT":
				if(!ctx.expr().isEmpty()) value = Double.valueOf(ctx.expr().getText());
				return new VariableDeclaration<Double>(id, type, (Double) value);
			case "NODE":
				/*
				 * jakos tak to pewnie by wygladalo:
				 * 
				 * return new VariableDeclaration<GMLGraph>(id, type, (GMLGraph) value);
				 * 
				 */
				GMLNode temp = null;
				if(!ctx.expr().isEmpty()) {
					value = ctx.expr();
					System.out.println(value);
					temp = (GMLNode)this.visit((GraphElementContext)value);
				}
				
				System.out.println(ctx.expr().getText());
				
				
				return new VariableDeclaration<GMLNode>(id, type, temp);
				
			case "GRAPH":
				break;
			case "POINT":
				GMLPoint point_temp = null;
				if(!ctx.expr().isEmpty()) {
					value = ctx.expr();
					System.out.println(value);
					point_temp = (GMLPoint)this.visit((GraphElementContext)value);
				}

				System.out.println(ctx.expr().getText());


				return new VariableDeclaration<GMLPoint>(id, type, point_temp);
//			case ExprParser.RULE_graph:
				
			default:
				return new VariableDeclaration<Object>(id, type, value);		// should not ever reach this code
		}
		return new VariableDeclaration<Object>(id, type, value);
		
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
		if(numText.contains(".")) return new Number<Double>(Double.valueOf(numText));
		return new Number<Integer>(Integer.valueOf(numText));
	}
	
	public Expression visitUnaryMinus(UnaryMinusContext ctx) {
		NumberContext expr = (NumberContext)ctx.getChild(1);
		return visitNumber(expr);
	}
	
	public Expression visitGraphElementExpression(GraphElementContext ctx) {
		return this.visit(ctx.getChild(0));
	}

	public Expression visitEdgeDeclaration(EdgeDeclarationContext ctx) {
		Expression e1 = this.visit(ctx.expr(0));
		Expression e2 = this.visit(ctx.expr(1));

		return new GMLEdge(e1, e2);
	}

	public Expression visitNodeDeclaration(NodeDeclarationContext ctx) {

		Expression p1 = this.visit(ctx.expr(0));
		Expression p2 = this.visit(ctx.expr(1));
		Expression p3 = this.visit(ctx.expr(2));

		return new GMLNode(p1, p2, p3);
	}
	
	public Expression visitPointDeclaration(PointDeclarationContext ctx) {
		ArrayList<Expression> dlist = new ArrayList<>();
		for(ExprContext ex: ctx.expr()) {
			dlist.add(this.visit(ex));
		}
		
		if(dlist.size() == 3) return new GMLPoint(dlist.get(0), dlist.get(1), dlist.get(2));
		if(dlist.size() == 4) return new GMLPoint(dlist.get(0), dlist.get(1), dlist.get(2), dlist.get(3));
		if(dlist.size() > 0) return new GMLPoint(dlist.get(0), dlist.get(1), dlist.get(2), dlist.get(3), dlist.get(4), dlist.get(5), dlist.get(6));
		return null;
	}

	@Override
	public Expression visitNodeAddition(NodeAdditionContext ctx) {
		Expression node = this.visit(ctx.expr());
		return new NodeAddition(node);
	}
}
