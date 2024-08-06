package telran.homework.lesson23;
/*
Создайте класс HomeWorkCallable
a. создайте в нем метод public static int waitSomeTime который
     спит рандомное время от 0 до 1000 мс и
     возвращает это время в качестве результата
b. Создайте и запустите два Callable каждый из которых выполняет waitSomeTime и возвращает результат
с. В main получите и сложите эти результаты, запустив эти Callable на двух потоках используя FutureTask
 */

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class HomeWorkCallable {
    public static void main(String[] args) {
        // Создаем два Callable, которые выполняют метод waitSomeTime
        Callable<Integer> callable1 = HomeWorkCallable::waitSomeTime;
        Callable<Integer> callable2 = HomeWorkCallable::waitSomeTime;

        // Создаем два FutureTask для асинхронного выполнения Callable
        FutureTask<Integer> futureTask1 = new FutureTask<>(callable1);
        FutureTask<Integer> futureTask2 = new FutureTask<>(callable2);

        // Запускаем FutureTask на двух потоках
        Thread thread1 = new Thread(futureTask1);
        Thread thread2 = new Thread(futureTask2);
        thread1.start();
        thread2.start();

        try {
            // Получаем результаты выполнения Callable через FutureTask
            int result1 = futureTask1.get();
            int result2 = futureTask2.get();

            // Выводим сумму результатов
            System.out.println("Sum of results: " + (result1 + result2));
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    } // main

    // Метод, который спит случайное время от 0 до 1000 мс и возвращает это время
    public static int waitSomeTime() {
        int sleepTime = (int) (Math.random() * 1001);
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread was interrupted");
        }
        return sleepTime;
    }

}
