package String;

import java.util.Stack;

public class ReverseString_04 {

    public static void main(String[] args) {
        ReverseString_04 obj = new ReverseString_04();

        String str1 = "coding";
        String str2 = "programming";
        String str3 = "computer";
        String str4 = "system";
        String str5 = "network";

        // func1
        System.out.println(obj.func1(str1));

        // builtin function of string builder class
        StringBuilder sb = new StringBuilder(str2);
        sb.reverse();
        System.out.println(sb);

        // func2
        System.out.println(obj.func2(str3));

        // func3
        System.out.println(obj.func3(str4));

        // func4
        obj.func4(str5);
    }

    public String func1(String str){
        // iterative approach
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            s = str.charAt(i) + s;
        }
        return s;
    }

    public String func2(String str){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            sb.insert(0, str.charAt(i));
        }
        return sb.toString();
    }

    public String func3(String str){ // recommended
        // swap approach
        int start = 0;
        int end = str.length() - 1;

        char[] ch = str.toCharArray();
        while (start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;
        }
        return String.copyValueOf(ch);
    }

    public void func4(String str){
        // using stack
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            st.push(str.charAt(i));
        }

        while(!st.isEmpty()){
            System.out.print(st.pop());
        }
    }
}
