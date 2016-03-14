package behavioural.vistor;

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

    @Override
    public void accept(AtvPartVisitor visitor) {
	for (AtvPart part : _parts) {
	    part.accept(visitor);
	}
	visitor.visit(this);
    }
}
