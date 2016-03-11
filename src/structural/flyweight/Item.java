package structural.flyweight;

// Instances of Item will be the Flyweights
public class Item {

    // everything is final and immutable
    private final String _name;

    public Item(String name) {
	_name = name;
    }

    public String toString() {
	return _name;
    }
}
