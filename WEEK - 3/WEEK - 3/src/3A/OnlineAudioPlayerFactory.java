package W3_3a;
import java.util.List;
public class OnlineAudioPlayerFactory implements AudioPlayerFactory {
    @Override
    public AudioPlayer createAudioPlayer(List<String> playlist) {
        return new OnlineAudioPlayer(playlist);
    }
}
