package String;

public class StringBuilderExample {
    public static void main(String[] args) {
        // 1 way -- not recommended, bcz every time when we add, new object will be created
        String s = "";

        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            s = s + c;
        }

        System.out.println(s);

        // --------------------------------------------------------
        // 2 way -- recommended, bcz every time when we add no new object created
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            str.append(ch);
        }

        System.out.println(str);
    }
}
