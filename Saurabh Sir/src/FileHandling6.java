import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling6 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new FileReader("./src/myFile3.txt"));

        String s1;
        s1 = bf.readLine();

        System.out.println(s1);
        bf.close();
    }
    
}
