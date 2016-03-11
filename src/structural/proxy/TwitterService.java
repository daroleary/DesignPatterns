package structural.proxy;

public interface TwitterService {

    public String getTimeline(String screenName);
    public void postToTimeLine(String screenName, String message);
}
