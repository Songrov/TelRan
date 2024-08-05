package telran.homework.lesson22;

import java.util.List;

/*
1. Создать класс MyRunnable который
a. принимает на вход список строк
b. распечатывает каждый элемент и ждет одну секунду перед распечатыванием следующего элемента
c. создать и запустить поток, принимающий экземпляр этого Runnable с произвольным списком
 */
public class MyRunnable implements Runnable{
    public static void main(String[] args) {
        // Создаем список строк
        List<String> listOfStrings = List.of("Hello", "World", "This", "Is", "Java");

        // Создаем экземпляр MyRunnable
        MyRunnable myRunnable = new MyRunnable(listOfStrings);

        // Создаем и запускаем поток
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
        private final List<String> strings;

        public MyRunnable(List<String> strings) {
            this.strings = strings;
        }

        @Override
        public void run() {
            for (String str : strings) {
                System.out.println(str);
                try {
                    Thread.sleep(1000); // Ожидание в 1 секунду перед следующим выводом
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Восстановление прерванного статуса
                    System.out.println("Thread was interrupted, Failed to complete operation");
                    break;
                }
            }
        }

    }
