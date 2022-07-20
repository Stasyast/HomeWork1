public class BroadcastItem implements BroadcastItemInterface {
    double price = 5.00; //per second
    public int duration = 3;

    public String getTitle()
    {
        return "";
    }

    public int getDuration()
    {
        return duration;
    }

    public double getProfit() {
        return price * duration;
    }

    public boolean isPaidContent()
    {
        return false;
    }
}
