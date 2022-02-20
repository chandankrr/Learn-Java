package String;

public class PrintFirstIndexCharacter {
    public static void main(String[] args) {
        String str = "  Hello World";

        char ans = printChar(str);
        System.out.println(ans);
    }

    public static char printChar(String str) {
        // return str[0]; // we cannot do like this in java, it works fine in C++.
        return str.trim().charAt(0);
    }
}
