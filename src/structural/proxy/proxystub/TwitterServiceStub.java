package structural.proxy.proxystub;

public class TwitterServiceStub implements TwitterService{

    @Override
    public String getTimeline(String screenName) {
        return "My neato timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {
        System.out.println("Posted to timeline, message: "+message);
    }
}
