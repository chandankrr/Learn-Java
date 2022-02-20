import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("./src/myFile3.txt"));

        String s1;

        while ((s1 = bf.readLine()) != null) {
            System.out.println(s1);
        }
        bf.close();
    }
}
