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
	 * Enter a parse tree produced by {@link ExprParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(@NotNull ExprParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(@NotNull ExprParser.DeclContext ctx);
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
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull ExprParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull ExprParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#whilestat}.
	 * @param ctx the parse tree
	 */
	void enterWhilestat(@NotNull ExprParser.WhilestatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#whilestat}.
	 * @param ctx the parse tree
	 */
	void exitWhilestat(@NotNull ExprParser.WhilestatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#point}.
	 * @param ctx the parse tree
	 */
	void enterPoint(@NotNull ExprParser.PointContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#point}.
	 * @param ctx the parse tree
	 */
	void exitPoint(@NotNull ExprParser.PointContext ctx);
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
	 * Enter a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link ExprParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(@NotNull ExprParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link ExprParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(@NotNull ExprParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull ExprParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull ExprParser.IfStatementContext ctx);
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
	 * Enter a parse tree produced by {@link ExprParser#edge}.
	 * @param ctx the parse tree
	 */
	void enterEdge(@NotNull ExprParser.EdgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#edge}.
	 * @param ctx the parse tree
	 */
	void exitEdge(@NotNull ExprParser.EdgeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(@NotNull ExprParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(@NotNull ExprParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementsBlock}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatementsBlock(@NotNull ExprParser.StatementsBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementsBlock}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatementsBlock(@NotNull ExprParser.StatementsBlockContext ctx);
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
	 * Enter a parse tree produced by {@link ExprParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull ExprParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull ExprParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(@NotNull ExprParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(@NotNull ExprParser.FormalParameterContext ctx);
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
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull ExprParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull ExprParser.AssignmentContext ctx);
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
	 * Enter a parse tree produced by {@link ExprParser#graph}.
	 * @param ctx the parse tree
	 */
	void enterGraph(@NotNull ExprParser.GraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#graph}.
	 * @param ctx the parse tree
	 */
	void exitGraph(@NotNull ExprParser.GraphContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instatementDeclaration}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterInstatementDeclaration(@NotNull ExprParser.InstatementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instatementDeclaration}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitInstatementDeclaration(@NotNull ExprParser.InstatementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void enterIfstat(@NotNull ExprParser.IfstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void exitIfstat(@NotNull ExprParser.IfstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNode(@NotNull ExprParser.NodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNode(@NotNull ExprParser.NodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(@NotNull ExprParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(@NotNull ExprParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull ExprParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull ExprParser.FormalParametersContext ctx);
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
	 * Enter a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(@NotNull ExprParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(@NotNull ExprParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnExpression}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpression(@NotNull ExprParser.ReturnExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnExpression}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpression(@NotNull ExprParser.ReturnExpressionContext ctx);
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
}