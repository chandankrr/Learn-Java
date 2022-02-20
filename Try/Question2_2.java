interface Printable {
    void print();
}

interface Showable {
    void show();
}

public class Question2_2 implements Printable, Showable {

    public void print() {
        System.out.print("Hi, ");
    }

    public void show() {
        System.out.println("Chandan");
    }
    public static void main(String[] args) {
        Question2_2 obj = new Question2_2();
        obj.print();
        obj.show();
   } 
    
}
