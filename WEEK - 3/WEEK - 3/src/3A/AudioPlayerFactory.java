package W3_3a;

import java.util.List;

public interface AudioPlayerFactory {
    AudioPlayer createAudioPlayer(List<String> playlist);
}