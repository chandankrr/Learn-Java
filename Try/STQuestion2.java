class Vehicle1 {
    void printWheels() {
        System.out.println("Number of wheels in motor bike = " + 2);
    }

    void printWheels(int x) {
        System.out.println("Number of wheels in truck = " + x);
    }

    void printWheels(int x, int y) {
        System.out.println("Number of wheels in train = " + (x * y));
    }
}

class Car1 extends Vehicle1 {
    @Override
    void printWheels() {
        System.out.println("Number of wheels of car = " + 4);
    }
}

public class STQuestion2 {
    public static void main(String[] args) {
        Vehicle1 v1 = new Vehicle1();
        v1.printWheels();
        v1.printWheels(10);
        v1.printWheels(16, 12);

        System.out.println();
        Car1 c1 = new Car1();
        c1.printWheels();

    }
}
