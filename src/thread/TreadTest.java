package thread;

public class TreadTest{
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 30) {
                Thread myThread1 = new MyTread();
                Thread myThread2 = new MyTread();
                myThread1.start();
                myThread2.start();
            }
        }
    }
}

class MyTread extends Thread {
    private int i = 0;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}


