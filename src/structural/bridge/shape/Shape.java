package structural.bridge.shape;

public abstract class Shape {

    protected final Color _color;

    public Shape(Color color) {
	_color = color;
    }

    abstract public void applyColor();
}
