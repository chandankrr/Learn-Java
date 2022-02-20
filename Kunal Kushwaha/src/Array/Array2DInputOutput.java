package Array;

import java.util.Scanner;

public class Array2DInputOutput {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        Scanner input = new Scanner(System.in);

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }

        // 1 way
        // for (int row = 0; row < arr.length; row++) {
        //     for (int col = 0; col < arr[row].length; col++) {
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // 2 way
        // for (int row = 0; row < arr.length; row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        // 3 way
        // for (int[] a : arr) {
        //     System.out.println(Arrays.toString(a));
        // }

        // 4 way
        // for (int[] a : arr) {
        //     for (int col = 0; col < a.length; col++) {
        //         System.out.print(a[col] + " ");
        //     }
        //     System.out.println();
        // }

        // 5 way
        for (int[] a : arr) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
