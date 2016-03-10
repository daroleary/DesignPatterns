package structural.decorator;

// base of our decorators
public abstract class SandwichDecorator implements Sandwich {

    protected Sandwich _customSandwich;

    // can be the concrete class or another decorator
    public SandwichDecorator(Sandwich customSandwich) {
	_customSandwich = customSandwich;
    }

    @Override
    public String make() {
	return _customSandwich.make();
    }
}
