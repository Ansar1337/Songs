package Songs;

import java.util.Objects;

public class Song implements Comparable<Song> {
    String songs;

    public Song(String songs) {
        this.songs = songs;
    }

    public String getSongs() {
        return songs;
    }

    public void setSongs(String songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Song = " + songs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(songs, song.songs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(songs);
    }

    @Override
    public int compareTo(Song s) {
        return songs.compareTo(s.getSongs());
    }
}