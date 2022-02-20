abstract class Vehicle {
    abstract void printVehicleType();

    abstract void blowHorn();

    abstract void wheelsCount();

}

class Car extends Vehicle {
    @Override
    void printVehicleType() {
        System.out.println("Vehicle type: Non-Commerical");
    }

    @Override
    void blowHorn() {
        System.out.println("Blowing horn: pe pep pep pe");
    }

    @Override
    void wheelsCount() {
        System.out.println("Wheels count: 4");
    }

}

public class AbstactEx {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.printVehicleType();
        c1.blowHorn();
        c1.wheelsCount();
        
    }
    
}
