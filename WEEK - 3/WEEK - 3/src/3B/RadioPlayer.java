package W3_3b;

public class RadioPlayer implements AudioPlayer {
    private String stationName;

    public RadioPlayer(String stationName) {
        this.stationName = stationName;
    }

    @Override
    public void play() {
        System.out.println("Playing radio: " + stationName);
    }

    @Override
    public void pause() {
        System.out.println("Pausing radio: " + stationName);
    }

    @Override
    public void stop() {
        System.out.println("Stopping radio: " + stationName);
    }
}