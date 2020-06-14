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
	 * Enter a parse tree produced by {@link ExprParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(ExprParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(ExprParser.DeclContext ctx);
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
	 * Enter a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link ExprParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(ExprParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link ExprParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(ExprParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(ExprParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(ExprParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(ExprParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(ExprParser.FormalParameterContext ctx);
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
	 * Enter a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(ExprParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(ExprParser.FunctionExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link ExprParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(ExprParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(ExprParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementsBlock}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatementsBlock(ExprParser.StatementsBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementsBlock}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatementsBlock(ExprParser.StatementsBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ExprParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ExprParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ExprParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ExprParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnExpression}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpression(ExprParser.ReturnExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnExpression}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpression(ExprParser.ReturnExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ExprParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ExprParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(ExprParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(ExprParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instatementDeclaration}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterInstatementDeclaration(ExprParser.InstatementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instatementDeclaration}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitInstatementDeclaration(ExprParser.InstatementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ExprParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ExprParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void enterIfstat(ExprParser.IfstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void exitIfstat(ExprParser.IfstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#whilestat}.
	 * @param ctx the parse tree
	 */
	void enterWhilestat(ExprParser.WhilestatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#whilestat}.
	 * @param ctx the parse tree
	 */
	void exitWhilestat(ExprParser.WhilestatContext ctx);
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
	 * Enter a parse tree produced by {@link ExprParser#graph}.
	 * @param ctx the parse tree
	 */
	void enterGraph(ExprParser.GraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#graph}.
	 * @param ctx the parse tree
	 */
	void exitGraph(ExprParser.GraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNode(ExprParser.NodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNode(ExprParser.NodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#edge}.
	 * @param ctx the parse tree
	 */
	void enterEdge(ExprParser.EdgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#edge}.
	 * @param ctx the parse tree
	 */
	void exitEdge(ExprParser.EdgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#point}.
	 * @param ctx the parse tree
	 */
	void enterPoint(ExprParser.PointContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#point}.
	 * @param ctx the parse tree
	 */
	void exitPoint(ExprParser.PointContext ctx);
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
}