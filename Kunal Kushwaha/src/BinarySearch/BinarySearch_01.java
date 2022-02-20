package BinarySearch;

public class BinarySearch_01 {
    public static void main(String[] args) {
        int[] arr = {-49, -23, -9, 0, 3, 10, 13, 21, 44, 89, 111, 143, 166, 173, 199};
        int target = 10;

        int ans = binarySearch(arr, target);

        if (ans != -1)
            System.out.println("Element found at index: " + ans);
        else
            System.out.println("Element not found!");

    }

    // return the index
    // return -1 if it does not exit
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element

            // sometimes it will give error, they may exceed max value of int, if value of start and end is
            // too large and after calculating mid, it is not able to store in int.
            // int mid = (start + end) / 2;

            int mid = start + (end - start) / 2; // this is give same result but optimise

            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else
                // answer found
                return mid;
        }
        return -1;
    }
}
