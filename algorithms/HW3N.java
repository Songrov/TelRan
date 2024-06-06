package telran.homework.algorithms;

import java.util.Scanner;
/*
Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки, или слово NO в противном случае.
Операцией возведения в степень пользоваться нельзя!
Ввод
Вывод
8
YES
3
NO
 */
public class HW3N {
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


