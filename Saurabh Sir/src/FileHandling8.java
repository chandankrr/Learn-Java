import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling8 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("./src/myFile3.txt"));

        char[] s = new char[20];

        bf.read(s, 5, 10); // s = char array, 5 = offset, 10 = length
        System.out.println(s);
        bf.close();
    }
}

