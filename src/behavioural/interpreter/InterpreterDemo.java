package behavioural.interpreter;

// client
public class InterpreterDemo {

    static Expression buildInterpreterTree() {

	Expression terminal1 = new TerminalExpression("Lions");
	Expression terminal2 = new TerminalExpression("Tigers");
	Expression terminal3 = new TerminalExpression("Bears");

	// Tigers and Bears
	Expression alternation1 = new AndExpression(terminal2, terminal3);

	// Lions or (Tigers and Bears)
	Expression alternation2 = new OrExpression(terminal2, terminal3);

	// Bears and (Lions or (Tigers and Bears))
	return new AndExpression(terminal3, alternation2);
    }

    /**
     * main method - build the interpreter and then interpret a specific
     * sequence
     *
     * @param args
     */
    public static void main(String[] args) {

//	String context = "Lions";          // true
//	String context = "Tigers";         // false
//	String context = "Bears";          // false
//	String context = "Lions Tigers";   // false
	String context = "Lions Bears";    // true
//	String context = "Tigers Bears";   // true

	Expression define = buildInterpreterTree();

	System.out.println(context + " is " + define.interpret(context));
    }
}
