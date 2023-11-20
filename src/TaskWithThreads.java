import java.util.Scanner;

public class TaskWithThreads {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            int count = 0;
            while (0 == 0) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                count += 50;
                System.out.println(count);
            }
        });

        thread.start();

        int countOfThreads = 256;
        int countOfNumbers = 2_000_000_000;
        int countOfNumbersInThread = countOfNumbers / countOfThreads;

        for (int j = 0; j < countOfThreads; j++) {
            final int temp = j;
            Thread threadFirst = new Thread(() -> {
                long start = System.currentTimeMillis();
                int count = 0;

                int firstNumber = temp * countOfNumbersInThread;
                int lastNumber = firstNumber + countOfNumbersInThread;

                for (int i = firstNumber; i < lastNumber; i++) {
                    if (i % 17 == 0) {
                        count++;
                    }
                }

                long finish = System.currentTimeMillis();

                System.out.println(count);
            });

            threadFirst.start();
        }

        int count = 0;

        Scanner scanner = new Scanner(System.in);

        scanner.nextInt();

    }
}
