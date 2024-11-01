package W3_3a;

import java.util.List;

public class LocalAudioPlayer implements AudioPlayer {
    private List<String> playlist;
    private int currentTrack;

    public LocalAudioPlayer(List<String> playlist) {
        this.playlist = playlist;
        this.currentTrack = 0;
    }

    @Override
    public void play() {
        if (!playlist.isEmpty()) {
            System.out.println("Playing local file: " + playlist.get(currentTrack));
        } else {
            System.out.println("Playlist is empty.");
        }
    }

    @Override
    public void stop() {
        System.out.println("Stopping local file: " + playlist.get(currentTrack));
    }

    @Override
    public void nextTrack() {
        if (currentTrack < playlist.size() - 1) {
            currentTrack++;
            play();
        } else {
            System.out.println("Reached the end of the playlist.");
        }
    }

    @Override
    public void previousTrack() {
        if (currentTrack > 0) {
            currentTrack--;
            play();
        } else {
            System.out.println("Already at the start of the playlist.");
        }
    }
}
