package Array;

public class DeleteElementFromArray_02 {

    static int count = 5;

    public static void main(String[] args) {
        int[] a = {12, 34, 45, 6, 13};

        DeleteElementFromArray_02 obj = new DeleteElementFromArray_02();
        obj.print(a);
        obj.deleteFromEnd(a);
        obj.print(a);

        obj.deleteValue(a, 34);
        obj.print(a);

        obj.deleteFromLocation(a, 3);
        obj.print(a);

        obj.deleteFromPosition(a, 1);
        obj.print(a);
    }

    // method to delete last element from array
    void deleteFromEnd(int[] a) {
        if (a.length == 0) {
            return;
        }
        count--;
    }

    // method to delete given value from array
    void deleteValue(int[] a, int value) {
        int i;
        for (i = 0; i < count; i++) {
            if (a[i] == value) {
                break;
            }
        }
        if (i == count) {
            System.out.println("Value doesn't exists in array");
            return;
        }

        for (int j = i; j < count - 1; j++) {
            a[j] = a[j + 1];
        }
        count--;
    }

    // method to delete element of given location in array -- start from 1 not from zero
    void deleteFromLocation(int[] a, int location) {
        if (location > count || location <= 0) {
            return;
        }

        for (int i = location - 1; i < count - 1; i++) {
            a[i] = a[i + 1];
        }
        count--;
    }

    // method to delete element of given position in array -- means by index
    void deleteFromPosition(int[] a, int position){
        if(position > count || position < 0){
            return;
        }
        for(int i = position; i < count - 1; i++){
            a[i] = a[i+1];
        }
        count--;
    }

    // method to print elements of array
    void print(int[] a) {
        for (int i = 0; i < count; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
