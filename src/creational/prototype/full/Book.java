package creational.prototype.full;

public class Book extends Item {
    private int _numberOfPages;
    private double _price;
    private String _title;

    public int getNumberOfPages() {
	return _numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
	_numberOfPages = numberOfPages;
    }

    @Override
    public double getPrice() {
	return _price;
    }

    public void setPrice(double price) {
	_price = price;
    }

    @Override
    public String getTitle() {
	return _title;
    }

    public void setTitle(String title) {
	_title = title;
    }
}
