public class WrapperClass {
    public static void main(String[] args) {
        
        Integer i1 = Integer.valueOf("123");
        Double d1 = Double.valueOf("145.23");

        int a = Integer.parseInt("123");
        double b = Double.parseDouble("5.23");

        int c = i1.intValue();

        System.out.println(i1);
        System.out.println(d1);

        System.out.println(a);
        System.out.println(b);
        
        System.out.println(c);
    }
}
