package W3_3b;

public class VolumeControlDecorator implements AudioPlayer {
    private AudioPlayer decoratedPlayer;

    public VolumeControlDecorator(AudioPlayer decoratedPlayer) {
        this.decoratedPlayer = decoratedPlayer;
    }

    @Override
    public void play() {
        decoratedPlayer.play();
        System.out.println("Volume control is on");
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