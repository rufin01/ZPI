// Generated from Expr.g4 by ANTLR 4.8

	package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ExprParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ExprParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link ExprParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ExprParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link ExprParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ExprParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueFalse}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalse(ExprParser.TrueFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueFalse}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalse(ExprParser.TrueFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapStructure}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMapStructure(ExprParser.MapStructureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapStructure}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMapStructure(ExprParser.MapStructureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ExprParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ExprParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ExprParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ExprParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanBinary}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanBinary(ExprParser.BooleanBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanBinary}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanBinary(ExprParser.BooleanBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(ExprParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(ExprParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(ExprParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(ExprParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(ExprParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(ExprParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GraphElement}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGraphElement(ExprParser.GraphElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GraphElement}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGraphElement(ExprParser.GraphElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(ExprParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(ExprParser.UnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolNot}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolNot(ExprParser.BoolNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolNot}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolNot(ExprParser.BoolNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(ExprParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(ExprParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(ExprParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(ExprParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#tuples}.
	 * @param ctx the parse tree
	 */
	void enterTuples(ExprParser.TuplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#tuples}.
	 * @param ctx the parse tree
	 */
	void exitTuples(ExprParser.TuplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(ExprParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(ExprParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GraphDeclaration}
	 * labeled alternative in {@link ExprParser#graph}.
	 * @param ctx the parse tree
	 */
	void enterGraphDeclaration(ExprParser.GraphDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GraphDeclaration}
	 * labeled alternative in {@link ExprParser#graph}.
	 * @param ctx the parse tree
	 */
	void exitGraphDeclaration(ExprParser.GraphDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NodeDeclaration}
	 * labeled alternative in {@link ExprParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNodeDeclaration(ExprParser.NodeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NodeDeclaration}
	 * labeled alternative in {@link ExprParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNodeDeclaration(ExprParser.NodeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EdgeDeclaration}
	 * labeled alternative in {@link ExprParser#edge}.
	 * @param ctx the parse tree
	 */
	void enterEdgeDeclaration(ExprParser.EdgeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EdgeDeclaration}
	 * labeled alternative in {@link ExprParser#edge}.
	 * @param ctx the parse tree
	 */
	void exitEdgeDeclaration(ExprParser.EdgeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PointDeclaration}
	 * labeled alternative in {@link ExprParser#point}.
	 * @param ctx the parse tree
	 */
	void enterPointDeclaration(ExprParser.PointDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PointDeclaration}
	 * labeled alternative in {@link ExprParser#point}.
	 * @param ctx the parse tree
	 */
	void exitPointDeclaration(ExprParser.PointDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#gml}.
	 * @param ctx the parse tree
	 */
	void enterGml(ExprParser.GmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#gml}.
	 * @param ctx the parse tree
	 */
	void exitGml(ExprParser.GmlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NodeAddition}
	 * labeled alternative in {@link ExprParser#addNode}.
	 * @param ctx the parse tree
	 */
	void enterNodeAddition(ExprParser.NodeAdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NodeAddition}
	 * labeled alternative in {@link ExprParser#addNode}.
	 * @param ctx the parse tree
	 */
	void exitNodeAddition(ExprParser.NodeAdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EdgeAddition}
	 * labeled alternative in {@link ExprParser#addEdge}.
	 * @param ctx the parse tree
	 */
	void enterEdgeAddition(ExprParser.EdgeAdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EdgeAddition}
	 * labeled alternative in {@link ExprParser#addEdge}.
	 * @param ctx the parse tree
	 */
	void exitEdgeAddition(ExprParser.EdgeAdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EdgeModificatio}
	 * labeled alternative in {@link ExprParser#modifyNode}.
	 * @param ctx the parse tree
	 */
	void enterEdgeModificatio(ExprParser.EdgeModificatioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EdgeModificatio}
	 * labeled alternative in {@link ExprParser#modifyNode}.
	 * @param ctx the parse tree
	 */
	void exitEdgeModificatio(ExprParser.EdgeModificatioContext ctx);
}