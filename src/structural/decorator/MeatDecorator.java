package structural.decorator;

public class MeatDecorator extends SandwichDecorator {

    public MeatDecorator(Sandwich customSandwich) {
	super(customSandwich);
    }

    public String make() {
	return _customSandwich.make() + addMeat();
    }

    private String addMeat() {
	return " + turkey";
    }
}
