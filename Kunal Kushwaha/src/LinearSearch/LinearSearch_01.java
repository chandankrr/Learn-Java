package LinearSearch;

public class LinearSearch_01 {
    public static void main(String[] args) {
        int[] arr = {1, 43, 23, 5, 76, 87, 67, 90};
        int target = 87;

        int ans = linearSearch(arr, target);

        if (ans != -1)
            System.out.println("Element found at index: " + ans);
        else
            System.out.println("Element not found!");
    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1
    public static int linearSearch(int[] arr, int target) {
        if (arr.length == 0)
            return -1;

        // run a loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target)
                return index;
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}
