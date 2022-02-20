import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Question3_1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("D:\\Java\\Try\\Input.txt", false);
        String s = "Hello, My name Lekhraj ";

        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            fout.write(ch[i]);
        }

        System.out.println("String, successfully written in Input.txt, kindly check the file");
        System.out.println("content of Input.txt is .....\n");
        fout.close();

        int i;
        FileInputStream fin = new FileInputStream("D:\\Java\\Try\\Output.txt");

        do{
            i = fin.read();
            if(i != -1)
                System.out.print((char)i);
        } while (i != -1);

        fin.close();
    }
    
}
