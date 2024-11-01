package W3_3b;

public class AdvancedAudioPlayer implements AudioPlayer {
    private AudioPlayer decoratedPlayer;

    public AdvancedAudioPlayer(AudioPlayer decoratedPlayer) {
        this.decoratedPlayer = decoratedPlayer;
    }

    @Override
    public void play() {
        decoratedPlayer.play();
        System.out.println("Advanced audio player mode is on");
    }

    @Override
    public void pause() {
        decoratedPlayer.pause();
    }

    @Override
    public void stop() {
        decoratedPlayer.stop();
    }
}
