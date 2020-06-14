// Generated from Expr.g4 by ANTLR 4.4

	package antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code TrueFalse}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalse(@NotNull ExprParser.TrueFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueFalse}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalse(@NotNull ExprParser.TrueFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull ExprParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull ExprParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull ExprParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull ExprParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanBinary}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanBinary(@NotNull ExprParser.BooleanBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanBinary}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanBinary(@NotNull ExprParser.BooleanBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(@NotNull ExprParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(@NotNull ExprParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(@NotNull ExprParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(@NotNull ExprParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(@NotNull ExprParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(@NotNull ExprParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#gml}.
	 * @param ctx the parse tree
	 */
	void enterGml(@NotNull ExprParser.GmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#gml}.
	 * @param ctx the parse tree
	 */
	void exitGml(@NotNull ExprParser.GmlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EdgeDeclaration}
	 * labeled alternative in {@link ExprParser#edge}.
	 * @param ctx the parse tree
	 */
	void enterEdgeDeclaration(@NotNull ExprParser.EdgeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EdgeDeclaration}
	 * labeled alternative in {@link ExprParser#edge}.
	 * @param ctx the parse tree
	 */
	void exitEdgeDeclaration(@NotNull ExprParser.EdgeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(@NotNull ExprParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(@NotNull ExprParser.UnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull ExprParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull ExprParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapStructure}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMapStructure(@NotNull ExprParser.MapStructureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapStructure}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMapStructure(@NotNull ExprParser.MapStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(@NotNull ExprParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(@NotNull ExprParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NodeDeclaration}
	 * labeled alternative in {@link ExprParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNodeDeclaration(@NotNull ExprParser.NodeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NodeDeclaration}
	 * labeled alternative in {@link ExprParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNodeDeclaration(@NotNull ExprParser.NodeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull ExprParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull ExprParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PointDeclaration}
	 * labeled alternative in {@link ExprParser#point}.
	 * @param ctx the parse tree
	 */
	void enterPointDeclaration(@NotNull ExprParser.PointDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PointDeclaration}
	 * labeled alternative in {@link ExprParser#point}.
	 * @param ctx the parse tree
	 */
	void exitPointDeclaration(@NotNull ExprParser.PointDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GraphElement}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGraphElement(@NotNull ExprParser.GraphElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GraphElement}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGraphElement(@NotNull ExprParser.GraphElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link ExprParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull ExprParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link ExprParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull ExprParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolNot}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolNot(@NotNull ExprParser.BoolNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolNot}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolNot(@NotNull ExprParser.BoolNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#tuples}.
	 * @param ctx the parse tree
	 */
	void enterTuples(@NotNull ExprParser.TuplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#tuples}.
	 * @param ctx the parse tree
	 */
	void exitTuples(@NotNull ExprParser.TuplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(@NotNull ExprParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(@NotNull ExprParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GraphDeclaration}
	 * labeled alternative in {@link ExprParser#graph}.
	 * @param ctx the parse tree
	 */
	void enterGraphDeclaration(@NotNull ExprParser.GraphDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GraphDeclaration}
	 * labeled alternative in {@link ExprParser#graph}.
	 * @param ctx the parse tree
	 */
	void exitGraphDeclaration(@NotNull ExprParser.GraphDeclarationContext ctx);
}