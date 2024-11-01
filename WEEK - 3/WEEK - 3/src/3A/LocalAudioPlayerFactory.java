package W3_3a;

import java.util.List;

public class LocalAudioPlayerFactory implements AudioPlayerFactory {
    @Override
    public AudioPlayer createAudioPlayer(List<String> playlist) {
        return new LocalAudioPlayer(playlist);
    }
}