// Generated from Expr.g4 by ANTLR 4.8

	package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ExprParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link ExprParser#variableDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(ExprParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueFalse}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalse(ExprParser.TrueFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapStructure}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapStructure(ExprParser.MapStructureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ExprParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ExprParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanBinary}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanBinary(ExprParser.BooleanBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(ExprParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(ExprParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(ExprParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GraphElement}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraphElement(ExprParser.GraphElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinus(ExprParser.UnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolNot}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolNot(ExprParser.BoolNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(ExprParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(ExprParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#tuples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuples(ExprParser.TuplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(ExprParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#gml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGml(ExprParser.GmlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GraphDeclaration}
	 * labeled alternative in {@link ExprParser#graph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraphDeclaration(ExprParser.GraphDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NodeDeclaration}
	 * labeled alternative in {@link ExprParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeDeclaration(ExprParser.NodeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EdgeDeclaration}
	 * labeled alternative in {@link ExprParser#edge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeDeclaration(ExprParser.EdgeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PointDeclaration}
	 * labeled alternative in {@link ExprParser#point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointDeclaration(ExprParser.PointDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NodeAddition}
	 * labeled alternative in {@link ExprParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeAddition(ExprParser.NodeAdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EdgeAddition}
	 * labeled alternative in {@link ExprParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeAddition(ExprParser.EdgeAdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EdgeModificatio}
	 * labeled alternative in {@link ExprParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeModificatio(ExprParser.EdgeModificatioContext ctx);
}