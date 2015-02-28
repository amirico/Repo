package anotherOne.ast.expression.StringExpr;

import anotherOne.ast.expression.Id;
import anotherOne.ast.expression.VariablesCollectionVisitor;
import anotherOne.ast.expression.booleanExpr.ExpressionEvaluationVisitor;
import anotherOne.ast.values.Value;

public class StringIdExpr extends Id implements StringExpression {

	public int integer;
	//	public String idString;
	// comment: set/get value should/could happen through typeValue
	public StringIdExpr(String idString) {
		super(idString);
		//		this.idString = idString;
	}

	public void setValue(int integer){
		this.integer = integer;
	}

	public boolean getValue(){
		return false;
	}

	//	@Override
	//	public String getIdString (){
	//		return this.idString;
	//	}

	@Override
	public Value accept(ExpressionEvaluationVisitor visitor){//, Map<String, Id> varsMap) {
		return visitor.visit(this);//, varsMap);
	}

	@Override
	public void accept(VariablesCollectionVisitor visitor){
		visitor.visit(this);
	}
}
