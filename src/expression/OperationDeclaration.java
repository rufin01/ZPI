package expression;

public class OperationDeclaration extends Expression {
    Operation operation;

    public OperationDeclaration(Operation operation){
        this.operation = operation;
    }
}
