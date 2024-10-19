package telran.homework.lesson22;

import java.util.Random;/*
Создайте класс HomeWorkThreads
a создайте в нем два целых статических поля result1 и result2
b. создайте в нем метод public static int waitSomeTime который
     спит рандомное время от 0 до 1000 мс и
     возвращает это время в качестве результата
c. Создайте и запустите два потока, каждый из которых выполняет метод waitSomeTime и
     первый сохраняет результат в поле поля result1
     второй сохраняет результат в поле поля result2
d. В методе main дождитесь окончания работы потоков (join()) и
     распечатайте сумму result1 и result2
 */

public class HomeWorkThreads {
    public static void main(String[] args) throws InterruptedException {
        // Поток для выполнения метода waitSomeTime и сохранения результата в result1
        Thread thread1 = new Thread(() -> {
            result1 = waitSomeTime();
        });

        // Поток для выполнения метода waitSomeTime и сохранения результата в result2
        Thread thread2 = new Thread(() -> {
            result2 = waitSomeTime();
        });

        // Запуск потоков
        thread1.start();
        thread2.start();

        // Ожидание завершения работы потоков
        thread1.join();
        thread2.join();


        System.out.println("result1: " + (result1));
        System.out.println("result2: " + (result2));
    }

    // Статические поля для сохранения результатов работы потоков
    static int result1 = 0;
    static int result2 = 0;

    // Метод, который спит случайное время от 0 до 1000 мс и возвращает это время
    public static int waitSomeTime() {
        int sleepTime = (int) (Math.random() * 1000);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread was interrupted");
        }
        return sleepTime;
    }
}

