package W3_3b;

public class Final {
    public static void main(String[] args) {
        AudioPlayer localPlayer = AudioPlayerFactory.createAudioPlayer("local", "song.mp3");
        AudioPlayer onlinePlayer = AudioPlayerFactory.createAudioPlayer("online", "stream_url");
        AudioPlayer radioPlayer = AudioPlayerFactory.createAudioPlayer("radio", "station_name");

        AudioPlayer equalizer = new EqualizerDecorator(localPlayer);
        equalizer.play();
        equalizer.pause();

        AudioPlayer volumeControl = new VolumeControlDecorator(radioPlayer);
        volumeControl.play();
        volumeControl.pause();

        AudioPlayer advancedPlayer = new AdvancedAudioPlayer(onlinePlayer);
        advancedPlayer.play();
        advancedPlayer.stop();
    }
}