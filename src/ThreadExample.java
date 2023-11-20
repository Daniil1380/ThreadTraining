public class ThreadExample {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
            }
        });

        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
            }
        });

        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        thread.interrupt();
        Thread.sleep(1);
        System.out.println(thread.getState());


        thread1.start();

        Thread.sleep(1000);

        System.out.println(thread1.getState());

        Thread.sleep(1000);

        thread.interrupt();
        thread1.interrupt();
    }
}
