package anotherOne.ast.expression.booleanExpr;

import java.util.HashSet;

import questionnaires.TypeCheckVisitor;
import anotherOne.ast.expression.Expression;
import anotherOne.ast.expression.VariablesCollectionVisitor;
import anotherOne.ast.value.NumericalTypeValue;
import anotherOne.ast.value.TypeValue;
import anotherOne.ast.values.BoolValue;
import anotherOne.ast.values.Value;
import anotherOne.typeChecking.ErrorObject;

public class AndExpr extends BinaryLogicalExpr implements BinaryOperation//implements BooleanExpression
{
	public BooleanExpression left;
	public BooleanExpression right;
	
	public AndExpr(BooleanExpression left, BooleanExpression right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Value accept(ExpressionEvaluationVisitor visitor){//, Map<String, Id> varsMap) {
		return visitor.visit(this);//, varsMap);
	}

	public void accept(VariablesCollectionVisitor visitor){
	visitor.visit(this);
}

	@Override
	public HashSet<ErrorObject> accept(TypeCheckVisitor visitor) {
		return visitor.visit(this);
	}

	@Override
	public TypeValue getType() {
		return new NumericalTypeValue();
	}

	@Override
	public Expression getLeft() {
		return this.left;
	}

	@Override
	public Expression getRight() {
		return this.right;
	}

	@Override
	public Value evaluate(Value left, Value right) {
		return new BoolValue((boolean)left.getValue() && (boolean)left.getValue());
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
