interface AudioPlayer { void playAudio(String song); }
interface VideoPlayer { void playVideo(String movie); }

class MediaPlayer implements AudioPlayer, VideoPlayer {
    public void playAudio(String song) { System.out.println("Playing Audio: " + song); }
    public void playVideo(String movie) { System.out.println("Playing Video: " + movie); }
}

public class MediaPlayer {
    public static void main(String[] args) {
        MediaPlayer m = new MediaPlayer();
        m.playAudio("Shape of You");
        m.playVideo("Inception");
    }
}
