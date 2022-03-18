package multithread;

class MyRunnableThread1 implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Cooking");
        }
    }
}

class MyRunnableThread2 implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Reading");
        }
    }
}

public class MultithreadRunnableInterface {

    public static void main(String[] args) {
        MyRunnableThread1 bullet1 = new MyRunnableThread1();
        Thread gun1 = new Thread(bullet1);

        MyRunnableThread2 bullet2 = new MyRunnableThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}