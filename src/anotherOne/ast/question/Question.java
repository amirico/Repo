
package anotherOne.ast.question;

import java.util.List;
import java.util.Set;

import javax.swing.JLabel;

import questionnaires.Tuple;
import anotherOne.ast.IGlobalElement;	//import anotherOne.ast.expression.VariablesCollectionVisitor;
//import anotherOne.ast.questionsVisitors.QuestionsVisitor;
import anotherOne.ast.value.TypeValue;
import anotherOne.main.QuestionPopulatorVisitor;
//import anotherOne.trash.recent.DefaultValueVisitor;
import anotherOne.typeChecking.TypeChecker;

public interface Question extends IGlobalElement {

	public String getQuestionText();
	public Set<String> getExpressionVariables ();
	public void addForbidenReferences(List<String> str);
	public List<String> getForbidenReferences();
	//	public String questionId; // maybe create from the terminals also object classes!?!?
//	public String questionText;
	public TypeValue getType();
	public void setLabel(JLabel label);
	public JLabel getLabel();
	public String getId();
	public boolean isComputed();
//	public <T> T accept(QuestionsVisitor<T> visitor); // {
	public void /*??*/  accept (TypeChecker typeChecker);
	public void accept(QuestionPopulatorVisitor visitor);
	public Tuple getQuestionsInfo();
}

	
