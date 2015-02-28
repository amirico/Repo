package anotherOne.ast.expression.unaryExpression;

import anotherOne.ast.expression.Expression;
import anotherOne.ast.value.TypeValue;
import anotherOne.ast.values.Value;

public interface UnaryExpression extends Expression {
	
	public TypeValue getType();
	public Value evaluate(Value value);
	
//	{
//		return new NumericalTypeValue();
//	};
}
