package creational.bridge.movie;

import java.util.List;

public interface Formatter {

    String format(String header, List<Detail> details);
}