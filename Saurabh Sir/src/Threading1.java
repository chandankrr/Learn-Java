// threading implemention using runnable interface

class X implements Runnable{
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread X: " + i);
        }
    }
}
class Y implements Runnable{
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread Y: " + i);
        }
    }
}

public class Threading1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new X());
        Thread t2 = new Thread(new Y());

        t1.start();
        t2.start();
    }
    
}
