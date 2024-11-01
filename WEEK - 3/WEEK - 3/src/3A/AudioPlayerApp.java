package W3_3a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AudioPlayerApp {
    public static void main(String[] args) {
        AudioPlayer audioPlayer;
        Scanner scanner = new Scanner(System.in);
        List<String> playlist = new ArrayList<>();
        
        playlist.add("The Nights");
        playlist.add("Moral Of the Story");

        System.out.println("Enter the audio player type (local or online):");
        String audioPlayerType = scanner.nextLine();

        AudioPlayerFactory factory;
        if (audioPlayerType.equalsIgnoreCase("local")) {
            factory = new LocalAudioPlayerFactory();
        } else {
            factory = new OnlineAudioPlayerFactory();
        }

        audioPlayer = factory.createAudioPlayer(playlist);

        String command = "";
        while (!command.equalsIgnoreCase("exit")) {
            System.out.println("\nCommands: ");
            System.out.println("play - Play the current track");
            System.out.println("stop - Stop the current track");
            System.out.println("next - Play the next track");
            System.out.println("prev - Play the previous track");
            System.out.println("volume - Adjust the volume");
            System.out.println("exit - Exit the application");

            System.out.print("Enter a command: ");
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("play")) {
                audioPlayer.play();
            } else if (command.equalsIgnoreCase("stop")) {
                audioPlayer.stop();
            } else if (command.equalsIgnoreCase("next")) {
                audioPlayer.nextTrack();
            } else if (command.equalsIgnoreCase("prev")) {
                audioPlayer.previousTrack();
            } else if (command.equalsIgnoreCase("volume")) {
                System.out.print("Enter the volume level (1-10): ");
                int volumeLevel = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over
                VolumeControlDecorator volumeControlDecorator = new VolumeControlDecorator(audioPlayer);
                volumeControlDecorator.setVolume(volumeLevel);
                audioPlayer = volumeControlDecorator;
            }
        }

        scanner.close();
    }
}