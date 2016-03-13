package creational.Factory;

import creational.Factory.page.CartPage;
import creational.Factory.page.ItemPage;
import creational.Factory.page.SearchPage;

public class Shop extends Website {
    @Override
    protected void createWebsite() {
	_pages.add(new CartPage());
	_pages.add(new ItemPage());
	_pages.add(new SearchPage());
    }
}
