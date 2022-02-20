public class STQuestion1 {
    public static void main(String[] args) {
        System.out.println(temp.multiple(10, 20));
    }
}

class temp {
    public static int multiple(int x, int y) {
        if (x == 0 || y == 0) {
            return 3;
        } else if (x % y == 0) {
            return 2;
        } else {
            return 1;
        }
    }
}
