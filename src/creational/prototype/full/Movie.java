package creational.prototype.full;

public class Movie extends Item {
    private String _title;
    private double _price;
    private String _runtime;

    @Override
    public double getPrice() {
	return _price;
    }

    public void setPrice(double price) {
	_price = price;
    }

    public String getTitle() {
	return _title;
    }

    public void setTitle(String title) {
	_title = title;
    }

    public String getRuntime() {
	return _runtime;
    }

    public void setRuntime(String runtime) {
	_runtime = runtime;
    }
}
