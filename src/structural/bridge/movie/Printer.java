package structural.bridge.movie;

import java.util.List;

// bridge
public abstract class Printer {

    // formatter passed in via composition
    public String print(Formatter formatter) {
	return formatter.format(getHeader(), getDetails());
    }

    abstract protected List<Detail> getDetails();

    abstract protected String getHeader();
}
