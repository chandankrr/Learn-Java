public class PatternPrintingUsingRecursion2 {
    static void patternRec(int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
            patternRec(n - 1);
        }
    }

    public static void main(String[] args) {
        patternRec(5);
    }

}
