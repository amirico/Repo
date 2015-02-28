package anotherOne.ast.expression.StringExpr;

import java.util.HashSet;
import questionnaires.TypeCheckVisitor;
import anotherOne.ast.expression.VariablesCollectionVisitor;
import anotherOne.ast.expression.booleanExpr.ExpressionEvaluationVisitor;
import anotherOne.ast.value.StringTypeValue;
import anotherOne.ast.value.TypeValue;
import anotherOne.ast.values.Value;
import anotherOne.typeChecking.ErrorObject;

public class StringLiteral implements StringExpression {
	
	public String str;
	
	public StringLiteral (String str){
		this.str = str;
	}
	public String getValue (){
		return str;
	}

	@Override
	public Value accept(ExpressionEvaluationVisitor visitor){
		return visitor.visit(this);//..visitAdditionExpr(toAdd);
	}
	
	@Override
	public void accept(VariablesCollectionVisitor visitor) {
		visitor.visit(this);//..visitAdditionExpr(toAdd);
	}
	@Override
	public TypeValue getType() {
		return new StringTypeValue(str);
	}
	
	@Override
	public HashSet<ErrorObject> accept(TypeCheckVisitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}
}
