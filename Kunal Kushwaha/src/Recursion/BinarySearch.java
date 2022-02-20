package Recursion;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {23, 55, 67, 85, 93, 101, 130, 145, 160};
        int target = 101;

        int ans = search(arr, target, 0, arr.length - 1);
        System.out.println(ans);
    }

    static int search(int[] arr, int target, int start, int end){
        if(arr.length == 0 || start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }

        if(target < arr[mid]){
            return search(arr, target, start, mid - 1);
        }
        else{
            return search(arr, target, mid + 1, end);
        }
    }
}
