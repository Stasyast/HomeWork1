public class Commercial extends BroadcastItem{
    double price = 5.00; //per second
    int duration = 0;

    String productName = "";

    public String getTitle()
    {
        return productName;
    }
    public boolean isPaidContent()
    {
        return true;
    }

}
