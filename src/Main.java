public class Main {
    public static void main(String[] args) {
        Broadcast broadcast = new Broadcast();
        broadcast.maxDuration = 12;

        Song song = new Song();
        song.duration = 4;
        song.authorName = "Stiven";
        song.name = "Hello world";


        broadcast.add(song);
        broadcast.add(new Song());
        broadcast.add(new Commercial());
        broadcast.add(new Commercial());
        broadcast.add(new Commercial());

        broadcast.printReport();

    }
}
