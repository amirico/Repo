package anotherOne.ast.values;

import anotherOne.ast.IGlobalElement;
import anotherOne.ast.expression.booleanExpr.ExpressionEvaluationVisitor;

public interface Value extends IGlobalElement {

//	public Value (int integer) {
//	}
//	
//	public Value (boolean bool) {
//	}
//	
//	public Value (String str) {
//	}
	
	public abstract Object getValue();//{
//	};
	public abstract boolean Equals(Value value);

	public abstract Value access(ExpressionEvaluationVisitor expressionEvaluationVisitor); 
}
