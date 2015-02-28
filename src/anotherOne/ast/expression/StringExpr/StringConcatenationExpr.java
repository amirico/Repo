package anotherOne.ast.expression.StringExpr;

import java.util.HashSet;
import questionnaires.TypeCheckVisitor;
import anotherOne.ast.expression.VariablesCollectionVisitor;
import anotherOne.ast.expression.booleanExpr.BinaryOperation;
import anotherOne.ast.expression.booleanExpr.ExpressionEvaluationVisitor;
import anotherOne.ast.values.StringValue;
import anotherOne.ast.values.Value;
import anotherOne.typeChecking.ErrorObject;

public class StringConcatenationExpr extends BinaryStringExpr implements BinaryOperation{

	public StringConcatenationExpr(StringExpression left, StringExpression right) {
		super(left, right);
	}

	public Value accept(ExpressionEvaluationVisitor visitor){
		return visitor.visit(this);//..visitAdditionExpr(toAdd);
	}

	@Override
	public void accept(VariablesCollectionVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public HashSet<ErrorObject> accept(TypeCheckVisitor visitor){
		return visitor.visit(this);
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

	@Override
	public Value evaluate(Value left, Value right) {
		return new StringValue((String)left.getValue() + (String)right.getValue());
	}
}
