package fileHandling;

import java.io.File;

public class FileClass {
    public static void main(String[] args) {
        File file = new File("D:\\Java\\GUI\\resources\\secret_message.txt");

        if (file.exists()) {
            System.out.println("That file exits! :O!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            // file.delete();
        } else {
            System.out.println("That file doesn't exit! :(");
        }
    }
}
