package behavioural.vistor.nonvistor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder implements AtvPart {

    List<AtvPart> _parts = new ArrayList<>();

    public void addPart(AtvPart part) {
	_parts.add(part);
    }

    public List<AtvPart> getParts() {
	return Collections.unmodifiableList(_parts);
    }

    public double calculateShipping() {
	double shippingCost = 0;
	for (AtvPart part : _parts) {
	    shippingCost += part.calculateShipping();
	}
	return shippingCost;
    }
}
