package interpreter;

import java.util.HashMap;

public class AddExpression  extends  SymbolExpression {

	
	public AddExpression(Expression left, Expression right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public int interpreter(HashMap<String, Integer> var) {
		// TODO Auto-generated method stub
		return super.left.interpreter(var)+super.right.interpreter(var);
	}
	
}
