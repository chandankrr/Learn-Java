// *
// **
// ***
// ****
// *****

package Patterns;

public class Pattern_02 {
    public static void main(String[] args) {
        int n = 5;

        pattern(n);
    }

    static void pattern(int n){
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            // when one row is printed, we need add a newline
            System.out.println();
        }
    }
}