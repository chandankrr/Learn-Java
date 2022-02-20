class P extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread P: " + i);
        }
    }
}
class Q extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread Q: " + i);
        }
    }
}

public class Threading2 {
    public static void main(String[] args) {
        P obj1 = new P();
        Q obj2 = new Q();

        obj1.start();
        obj2.start();

       
    }
}
