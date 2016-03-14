package behavioural.interpreter;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression {

    private String _data;

    public TerminalExpression(String data) {
        _data = data;
    }

    @Override
    public boolean interpret(String input) {
        StringTokenizer tokenizer = new StringTokenizer(input);
        while (tokenizer.hasMoreTokens()) {
            String test = tokenizer.nextToken();
            if (test.equals(_data)) {
                return true;
            }
        }
        return false;
    }
}
