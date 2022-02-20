package String;

public class PrintFirstCharacterOfWord_01 {
    public static void main(String[] args) {
        String str = "Hello User!! Welcome";

        char[] a = str.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (a[i] != ' ' && (i == 0 || a[i - 1] == ' '))
                System.out.println(a[i]);
        }
    }
}
