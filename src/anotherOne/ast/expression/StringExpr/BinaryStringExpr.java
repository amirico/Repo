package anotherOne.ast.expression.StringExpr;

import anotherOne.ast.value.NumericalTypeValue;
import anotherOne.ast.value.TypeValue;

public abstract class BinaryStringExpr implements StringExpression {
	
	public StringExpression left;
	public StringExpression right;
	
	public BinaryStringExpr(StringExpression left, StringExpression right){
		
		this.left = left;
		this.right = right;	
	}
	
	public TypeValue getType(){
		return new NumericalTypeValue();
	};
}
