package structural.composite;

public class MenuItem extends MenuComponent {

    public MenuItem(final String name, final String url) {
	_name = name;
	_url = url;
    }

    @Override
    public String toString() {
	return print(this);
    }
}
