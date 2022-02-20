import java.io.BufferedReader;
import java.io.*;

public class FileHandling5 {
    public static void main(String[] args) throws IOException{
        int ch;
        FileReader fr = new FileReader("./src/myFile2.txt");
        BufferedReader br = new BufferedReader(fr);

        while ((ch = br.read()) != -1) {
            System.out.print((char) ch);
        }
        
        br.close();
    }
    
}
