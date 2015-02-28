package anotherOne.ast.boxs;

import anotherOne.ast.IGlobalElement;
import anotherOne.main.QuestionPopulatorVisitor;
import anotherOne.typeChecking.TypeChecker;
public interface GlobalBox extends IGlobalElement{

	public void accept(QuestionPopulatorVisitor visitor);// {
	public void accept(TypeChecker visitor);// {
	
}
