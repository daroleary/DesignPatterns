package creational.Factory;

import creational.Factory.page.Page;

import java.util.ArrayList;
import java.util.List;

// Start of factory pattern
public abstract class Website {

    protected List<Page> _pages = new ArrayList<>();

    public Website() {
	this.createWebsite();
    }

    public List<Page> getPages() {
	return _pages;
    }

    protected abstract void createWebsite();
}
