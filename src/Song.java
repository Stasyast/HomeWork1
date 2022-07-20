public class Song extends BroadcastItem {
    String authorName = "";
    String name = ""; //song name

    public String getTitle() {
        return authorName + " : " + name;
    }


}
