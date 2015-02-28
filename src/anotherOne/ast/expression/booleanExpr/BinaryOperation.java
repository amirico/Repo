package anotherOne.ast.expression.booleanExpr;

import anotherOne.ast.values.Value;

public interface BinaryOperation extends Value {

	public Value getLeftHand();
	public Value getRightHand();
	public Value evaluate(Value left, Value right);
	
}
