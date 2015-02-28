package anotherOne.ast.boxs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import anotherOne.ast.question.Question;
import anotherOne.ast.value.TypeValue;
import anotherOne.main.QuestionPopulatorVisitor;
import anotherOne.typeChecking.TypeChecker;
public class BoxObject implements GlobalBox {//IGlobalElement{
	
//	public String id;
	public List<Question> questionsList = new ArrayList<Question>();
	
	//	public QuestionsList questionsList = new QuestionsList(questionList);
	public List<Map<Question,TypeValue>> questionValues = new ArrayList<Map<Question,TypeValue>>();
	
//	public BoxObject(String id, List<Question> questionsList){
//		this.id = id;
//		this.questionsList = questionsList;
//	}

	public BoxObject(List<Question> questionsList){
//		this.id = id;
		this.questionsList = questionsList;
	}

	public void accept(TypeChecker typeChecker){
		typeChecker.visit(this);
	}
	
//	public String getId (){
//		return id;
//	}

	public List<Question> getQuestions (){
		return this.questionsList;
	}

	public void accept(QuestionPopulatorVisitor visitor) {
		visitor.visit(this);
	}
	
//	public Question getQuestionById (){
//		// return this.questionsList;
//	}
	
}
