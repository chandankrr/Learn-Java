package BinarySearch.Questions;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170, 200, 230, 270, 310, 340, 390, 405, 455,
                473, 499, 505, 600};
        int target = 95;

        // so, here we're not using length that's means it is an infinite length array
        System.out.println(ans(arr, target)); // it will print index where the element is located
    }

    public static int ans(int[] arr, int target) {
        // first find range
        // first start with a box of size 2 ie 0,1 means taking array of only 2 length
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) { // no need to check is it greater than start, its obvious if it is
            // greater than end it also greater than start
            int newStart = end + 1; // this is my new start
            // double the box value
            // end = previous end + 2 * (size of box)
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else
                // answer found
                return mid;
        }
        // answer not found
        return -1;
    }
}
