package String;

public class ReversePositionOfWords_06 {

    public static void main(String[] args) {
        ReversePositionOfWords_06 obj = new ReversePositionOfWords_06();

        String str = "Hello, I am a Robot, How can I help you";

        System.out.println(obj.func1(str));

        System.out.println(obj.func2(str));

        System.out.println(obj.func3(str));
    }

    public String func1(String str){
        // using normal string

        String finalStr = "";
        String tempStr = "";

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == ' '){
                finalStr = " " + tempStr + finalStr;
                tempStr = "";
            } else{
                tempStr = tempStr + ch;
            }
        }
        finalStr = tempStr + finalStr;

        return finalStr;
    }

    public String func2(String str){
        // using string builder

        StringBuilder finalStr = new StringBuilder();
        StringBuilder tempStr = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == ' '){
                finalStr.insert(0, " " + tempStr);
                tempStr.setLength(0);
            } else{
                tempStr.append(ch);
            }
        }
        finalStr.insert(0, tempStr);

        return finalStr.toString();
    }

    public String func3(String str){
        // approach: first reverse the whole string then reverse each words of reverse string

        // reverse the whole string
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        // reversing each word of reverse word
        StringBuilder finalStr = new StringBuilder();
        StringBuilder tempStr = new StringBuilder();

        for(int i = 0; i < sb.length(); i++){
            char ch = sb.charAt(i);

            if(ch == ' '){
                finalStr.append(tempStr).append(" ");
                tempStr.setLength(0);
            } else{
                tempStr.insert(0, ch);
            }
        }
        finalStr.append(tempStr);

        return finalStr.toString();
    }
}
