package anotherOne.ast.expression.booleanExpr;

import anotherOne.ast.expression.BinaryExpression;
import anotherOne.ast.value.NumericalTypeValue;
import anotherOne.ast.value.TypeValue;

public abstract class BinaryLogicalExpr implements BinaryExpression, BooleanExpression{ 
//extends BinaryBooleanExpr {

	public BooleanExpression left;
	public BooleanExpression right;

	public BinaryLogicalExpr(BooleanExpression left, BooleanExpression right){
		this.left = left;
		this.right = right;	
	}

//	public BinaryLogicalExpr(BooleanExpression left, BooleanExpression right) {
//		super(left, right);
//	}

	@Override
	public TypeValue getType(){
		return new NumericalTypeValue();
	};
//	public TypeValue getType();

}
