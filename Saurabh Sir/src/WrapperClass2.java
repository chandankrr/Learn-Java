public class WrapperClass2 {
    public static void main(String[] args) {
        // unboxing

        Integer a = Integer.valueOf(3);
        int i = a.intValue();
        int j = a;

        System.out.println(a + " " + i + " " + j);
    }
}
