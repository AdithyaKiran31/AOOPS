package W3_3b;

public class AudioPlayerFactory {
    public static AudioPlayer createAudioPlayer(String type, String fileName) {
        if (type.equals("local")) {
            return new LocalAudioPlayer(fileName);
        } else if (type.equals("online")) {
            return new OnlineAudioPlayer(fileName);
        } else if (type.equals("radio")) {
            return new RadioPlayer(fileName);
        } else {
            throw new UnsupportedOperationException("Unsupported audio player type");
        }
    }
}