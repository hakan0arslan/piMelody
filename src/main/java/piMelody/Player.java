package piMelody;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.FileInputStream;
import java.io.InputStream;

import static java.io.File.separator;


public class Player{
    //stream note sound and play it with 314 ms delay
    public void playSound(String note) {
        try {
            final String dir = System.getProperty("user.dir");
            InputStream inputStream = new FileInputStream(dir + separator + note);
            AudioStream audioStream = new AudioStream(inputStream);
            AudioPlayer.player.start(audioStream);
            AudioPlayer.sleep(314);
            audioStream.close();
            inputStream.close();
        } catch (Exception e) {
            System.out.println("No");
        }
    }
}
