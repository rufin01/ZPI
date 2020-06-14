package app;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr.ExprLexer;
import antlr.ExprParser;
import expression.AntlrToProgram;
import expression.ExpressionProcessor;
import expression.Program;
import expression.SyntaxErrorListener;

public class ExpressionApp {

	public static void main(String[] args) {
		String fileName = "C:\\Users\\meh-PC\\Documents\\Workspace\\ZPI\\src\\tests\\test3.txt";
		ExprParser parser = getParser(fileName);

		// tell ANTLR to build parse tree
		// parse from the start symbol 'prog'
		ParseTree antlrAST = parser.prog();

		if (SyntaxErrorListener.hasError) {
			/*let the syntax error be reported */
		}
		else {
			// create a visitor for converting the parse tree into Program/Expression object
			AntlrToProgram progVisitor = new AntlrToProgram();
			Program prog = progVisitor.visit(antlrAST);

			if(progVisitor.semanticErrors.isEmpty()) {
				ExpressionProcessor ep = new ExpressionProcessor(prog.expressions);
				for(Object evaluation: ep.getEvaluationResults()) {
					System.out.println(evaluation);
				}
			}
			else {
				for(String err: progVisitor.semanticErrors) {
					System.err.println(err);
				}
			}
		}
	}
	
	private static ExprParser getParser(String code) {
		CharStream input = CharStreams.fromString(code);
		ExprLexer lexer = new ExprLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ExprParser parser = new ExprParser(tokens);

		// syntax error handling
		parser.removeErrorListeners();
		parser.addErrorListener(new SyntaxErrorListener());

		return parser;
	}

}
