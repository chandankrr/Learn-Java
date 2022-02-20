package Array;

public class BinarySearch_04 {

    public static void main(String[] args) {
        // recursive binary search
        int[] a = {12, 34, 45, 65, 83};

        int target = 45;
        int start = 0, end = a.length - 1;
        BinarySearch_04 obj = new BinarySearch_04();
        int index = obj.searchIndex(a, target, start, end);

        System.out.println(target + " found at index: " + index);
    }

    int searchIndex(int[] a, int target, int start, int end) {
        if (a.length == 0 || start > end) {
            return -1;
        }

        int mid = (start + (end - start) / 2);
        if (a[mid] == target) {
            return mid;
        }

        if (target > mid) {
            return searchIndex(a, target, mid + 1, end);
        } else {
            return searchIndex(a, target, start, mid - 1);
        }
    }
}
