package creational.Factory;

import creational.Factory.page.AboutPage;
import creational.Factory.page.CommentPage;
import creational.Factory.page.ContactPage;
import creational.Factory.page.PostPage;

public class Blog extends Website {
    @Override
    protected void createWebsite() {
	_pages.add(new PostPage());
	_pages.add(new AboutPage());
	_pages.add(new CommentPage());
	_pages.add(new ContactPage());
    }
}
