package Array;

public class BubbleSort_05 {

    public static void main(String[] args) {
        int[] a = {12, 5, 3, -1};

        BubbleSort_05 obj = new BubbleSort_05();
        obj.print(a);

        obj.bubbleSort(a);
        obj.print(a);
    }

    void bubbleSort(int[] a) {
        if (a.length <= 1) {
            return;
        }

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    void print(int[] a) {
        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
