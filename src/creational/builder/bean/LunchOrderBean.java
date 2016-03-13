package creational.builder.bean;

public class LunchOrderBean {

    private String _bread;
    private String _condiment;
    private String _dressing;
    private String _meat;

    public String getBread() {
	return _bread;
    }

    public void setBread(String bread) {
	_bread = bread;
    }

    public String getCondiment() {
	return _condiment;
    }

    public void setCondiment(String condiment) {
	_condiment = condiment;
    }

    public String getDressing() {
	return _dressing;
    }

    public void setDressing(String dressing) {
	_dressing = dressing;
    }

    public String getMeat() {
	return _meat;
    }

    public void setMeat(String meat) {
	_meat = meat;
    }
}
