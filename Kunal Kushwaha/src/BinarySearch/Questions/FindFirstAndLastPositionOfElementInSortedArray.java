// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

package BinarySearch.Questions;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;

        int[] ans = searchRange(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchRange(int[] numbs, int target) {
        int[] ans = {-1, -1};

        // check for first occurrence
        ans[0] = search(numbs, target, true);
        // check for last occurrence if a[0] is not equal to -1
        if (ans[0] != -1)
            ans[1] = search(numbs, target, false);

        return ans;
    }

    public static int search(int[] numbs, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = numbs.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (target < numbs[mid])
                end = mid - 1;
            else if (target > numbs[mid])
                start = mid + 1;
            else {
                // potential answer found
                ans = mid;
                if (findStartIndex)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return ans;
    }
}
