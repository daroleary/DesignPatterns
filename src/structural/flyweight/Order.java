package structural.flyweight;

import java.text.MessageFormat;

// Order has nothing specific to the flyweight pattern
// other than the fact it will consume the flyweight Item.
public class Order {

    private final int _orderNumber;
    private final Item _item;

    public Order(int orderNumber, Item item) {
	_orderNumber = orderNumber;
	_item = item;
    }

    void processOrder() {
	System.out.println(MessageFormat.format("Ordering {0} for order number {1}",
						_item,
						_orderNumber));
    }
}
