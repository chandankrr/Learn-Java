package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_Example {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("D:\\Java\\GUI\\resources\\poem.txt");
            writer.write("Rose are red \nViolets are blue \nBooty booty booty \nRock in everywhere!");
            writer.append("\n(A poem by Chandan Kumar)");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
