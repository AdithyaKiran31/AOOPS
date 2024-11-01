package W3_3a;

public class VolumeControlDecorator implements AudioPlayer {
    private AudioPlayer audioPlayer;
    private int volumeLevel;

    public VolumeControlDecorator(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void play() {
        audioPlayer.play();
        System.out.println("Volume control is on");
    }

    @Override
    public void stop() {
        audioPlayer.stop();
    }

    @Override
    public void nextTrack() {
        audioPlayer.nextTrack();
    }

    @Override
    public void previousTrack() {
        audioPlayer.previousTrack();
    }

    public void setVolume(int level) {
        this.volumeLevel = level;
        System.out.println("Volume set to: " + volumeLevel);
    }
}
