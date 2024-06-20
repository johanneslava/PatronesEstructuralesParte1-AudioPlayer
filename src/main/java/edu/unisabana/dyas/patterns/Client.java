package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayer;
import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayerAdapter;
import edu.unisabana.dyas.patterns.utils.AudioPlayer;

// Cliente que utiliza el adaptador
public class Client {
    public static void main(String[] args) {
        AdvancedAudioPlayer advancedPlayer = new AdvancedAudioPlayer();
        AudioPlayer player = new AdvancedAudioPlayerAdapter(advancedPlayer);

        player.play("mp4", "video.mp4");
        player.play("vlc", "movie.vlc");
        player.play("mp3", "audio.mp3");
        player.stop();
    }
}
