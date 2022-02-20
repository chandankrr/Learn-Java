package LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Chandan Kumar";
        char target = 'K';

        boolean ans = search(name, target);

        if (ans)
            System.out.println("Found!");
        else
            System.out.println("Not Found!");
    }

    public static boolean search(String str, char target){
        if (str.length() == 0)
            return false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target)
                return true;
        }
        return false;
    }
}
