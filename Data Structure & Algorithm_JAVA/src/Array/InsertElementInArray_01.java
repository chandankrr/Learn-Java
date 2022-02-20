package Array;

public class InsertElementInArray_01 {

    static int count = 0;

    public static void main(String[] args) {
        InsertElementInArray_01 obj = new InsertElementInArray_01();

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            obj.insert(arr, i + 1);
        }
        obj.print(arr);

        obj.insertAtStart(arr, 45);
        obj.print(arr);

        obj.insertAtPosition(arr,3, 200);
        obj.print(arr);
    }

    // method to insert element when array is empty or less than size of array
    public void insert(int[] a, int val) {
        a[count] = val;
        count++;
    }

    // method to insert element at start of an array
    public void insertAtStart(int[] arr, int val) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = val;
    }

    // method to insert element at specific position in an array
    public void insertAtPosition(int[] arr, int pos, int val) {
        for (int i = arr.length - 1; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = val;
    }

    // method to display all element of array
    public void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
