import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("./src/myFile.txt", true);
        String s = "Hello Chandan Kumar";

        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            fout.write(ch[i]);
        }
        fout.close();
    }
    
}
