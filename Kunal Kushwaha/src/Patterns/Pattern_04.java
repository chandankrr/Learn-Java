// 1
// 12
// 123
// 1234
// 12345

package Patterns;

public class Pattern_04 {
    public static void main(String[] args) {
        int n = 5;

        pattern(n);
    }

    static void pattern(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
