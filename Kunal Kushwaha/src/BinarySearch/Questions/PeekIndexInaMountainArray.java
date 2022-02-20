package BinarySearch.Questions;

public class PeekIndexInaMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,2,5,3,1,0};

        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {// why not start <= end, because if start = end, we get the index of the
            // largest number
            int mid = start + ((end - start) / 2);
            if (arr[mid] > arr[mid + 1]) { // you are in descending part of array, this may be the answer,
                // but look at left, this is why end != mid - 1
                end = mid;
            }
            else {
                // you are in ascending part of array
                start = mid + 1; // bcz we know that mid + 1 element > mid element
            }
        }
        // int the end, start == end and pointing to the largest number bcz of the two check above
        // start and end are always trying to find max element in the above two checks
        // hence, when they are pointing to just one element, that is the max one bcz that is what the
        // checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer
        // till that time and if we are saying that only one item it is remaining, hence bz of above line
        // that is the best possible answer

        return start; // we can return end as well bcz both are same
    }
}
