package expression;

public class Number<T> extends Expression {
	T num;
	
	public Number(T num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return num.toString();
	}
}
