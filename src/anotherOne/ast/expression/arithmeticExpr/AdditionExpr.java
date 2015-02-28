package anotherOne.ast.expression.arithmeticExpr;

import java.util.HashSet;
import questionnaires.TypeCheckVisitor;
import anotherOne.ast.expression.Expression;
import anotherOne.ast.expression.VariablesCollectionVisitor;
import anotherOne.ast.expression.booleanExpr.BinaryOperation;
import anotherOne.ast.expression.booleanExpr.ExpressionEvaluationVisitor;
import anotherOne.ast.values.IntValue;
import anotherOne.ast.values.Value;
import anotherOne.typeChecking.ErrorObject;

public class AdditionExpr extends BinaryArithmeticExpr implements BinaryOperation{
//	BinaryExpression lk;
	public AdditionExpr(Expression left, Expression right) {
		super(left, right);
	}

	public Value accept(ExpressionEvaluationVisitor visitor){
		return visitor.visit(this);//..visitAdditionExpr(toAdd);
	}

	public IntValue evaluate(Value left, Value right){
		return new IntValue((int)left.getValue() + (int)right.getValue());
	}
	
	@Override
	public void accept(VariablesCollectionVisitor visitor) {
		visitor.visit(this);
	}
	
	public HashSet<ErrorObject> accept(TypeCheckVisitor visitor){
		System.out.println("!!!!!!!!!!");
		System.out.println(left);
		System.out.println(right);
		System.out.println("!!!!!!!!!!");
		return visitor.visit(this);
	}

	@Override
	public Expression getLeft() {
		return this.left;
	}

	@Override
	public Expression getRight() {
		return this.right;
	}

//	@Override
//	public void accept(ForbidReferencesVisitor visitor) {
//		visitor.visit(this);
//	}

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
