package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        // ascending
        // int[] arr = {-49, -23, -9, 0, 3, 10, 13, 21, 44, 89, 111, 143, 166, 173, 199};
        // descending
        int[] arr = {199, 173, 166, 143, 111, 89, 44, 21, 13, 10, 3, 0, -9, -23, -49};
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

        // find whether the array is sorted ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // find the middle element

            // sometimes it will give error, they may exceed max value of int, if value of start and end is
            // too large and after calculating mid, it is not able to store in int.
            // int mid = (start + end) / 2;

            int mid = start + (end - start) / 2; // this is give same result but optimise

            if (arr[mid] == target)
                return mid;

            if (isAsc) {
                if (target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else{
                if (target > arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
}
