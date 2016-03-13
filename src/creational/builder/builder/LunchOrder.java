package creational.builder.builder;

public class LunchOrder {

    public static class Builder {
	private String _bread;
	private String _condiment;
	private String _dressing;
	private String _meat;

	public Builder() {
	    _bread = null;
	    _condiment = null;
	    _dressing = null;
	    _meat = null;
	}

	public LunchOrder build() {
	    return new LunchOrder(this);
	}

	public Builder bread(String bread) {
	    _bread = bread;
	    return this;
	}

	public Builder condiment(String condiment) {
	    _condiment = condiment;
	    return this;
	}

	public Builder dressing(String dressing) {
	    _dressing = dressing;
	    return this;
	}

	public Builder meat(String meat) {
	    _meat = meat;
	    return this;
	}
    }

    private final String _bread;
    private final String _condiment;
    private final String _dressing;
    private final String _meat;

    private LunchOrder(Builder builder) {
	_bread = builder._bread;
	_condiment = builder._condiment;
	_dressing = builder._dressing;
	_meat = builder._meat;
    }

    public String getBread() {
	return _bread;
    }

    public String getCondiment() {
	return _condiment;
    }

    public String getDressing() {
	return _dressing;
    }

    public String getMeat() {
	return _meat;
    }
}
