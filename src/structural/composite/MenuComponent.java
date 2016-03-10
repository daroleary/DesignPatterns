package structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {

    String _name;
    String _url;
    List<MenuComponent> _menuComponents = new ArrayList<>();

    public MenuComponent add(MenuComponent menuComponent) {
	throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public MenuComponent remove(MenuComponent menuComponent) {
	throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public String getName() {
	return _name;
    }

    public String getUrl() {
	return _url;
    }

    public abstract String toString();

    String print(MenuComponent menuComponent) {
	StringBuilder builder = new StringBuilder(_name);
	builder.append(": ");
	builder.append(_url);
	builder.append("\n");
	return builder.toString();
    }
}
