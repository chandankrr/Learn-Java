import java.io.IOException;

public class ExceptionHandling5 {
    public static void main(String[] args) throws IOException  {
        try {
            throw new IOException("Input Output Exception");
            // System.out.println("After Exception");
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

