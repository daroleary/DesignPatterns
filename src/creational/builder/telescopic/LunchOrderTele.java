package creational.builder.telescopic;

public class LunchOrderTele {

    private String _bread;
    private String _condiment;
    private String _dressing;
    private String _meat;

    public LunchOrderTele(String bread) {
	_bread = bread;
    }

    public LunchOrderTele(String bread, String condiment) {
	this(bread);
	_condiment = condiment;
    }

    public LunchOrderTele(String bread, String condiment, String dressing) {
	this(bread,condiment);
	_dressing = dressing;

    }

    public LunchOrderTele(String bread, String condiment, String dressing, String meat) {
	this(bread,condiment,dressing);
	_meat = meat;
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
