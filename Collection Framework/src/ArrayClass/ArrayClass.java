package ArrayClass;

import java.util.Arrays;

public class ArrayClass {

    public static void main(String[] args) {
        int[] numbers = {21, 3, 43, 31, 55, 67, 5, 9, 12};
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        int index = Arrays.binarySearch(numbers, 5);
        System.out.println("The index of element 5 in the array numbers is " + index);

        Arrays.fill(numbers, 12);
        System.out.println(Arrays.toString(numbers));
    }
}
