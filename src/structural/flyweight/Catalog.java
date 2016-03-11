package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// Catalog acts as a Factory and cache for Item flyweight objects
// Could be replaced by a CacheFactory
public class Catalog {

    private Map<String,Item> _items = new HashMap<>();

    // factory method
    public Item lookup(String itemName) {
	if (!_items.containsKey(itemName)) {
	    _items.put(itemName, new Item(itemName));
	}
	return _items.get(itemName);
    }

    public int totalItemsMade() {
	return _items.size();
    }

}
