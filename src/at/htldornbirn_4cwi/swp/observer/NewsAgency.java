package at.htldornbirn_4cwi.swp.observer;
import java.util.List;

public class NewsAgency {

    private final String name;
    private final List<NewsChannel> newsChannelList;


    public NewsAgency(String name) {
        this.name = name;
        this.newsChannelList = newsChannelList;
    }

    public void registerNewsChannel(NewsChannel newsChannel) {


    }


    public void broadcastMessage(String message) {

    }

    @Override
    public String toString() {
        return this.name;
    }
}
