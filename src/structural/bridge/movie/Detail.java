package structural.bridge.movie;

public class Detail {
    private final String _label;
    private final String _value;

    public Detail(String label, String value) {
	_label = label;
	_value = value;
    }

    public String getLabel() {
	return _label;
    }

    public String getValue() {
	return _value;
    }
}
