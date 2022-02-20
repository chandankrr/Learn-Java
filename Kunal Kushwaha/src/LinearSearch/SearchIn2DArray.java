package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {43, 32, 5, 6},
                {7, 87, 97, 43, 2, 45, 45},
                {21, 4, 75}
        };
        int target = 4;

        int[] ans = search(arr, target);
        System.out.println("Index: " + Arrays.toString(ans));
    }

    public static int[] search(int[][] arr, int target) {
        if (arr.length == 0)
            return new int[]{-1, -1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }
}
