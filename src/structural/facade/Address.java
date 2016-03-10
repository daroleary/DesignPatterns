package structural.facade;

public class Address {

    private final String _id;
    private final String _streetName;
    private final String _city;

    public Address(String id, String streetName, String city) {
	_id = id;
	_streetName = streetName;
	_city = city;
    }

    public String getId() {
	return _id;
    }

    public String getStreetName() {
	return _streetName;
    }

    public String getCity() {
	return _city;
    }
}
