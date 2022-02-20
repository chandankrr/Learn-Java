package String;

import java.util.Stack;

public class ReverseIndividualString_05 {

    public static void main(String[] args) {
        ReverseIndividualString_05 obj = new ReverseIndividualString_05();

        String str = "Hello, My name is John";

        System.out.println(obj.func1(str));

        System.out.println(obj.func2(str));

        obj.func3(str);
    }

    public String func1(String str) {
        // using normal string

        String finalStr = "";
        String tempStr = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == ' ') {
                finalStr = finalStr + tempStr + " ";
                tempStr = "";
            } else {
                tempStr = c + tempStr;
            }
        }
        finalStr = finalStr + tempStr;

        return finalStr;
    }

    public String func2(String str) {
        // using StringBuilder

        StringBuilder finalStr = new StringBuilder();
        StringBuilder tempStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == ' ') {
                finalStr.append(tempStr).append(" ");
                tempStr.setLength(0);
            } else {
                tempStr.insert(0, c);
            }
        }
        finalStr.append(tempStr);

        return finalStr.toString();
    }

    public void func3(String str){
        // using stack

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == ' '){
                while(!st.isEmpty()){
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }else{
                st.push(c);
            }
        }

        while(!st.isEmpty()){
            System.out.print(st.pop());
        }
    }
}
