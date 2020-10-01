package homeWork;

public class Channel {
    public String channelName;

    public Channel add(String channelName){
        Channel channel = new Channel();
        channel.channelName = channelName;
        return channel;
    }

}
