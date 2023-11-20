public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("123");
    }

    public static synchronized void hello() {
        synchronized (MyThread.class) {

        }
    }
}
