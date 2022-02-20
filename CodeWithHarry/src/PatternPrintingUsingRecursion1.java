public class PatternPrintingUsingRecursion1 {
    static void patternRec(int n) {
        if (n > 0) {
            patternRec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patternRec(5);
    }

}
