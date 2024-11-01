package W3_3b;

public class EqualizerDecorator implements AudioPlayer {
    private AudioPlayer decoratedPlayer;

    public EqualizerDecorator(AudioPlayer decoratedPlayer) {
        this.decoratedPlayer = decoratedPlayer;
    }

    @Override
    public void play() {
        decoratedPlayer.play();
        System.out.println("Equalizer is on");
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