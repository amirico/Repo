package anotherOne.ast.expression;

import anotherOne.ast.value.TypeValue;
import anotherOne.ast.values.Value;

public interface BinaryExpression extends Expression {
	
	public Expression getLeft();
	public Expression getRight();
	public TypeValue getType();
	public Value evaluate(Value left, Value right);
	
//	{
//		return new NumericalTypeValue();
//	};
}
