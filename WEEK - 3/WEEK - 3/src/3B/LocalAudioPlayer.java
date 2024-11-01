package W3_3b;

public class LocalAudioPlayer implements AudioPlayer {
    private String fileName;

    public LocalAudioPlayer(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        System.out.println("Playing local file: " + fileName);
    }

    @Override
    public void pause() {
        System.out.println("Pausing local file: " + fileName);
    }

    @Override
    public void stop() {
        System.out.println("Stopping local file: " + fileName);
    }
}