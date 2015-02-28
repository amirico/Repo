package anotherOne.ast.expression.booleanExpr;

//public class ComparisonExpr {
import anotherOne.ast.expression.Expression;


	public abstract class ComparisonExpr implements BooleanExpression {
		// remove this class?
		public Expression left;
		public Expression right;

		public ComparisonExpr(Expression left, Expression right){
			this.left = left;
			this.right = right;	
		}

	
}
