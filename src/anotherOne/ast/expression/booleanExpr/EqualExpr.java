package anotherOne.ast.expression.booleanExpr;

import java.util.HashSet;

import questionnaires.TypeCheckVisitor;
import anotherOne.ast.expression.BinaryExpression;
import anotherOne.ast.expression.Expression;
import anotherOne.ast.expression.VariablesCollectionVisitor;
import anotherOne.ast.value.BooleanTypeValue;
import anotherOne.ast.value.TypeValue;
import anotherOne.ast.values.BoolValue;
import anotherOne.ast.values.Value;
import anotherOne.typeChecking.ErrorObject;

public class EqualExpr implements BinaryExpression, BinaryOperation { // instead of */ extends BinaryBooleanExpr{
	// remove this class?
	public Expression left;
	public Expression right;

	public EqualExpr(Expression left, Expression right){
		
		this.left = left;
		this.right = right;	
	}
//{
//	public ArithmeticExpression left;
//	public ArithmeticExpression right;
	
//	public EqualExpr(ArithmeticExpression left, ArithmeticExpression right){
//		super(left,right);
//	}

	@Override
	public Value accept(ExpressionEvaluationVisitor visitor){//, Map<String, Id> varsMap) {
		return visitor.visit(this);//, varsMap);
	}

	public void accept(VariablesCollectionVisitor visitor){
	visitor.visit(this);
	}

	@Override
	public TypeValue getType() {
		return new BooleanTypeValue();
	}

	@Override
	public HashSet<ErrorObject> accept(TypeCheckVisitor visitor) {
		return visitor.visit(this);
	}

	@Override
	public Value evaluate(Value left, Value right) {
		return new BoolValue(left.getValue() == left.getValue());
	} // check if == holds also for strings e.g.

	
//	@Override
//	public boolean isBoolean() {
//		// TODO Auto-generated method stub
//		return false;
//	}
	@Override
	public Expression getLeft() {
		return this.left;
	}

	@Override
	public Expression getRight() {
		return this.right;
	}
	@Override
	public Object getValue() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean Equals(Value value) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Value access(ExpressionEvaluationVisitor expressionEvaluationVisitor) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Value getLeftHand() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Value getRightHand() {
		// TODO Auto-generated method stub
		return null;
	}

}
