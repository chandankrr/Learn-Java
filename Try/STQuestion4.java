import java.util.Scanner;

public class STQuestion4 {
    static double areaCircle(double r) {
        return Math.PI * r * r;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        System.out.print("Enter radius of circle: ");
        radius = input.nextInt();
        System.out.println("Area of circle = " + areaCircle(radius));

        input.close();

    }
    
}
