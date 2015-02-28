package anotherOne.ast.expression.booleanExpr;

import java.util.HashSet;

import questionnaires.TypeCheckVisitor;
import anotherOne.ast.expression.Expression;
import anotherOne.ast.expression.VariablesCollectionVisitor;
import anotherOne.ast.value.TypeValue;
import anotherOne.ast.values.Value;
import anotherOne.typeChecking.ErrorObject;

public interface BooleanExpression extends Expression {

	public TypeValue getType();

	public Value accept(ExpressionEvaluationVisitor visitor);
//
	public void accept(VariablesCollectionVisitor visitor);

	public HashSet<ErrorObject> accept(TypeCheckVisitor visitor);

	
//	public void accept(ForbidReferencesVisitor visitor);
}
