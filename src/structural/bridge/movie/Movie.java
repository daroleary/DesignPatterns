package structural.bridge.movie;

public class Movie {

    private String _classification;
    private String _runtime;
    private String _title;
    private String _year;

    public String getClassification() {
	return _classification;
    }

    public void setClassification(String classification) {
	_classification = classification;
    }

    public String getRuntime() {
	return _runtime;
    }

    public void setRuntime(String runtime) {
	_runtime = runtime;
    }

    public String getTitle() {
	return _title;
    }

    public void setTitle(String title) {
	_title = title;
    }

    public String getYear() {
	return _year;
    }

    public void setYear(String year) {
	_year = year;
    }
}
