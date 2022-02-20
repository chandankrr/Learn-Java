package Array;

public class SearchingAnElement_03 {

    public static void main(String[] args) {
        int[] a = {12, 32, 45, 6, 13};

        int target = 32;
        SearchingAnElement_03 obj = new SearchingAnElement_03();
        int index = obj.searchIndex(a, target);

        System.out.println(target + " found at index: " + index);
    }

    int searchIndex(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
