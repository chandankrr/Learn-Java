package BinarySearch.Questions;

public class CeilOfaNumber {
    public static void main(String[] args) {
        int[] arr = {2, 5, 11, 13, 17, 23, 25, 29, 31, 33, 37, 40};
        int target = 35;

        int ans = ceilOfNumber(arr, target);

        if(ans != -1)
            System.out.println("Ceil value of  " + target + " : " + arr[ans]);
        else
            System.out.println("No value");
    }

    // return index of the greatest number >= target
    static int ceilOfNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[arr.length-1])
            return -1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }
        return start;
    }
}
