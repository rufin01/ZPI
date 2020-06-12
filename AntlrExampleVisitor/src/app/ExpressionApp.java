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
		if(args.length != 1) {
			System.err.print("Usage: file name\n");
			
		}
		else {
			String fileName = args[0];
			ExprParser parser = getParser(fileName);
			
			// tell ANTLR to build parse tree
			// parse from the start symbol 'prog'
			ParseTree antlrAST = parser.prog();
			
			if(SyntaxErrorListener.hasError) {
				/*let the syntax error be reported */
			}
			else {
				// create a visitor for converting the parse tree into Program/Expression object
				AntlrToProgram progVisitor = new AntlrToProgram();
				Program prog = progVisitor.visit(antlrAST);
				
 				if(progVisitor.semanticErrors.isEmpty()) {
					ExpressionProcessor ep = new ExpressionProcessor(prog.expressions);
					for(String evaluation: ep.getEvaluationResults()) {
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
	}
	
	private static ExprParser getParser(String fileName) {
		ExprParser parser = null;
		
		try {
			CharStream input = CharStreams.fromFileName(fileName);
			ExprLexer lexer = new ExprLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			parser = new ExprParser(tokens);
			
			// syntax error handling
			parser.removeErrorListeners();
			parser.addErrorListener(new SyntaxErrorListener());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return parser;
	}

}
