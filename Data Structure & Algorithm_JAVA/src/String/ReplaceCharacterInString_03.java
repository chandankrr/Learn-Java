package String;

public class ReplaceCharacterInString_03 {
    public static void main(String[] args) {
        String str = "Hello World!! Welcome to coding simplified";

        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'o' || ch[i] == 'O')
                ch[i] = 'y';
        }
        System.out.println(ch);
    }
}
