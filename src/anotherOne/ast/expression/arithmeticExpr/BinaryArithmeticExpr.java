package anotherOne.ast.expression.arithmeticExpr;

import anotherOne.ast.expression.BinaryExpression;
import anotherOne.ast.expression.Expression;
import anotherOne.ast.value.NumericalTypeValue;
import anotherOne.ast.value.TypeValue;

public abstract class BinaryArithmeticExpr implements ArithmeticExpression, BinaryExpression {
	
	public Expression left;
	public Expression right;
	
	public BinaryArithmeticExpr(Expression left, Expression right){
		
		this.left = left;
		this.right = right;	
	}
	
	public TypeValue getType(){
		return new NumericalTypeValue();
	};
	
	
}
