public class Main {
    public static void main(String[] args) {
       MyThread myThread = new MyThread();
       myThread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.print("B");
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("A");
        }
    }
}