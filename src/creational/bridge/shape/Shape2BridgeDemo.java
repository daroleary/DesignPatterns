package creational.bridge.shape;

// bridge pattern, utilizing composition
// allows you to add additional combinations without
// making changes to shape or color (independent of changes)
public class Shape2BridgeDemo {

    public static void main(String[] args) {

	Color blue = new Blue();

	Shape square = new Square(blue);

	Color red = new Red();

	Shape circle = new Circle(red);

	Green green = new Green();

	Shape greenCircle = new Circle(green);

	Shape greenSquare = new Square(green);

	square.applyColor();
	circle.applyColor();
	greenCircle.applyColor();
	greenSquare.applyColor();
    }
}
