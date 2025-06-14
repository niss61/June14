interface Playlist {
    void addSong(String song);
    void removeSong(String song);
}

class MediaPlayer {
    void play() { System.out.println("Playing media..."); }
    void pause() { System.out.println("Media paused."); }
    void stop() { System.out.println("Media stopped."); }
}

class VideoPlayer extends MediaPlayer implements Playlist {
    void play() { System.out.println("Playing video..."); }
    void pause() { System.out.println("Video paused."); }
    void stop() { System.out.println("Video stopped."); }
    void rewind() { System.out.println("Rewinding video..."); }
    void fastForward() { System.out.println("Fast forwarding video..."); }
    public void addSong(String song) { System.out.println("Added song to playlist: " + song); }
    public void removeSong(String song) { System.out.println("Removed song from playlist: " + song); }
}

public class MediaPlayerDemo {
    public static void main(String[] args) {
        VideoPlayer player = new VideoPlayer();
        player.play();
        player.pause();
        player.stop();
        player.rewind();
        player.fastForward();
        player.addSong("Song 1");
        player.removeSong("Song 1");
    }
}