package structural.flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {

    private final Catalog _catalog = new Catalog();
    private final List<Order> _orders = new CopyOnWriteArrayList<>();

    void takeOrder(String itemName, int orderNumber) {
	Item item = _catalog.lookup(itemName);
	Order order = new Order(orderNumber, item);
	_orders.add(order);
    }

    void process() {
	for (Order order : _orders) {
	    order.processOrder();
	    _orders.remove(order);
	}
    }

    String report() {
	return "\nTotal Item objects made: " + _catalog.totalItemsMade();
    }
}
