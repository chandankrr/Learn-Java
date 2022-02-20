import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling4 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("./src/myFile2.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Hello everyone, my name is chandan kumar. i come from patna, bihar");

        bw.close();
    }

}
