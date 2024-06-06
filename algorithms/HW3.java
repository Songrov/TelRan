package telran.homework.algorithms;

import java.util.Scanner;
/*
Дано натуральное число N. Вычислите сумму его цифр.
При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
Ввод
Вывод
179
17
985
22
 */
public class HW3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            scanner.close();

            if (isPowerOfTwo(N)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        public static boolean isPowerOfTwo(int n) {
            return (n > 0) && ((n & (n - 1)) == 0);
        }
    }

