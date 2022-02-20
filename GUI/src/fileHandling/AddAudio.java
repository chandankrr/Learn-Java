package fileHandling;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddAudio {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner input = new Scanner(System.in);

        File file = new File("D:\\Java\\GUI\\resources\\01audio.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String res = "";

        while (!res.equals("Q")) {
            System.out.println("P = play, S = stop, R = reset, Q = quit");
            System.out.print("Enter your choice: ");

            res = input.next();
            res = res.toUpperCase();

            switch (res) {
                case ("P"):
                    clip.start();
                    break;
                case ("S"):
                    clip.stop();
                    break;
                case ("R"):
                    clip.setMicrosecondPosition(0);
                    break;
                case ("Q"):
                    clip.close();
                    break;
                default:
                    System.out.println("Not a valid respond!");
            }
        }

    }
}
