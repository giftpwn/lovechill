import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SoundPlayer {

    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        // Load sound file
        File file = new File("sound.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        
        // Play sound
        clip.start();
        
        // Wait for sound to finish playing
        while (!clip.isRunning()) {
            Thread.sleep(10);
        }
        while (clip.isRunning()) {
            Thread.sleep(10);
        }
        
        // Reply with sound file
        System.out.println("Playing sound again:");
        clip.setFramePosition(0);
        clip.start();
    }

    @Override
    public String toString() {
        return "SoundPlayer []";
    }
}
