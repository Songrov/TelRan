package telran.homework.algorithms;
/*
Напишите рекурсивный метод, который выводит на экран числа Фибоначчи до N-ого элемента.
Напишите рекурсивный метод, который проверяет, является ли строка палиндромом.
 */
public class HW3Fibonacci {
        public static void main(String[] args) {
            int N = 10;  // Замените это значение на любое другое, чтобы получить больше или меньше чисел Фибоначчи
            System.out.println("Фибоначи" + N + " елемент:");
            for (int i = 0; i < N; i++) {
                System.out.print(fibonacci(i) + " ");



                String str = "анна";
                if (isPalindrome(str, 0, str.length() - 1)) {
                    System.out.println(str + " палиндром");
                } else {
                    System.out.println(str + " не полидром.");
                }


            }
        } // main

    public static boolean isPalindrome(String str, int left, int right) {
        // Базовый случай: если левый индекс правого, значит, строка является палиндромом
        if (left >= right) {
            return true;
        }
        // Проверяем, совпадают ли символы на текущих позициях
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        // Рекурсивный случай: проверяем оставшуюся часть строки
        return isPalindrome(str, left + 1, right - 1);
    }


        public static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
    }
