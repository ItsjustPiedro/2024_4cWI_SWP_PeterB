package at.htldornbirn_4cwi.swp.observer;

public class NewsChannel {

    private final String name;

    public NewsChannel(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return this.name;
    }
}
