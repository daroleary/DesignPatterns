package creational.prototype.full;

public abstract class Item implements Cloneable {

    private String _title;
    private double _price;
    private String _url;

    // Should be able to make it generic (anything which extends Item)
    // Can do so by creating your own cloneable interface
    @Override
    protected Object clone() throws CloneNotSupportedException {
	return super.clone();
    }

    public String getTitle() {
	return _title;
    }

    public void setTitle(String title) {
	_title = title;
    }

    public double getPrice() {
	return _price;
    }

    public void setPrice(double price) {
	_price = price;
    }

    public String getUrl() {
	return _url;
    }

    public void setUrl(String url) {
	_url = url;
    }
}
