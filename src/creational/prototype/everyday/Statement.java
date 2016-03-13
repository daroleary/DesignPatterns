package creational.prototype.everyday;

import java.util.List;

public class Statement implements Cloneable {

    private String _sql;
    private List<String> _parameters;
    private Record _record;

    public Statement(String sql, List<String> parameters, Record record) {
	_sql = sql;
	_parameters = parameters;
	_record = record;
    }

    public Statement clone() {
	try {
	    return (Statement) super.clone();
	} catch (CloneNotSupportedException e) {
	    e.printStackTrace();
	}
	return null;
    }

    public String getSql() {
	return _sql;
    }

    public List<String> getParameters() {
	return _parameters;
    }

    public Record getRecord() {
	return _record;
    }
}
