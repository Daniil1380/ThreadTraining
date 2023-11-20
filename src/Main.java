public class Main {
    public static void main(String[] args) {

        //есть 10 миллионов чисел, найти все, которые делятся на 17
        //0..1...2...3...10_000_000
        int count = 0;

        long start = System.currentTimeMillis();

        for (int i = 0; i < 20_000_000; i++) {
            if (i % 17 == 0) {
                count++;
            }
        }

        long finish = System.currentTimeMillis();

        System.out.println(finish - start + "ms."); //1194ms.
        System.out.println(count);
        //8664ms.




        //1439ms.

        //1400ms - 1 поток
        //800ms - 2 потока (600ms)
        //500ms - 4 потока (350 ms)
        //500ms - 8 потока (450 ms)
        //313ms - 16 потоков (400 ms)
        // 32 поток - (200 ms)
        // 64 поток -
        //128 - (200 ms)
        //256 - (150ms)

        //27ms. - 100 потоков






    }
}