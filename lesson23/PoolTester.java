package telran.homework.lesson23;

import java.util.concurrent.ForkJoinPool;

/*
 Создайте класс PoolTester и
a. в main создайте ForkJoinPool и
b. запустите на нем 5 Runnable каждая из которых
c. ждет рандомное время от 0 до 500 и распечатывает это время на экране
d. дождитесь в main остановки ForkJoinPool
 */
public class  PoolTester {
    public static void main(String[] args) throws InterruptedException {
// Создаем экземпляр ForkJoinPool
        ForkJoinPool pool = new ForkJoinPool();

        // Запускаем 5 задач Runnable в ForkJoinPool
        for (int i = 0; i < 5; i++) {
            pool.execute(new RandomSleepTask());
        }

        // Останавливаем работу ForkJoinPool и дожидаемся завершения всех задач
        pool.shutdown();
        while (!pool.isTerminated()) {
            // Ждем завершения всех задач
            Thread.sleep(500);
        }

        System.out.println("All tasks completed successfully.");
    }

    // Внутренний класс для реализации Runnable, который спит случайное время и печатает его
    static class RandomSleepTask implements Runnable {
        @Override
        public void run() {
            int sleepTime = (int) (Math.random() * 501); // Случайное время от 0 до 500 мс
            try {
                Thread.sleep(sleepTime); // Поток спит указанное время
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread was interrupted");
            }
            System.out.println("Slept for " + sleepTime + " milliseconds");
        }
    }
}
