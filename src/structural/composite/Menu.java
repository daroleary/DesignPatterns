package structural.composite;

// This is the Composite object in relation to the composite pattern
public class Menu extends MenuComponent {

    public Menu(final String name, final String url) {
	_name = name;
	_url = url;
    }

     @Override
    public MenuComponent add(MenuComponent menuComponent) {
	_menuComponents.add(menuComponent);
	return menuComponent;
    }

     @Override
      public MenuComponent remove(MenuComponent menuComponent) {
	_menuComponents.remove(menuComponent);
	return menuComponent;
    }

    @Override
    public String toString() {

	StringBuilder builder = new StringBuilder();

	builder.append(print(this));

	for (MenuComponent menuComponent : _menuComponents) {
	    builder.append(menuComponent.toString());
	}

	return builder.toString();
    }
}
