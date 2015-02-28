package anotherOne.ast.expression;

import java.util.HashSet;

import questionnaires.TypeCheckVisitor;
import anotherOne.ast.IGlobalElement;
import anotherOne.ast.expression.booleanExpr.ExpressionEvaluationVisitor;
import anotherOne.ast.value.TypeValue;
import anotherOne.ast.values.Value;
import anotherOne.typeChecking.ErrorObject;

public interface Expression extends IGlobalElement{

	public TypeValue getType();
	HashSet<ErrorObject> /*boolean */ accept(TypeCheckVisitor typeCheckVisitor);
	public void accept(VariablesCollectionVisitor variablesCollector);

//	public void accept(VariablesCollectionVisitor visitor);
	
//	{
//	return visitor.visit(this);//..visitAdditionExpr(toAdd);
//}
	
	public Value accept(ExpressionEvaluationVisitor visitor);
	
//	public int accept(ExpressionEvalutaionVisitor visitor){
//		return visitor.visit(this);//..visitAdditionExpr(toAdd);
//		
//	}
	
//	public <T> T accept(QuestionsVisitor<T> visitor) {
//		return visitor.visit(new JFrame(), this);
//	}

}
