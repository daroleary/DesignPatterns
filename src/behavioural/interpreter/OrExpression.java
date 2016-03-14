package behavioural.interpreter;

// non-terminal
public class OrExpression implements Expression {

    private Expression _expr1 = null;
    private Expression _expr2 = null;

    public OrExpression(Expression expr1, Expression expr2) {
	_expr1 = expr1;
	_expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
	return _expr1.interpret(context) || _expr2.interpret(context);
    }
}
