package expression;

public class VariableDeclaration<T> extends Expression {
	public String id;
	public String type;
	public T value;
	
	public VariableDeclaration(String id, String type, T value) {
		this.id = id;
		this.type = type;
		this.value = value;
	}
	
	public VariableDeclaration(String id, String type) {
		this.id = id;
		this.type = type;
	}

}
