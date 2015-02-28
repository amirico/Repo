package anotherOne.ast.expression.booleanExpr;

import java.util.HashSet;

import questionnaires.TypeCheckVisitor;
import anotherOne.ast.expression.VariablesCollectionVisitor;
import anotherOne.ast.expression.unaryExpression.UnaryExpression;
import anotherOne.ast.value.TypeValue;
import anotherOne.ast.value.BooleanTypeValue;
import anotherOne.ast.values.BoolValue;
import anotherOne.ast.values.Value;
import anotherOne.typeChecking.ErrorObject;

public class NotExpr implements BooleanExpression, UnaryExpression//implements BooleanExpression
{
	public BooleanExpression subExpr;
	
	public NotExpr(BooleanExpression expr) {
		this.subExpr = expr;
	}

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
	public Value evaluate(Value value) {
		return new BoolValue(!(boolean)value.getValue());
	}

}
