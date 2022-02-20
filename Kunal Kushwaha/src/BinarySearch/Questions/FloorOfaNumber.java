package BinarySearch.Questions;

public class FloorOfaNumber {
    public static void main(String[] args) {
        int[] arr = {23, 31, 34, 44, 51, 59, 66, 73, 77, 80};
        int target = 55;

        int ans = floorOfNumber(arr, target);

        if(ans != -1)
            System.out.println("Floor value of " + target + " : " + arr[ans]);
        else
            System.out.println("No value");
    }

    // return index of lowest number <= target
    static int floorOfNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if(target < arr[0])
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
        return end;
    }
}
