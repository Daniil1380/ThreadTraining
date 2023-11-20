public class ThreadMainExample {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> System.out.println(123)); //1

        Runnable runnable = () -> System.out.println(123); //2
        Thread thread = new Thread(runnable);
        thread.start();

        Task task = new Task();

        Thread thread2 = new Thread(task); //3

        MyThread myThread = new MyThread(); //4

        myThread.start();
    }
}
