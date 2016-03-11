package structural.proxy;

public class TwitterDemo {

    public static void main(String[] args) {

	TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());

	System.out.println(service.getTimeline("bh5k"));

	service.postToTimeLine("bh5k", "Some message that shouldn't go through");
    }
}
