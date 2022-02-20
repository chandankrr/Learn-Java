package Array;

public class LargestContiguousSubArraySum_06 {

    public static void main(String[] args) {
        int[] arr = {-3, -4, 4, -1, -2, 1, 5, -3};

        LargestContiguousSubArraySum_06 obj = new LargestContiguousSubArraySum_06();
        int ans = obj.solve(arr);

        System.out.println(ans);
    }

    int solve(int[] arr) {
        int current_max, max_so_far;
        current_max = max_so_far = arr[0];

        for (int i = 0; i < arr.length; i++) {
            current_max = Math.max(arr[i], current_max + arr[i]);
            max_so_far = Math.max(current_max, max_so_far);
        }
        return max_so_far;
    }
}
