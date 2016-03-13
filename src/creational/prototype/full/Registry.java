package creational.prototype.full;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> _items = new HashMap<>();

    public Registry() {
	loadItems();
    }

    public Item createItem(String type) {
	Item item = null;

	try {
	    item = (Item) _items.get(type).clone();
	} catch (CloneNotSupportedException e) {
	    e.printStackTrace();
	}

	return item;
    }

    private void loadItems() {
	// creates defaults effectively
	Movie movie = new Movie();
	movie.setTitle("Basic Movie");
	movie.setPrice(24.99);
	movie.setRuntime("2 hours");
	_items.put("Movie", movie);

	Book book = new Book();
	book.setNumberOfPages(335);
	book.setPrice(19.99);
	book.setTitle("Basic Book");
	_items.put("Book", book);
    }
}
