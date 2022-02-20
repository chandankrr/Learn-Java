abstract class GeneralBank {

    public abstract double getSavingInterestRate();

    public abstract double getFixedInterestRate();
}

class ICICIBank extends GeneralBank {

    @Override
    public double getSavingInterestRate() {
        return 4.0;
    }

    @Override
    public double getFixedInterestRate() {
        return 8.5;
    }

}

class KotMBank extends GeneralBank {

	@Override
	public double getSavingInterestRate() {
		return 6.0;
	}

	@Override
	public double getFixedInterestRate() {
		return 9.0;
	}

}

public class Main1 {
    public static void main(String[] args) {
        ICICIBank b1 = new ICICIBank();
        KotMBank b2 = new KotMBank();

        System.out.println("\n\t ---- ICICI Bank ----");
        System.out.println("Saving Intrest rate of ICICI Bank = " + b1.getSavingInterestRate());
        System.out.println("Fixed Intrest rate of ICICI Bank = " + b1.getFixedInterestRate());

        
        System.out.println("\n\t ---- KotM Bank ----");
        System.out.println("Saving Intrest rate of KotM Bank = " + b2.getSavingInterestRate());
        System.out.println("Fixed Intrest rate of KotM Bank = " + b2.getFixedInterestRate());
    }
		
}
