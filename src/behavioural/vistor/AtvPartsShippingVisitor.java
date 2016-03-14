package behavioural.vistor;

import java.util.List;

public class AtvPartsShippingVisitor implements AtvPartVisitor {

    double _shippingAmount = 0;

    @Override
    public void visit(Wheel wheel) {
	System.out.println("Wheels are bulky and expensive to ship.");
	_shippingAmount += 15;
    }

    @Override
    public void visit(Fender fender) {
	System.out.println("Wheels are light and cheap to ship.");
	_shippingAmount += 3;
    }

    @Override
    public void visit(Oil oil) {
	System.out.println("Oil is hazardous and has a fee to ship.");
	_shippingAmount += 9;
    }

    @Override
    public void visit(PartsOrder order) {
	System.out.println("If they bought more than 3 things we will give them a discount on shipping.");
	List<AtvPart> parts = order.getParts();
	if (parts.size() > 3) {
	    _shippingAmount -= 5;
	}
	System.out.println("Shipping amount is: " + _shippingAmount);
    }
}
