package Songs;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<Song> songList = new ArrayList<>();
        songList.add(new Song("Pink Moon"));
        songList.add(new Song("Somersault"));
        songList.add(new Song("Shiva Moon"));
        songList.add(new Song("Circles"));
        songList.add(new Song("Deep Channel"));
        songList.add(new Song("Passenger"));
        songList.add(new Song("Listen"));
        songList.add(new Song("Listen"));
        songList.add(new Song("Listen"));
        songList.add(new Song("Circles"));

        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);

        HashSet<Song> songSet = new HashSet<>();
        songSet.addAll(songList);
        System.out.println(songSet);
    }
}