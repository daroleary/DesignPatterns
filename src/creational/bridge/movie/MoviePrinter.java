package creational.bridge.movie;

import java.util.ArrayList;
import java.util.List;

public class MoviePrinter extends Printer {

    private final Movie _movie;

    public MoviePrinter(Movie movie) {
	_movie = movie;
    }

    @Override
    protected List<Detail> getDetails() {

	List<Detail> details = new ArrayList<>();

	details.add(new Detail("Title", _movie.getTitle()));
	details.add(new Detail("Year", _movie.getYear()));
	details.add(new Detail("Runtime", _movie.getRuntime()));

	return details;
    }

    @Override
    protected String getHeader() {
	return _movie.getClassification();
    }
}
