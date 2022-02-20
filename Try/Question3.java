class Mobile {
    private String company;

    public Mobile(String str) {
        company = str;
    }

    public String getProperties() {
        return company;
    }

}


public class Question3 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Apple");
        System.out.println("Comapany = " + m1.getProperties());
    }
    
}
