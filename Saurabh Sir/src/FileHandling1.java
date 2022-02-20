import java.io.File;
import java.io.IOException;

public class FileHandling1 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:/Java/Saurabh Sir/01/src/name1.txt");
        f1.createNewFile();
        System.out.println("Can file read: " + f1.canWrite());
        System.out.println("Is file exist: " + f1.exists());
        System.out.println("File name: " + f1.getName());
        System.out.println("Length of file: " + f1.length());

        f1.delete();

        System.out.println("\n\nCan file read: " + f1.canWrite());
        System.out.println("Is file exist: " + f1.exists());
        System.out.println("File name: " + f1.getName());
        System.out.println("Length of file: " + f1.length());
    }
}