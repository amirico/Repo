package anotherOne.ast.expression.booleanExpr;

import anotherOne.ast.expression.BinaryExpression;
import anotherOne.ast.expression.Expression;
import anotherOne.ast.value.BooleanTypeValue;
import anotherOne.ast.value.TypeValue;


public abstract class BinaryBooleanExpr implements BooleanExpression, BinaryExpression {
	// remove this class?
	public Expression left;
	public Expression right;

	public BinaryBooleanExpr(Expression left, Expression right){
		
		this.left = left;
		this.right = right;	
	}

	@Override
	public TypeValue getType(){
		return new BooleanTypeValue();
	};
//	public boolean isBoolean();
}
