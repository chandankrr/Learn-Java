// start() || stop()// sleep()  // wait() || notify(), notifyAll() 

class C extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Thread C: " + i);

        }
    }
}

class D extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread D: " + i);
        }
    }
}

public class Threading3 {
    public static void main(String[] args) {
        C obj1 = new C();
        D obj2 = new D();

        obj1.start();
        obj2.start();

    }
    
}
