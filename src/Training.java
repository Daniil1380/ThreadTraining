public class Training {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        });

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        Thread.sleep(5000);
        System.out.println("Привет, мир!");
    }
}
