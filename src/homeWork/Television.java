package homeWork;

public class Television {
    public int currentChanel;
    public int maxChannel;
    public Channel[] channels;


    Television(int currentChanel,int maxChannel){
        this.currentChanel = currentChanel;
      this.maxChannel = maxChannel;
    }
    public void nextChannel(Channel[] channel){
        currentChanel+=1;
        if (currentChanel>maxChannel){
            currentChanel = 1;
        }
        channels = channel;
        System.out.println(channels[currentChanel-1].channelName);
    }

    public void prevChannel(Channel[] channel){
        currentChanel-=1;
        if (currentChanel<1){
            currentChanel = maxChannel;
        }
        channels = channel;
        System.out.println(channels[currentChanel-1].channelName);
    }

    public void switchTo(int n){
        currentChanel = n;
        System.out.println(channels[currentChanel-1].channelName);
    }

    public void displayCurrentChannel(){
        System.out.println(channels[currentChanel-1].channelName);
    }

    public void show(int n){
        currentChanel = n;
        System.out.println(n + " is " + channels[currentChanel-1].channelName);
    }

}
