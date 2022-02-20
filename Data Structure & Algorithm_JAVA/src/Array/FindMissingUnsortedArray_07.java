package Array;

public class FindMissingUnsortedArray_07 {

    public static void main(String[] args) {
        // find the missing element form 1 to n from unsorted array
        int[] arr = {2, 4, 1, 3, 6, 7, 8};

        FindMissingUnsortedArray_07 obj = new FindMissingUnsortedArray_07();
        int ans = obj.findMissingUnsortedArray(arr);

        System.out.println("Missing element in sorted array: " + ans);
    }

    int findMissingUnsortedArray(int[] arr){
        int n = arr.length + 1; // because one element is missing, we are considering it as well
        int sum = (n * (n + 1)) / 2;

        for (int i = 0; i < arr.length ; i++) {
            sum = sum - arr[i];
        }
        return sum;
    }
}
