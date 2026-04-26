import java.util.LinkedList;

public class p31 {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("Shape of You");
        playlist.add("Believer");
        playlist.add("Blinding Lights");
        playlist.add("Perfect");
        playlist.add("Levitating");

        System.out.println("Initial Playlist:");
        displayPlaylist(playlist);

        if (!playlist.isEmpty()) {
            String firstSong = playlist.removeFirst();
            System.out.println("\nNow Playing: " + firstSong);
        }
        System.out.println("\nPlaylist after playing first song:");
        displayPlaylist(playlist);

        if (!playlist.isEmpty()) {
            String lastSong = playlist.removeLast();
            System.out.println("\nSkipped Song: " + lastSong);
        }
        System.out.println("\nPlaylist after skipping last song:");
        displayPlaylist(playlist);
    }

    public static void displayPlaylist(LinkedList<String> playlist) {
        for (String song : playlist) {
            System.out.println(song);
        }
    }
}