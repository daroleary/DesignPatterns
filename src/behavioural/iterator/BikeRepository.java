package behavioural.iterator;

import java.util.Iterator;

public class BikeRepository implements Iterable<String> {

    private String[] _bikes;
    private int _index;

    public BikeRepository() {
	_bikes = new String[10];
	_index = 0;
    }

    public void addBike(String bike) {
	if (_index == _bikes.length) {
	    String[] largeBikes = new String[_bikes.length + 5];
	    System.arraycopy(_bikes, 0, largeBikes, 0, _bikes.length);
	    _bikes = largeBikes;
	    //noinspection UnusedAssignment
	    largeBikes = null;
	}

	_bikes[_index] = bike;
	_index++;
    }

    public Iterator<String> iterator() {
	return new Iterator<String>() {

	    private int currentIndex = 0;

	    @Override
	    public boolean hasNext() {
		return currentIndex < _bikes.length && _bikes[currentIndex] != null;
	    }

	    @Override
	    public String next() {
		return _bikes[currentIndex++];
	    }
	};
    }
}
