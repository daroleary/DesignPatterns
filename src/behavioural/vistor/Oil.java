package behavioural.vistor;

// Concrete Element
public class Oil implements AtvPart {

    @Override
    public void accept(AtvPartVisitor vistor) {
	vistor.visit(this);
    }
}
