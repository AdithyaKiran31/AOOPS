package W3_3b;

public class OnlineAudioPlayer implements AudioPlayer {
    private String streamUrl;

    public OnlineAudioPlayer(String streamUrl) {
        this.streamUrl = streamUrl;
    }

    @Override
    public void play() {
        System.out.println("Playing online stream: " + streamUrl);
    }

    @Override
    public void pause() {
        System.out.println("Pausing online stream: " + streamUrl);
    }

    @Override
    public void stop() {
        System.out.println("Stopping online stream: " + streamUrl);
    }
}