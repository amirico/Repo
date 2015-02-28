package anotherOne.ast.expression.StringExpr;

import java.util.HashSet;

import questionnaires.TypeCheckVisitor;
import anotherOne.ast.expression.Expression;
import anotherOne.ast.expression.VariablesCollectionVisitor;
import anotherOne.ast.expression.booleanExpr.ExpressionEvaluationVisitor;
import anotherOne.ast.value.TypeValue;
import anotherOne.ast.values.Value;
import anotherOne.typeChecking.ErrorObject;

public interface StringExpression extends Expression {
	public TypeValue getType();
//	public int getValue();
	public Value accept(ExpressionEvaluationVisitor visitor);
	// accept (binaryExpressioinvisitor)
	public void accept(VariablesCollectionVisitor visitor);
	
//	public Map<String, Id> getExpressionVariables();//{
//		VariablesCollectionVisitor variablesCollector = new VariablesCollectionVisitor(new HashMap<String, Id>());
//		this.arithmeticExpr.accept(variablesCollector);
//		return variablesCollector.idMap;
//	}
	 public HashSet<ErrorObject> accept(TypeCheckVisitor visitor); 
}
// fix hierarchy - arithmetic / binary