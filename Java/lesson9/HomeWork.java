package telran.homework.lesson9;

import java.util.Scanner;
import java.util.Stack;
// Напишите класс который считывает вводимые пользователем
// строки с консоли до того момента как встретится строка quit
// После этого все до введенные ранее строки нужно распечатать в обратном порядке.
public class HomeWork {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String s = "";
        while (!s.equals("quit")) {
            s = scanner.nextLine();
            stack.push(s);
        }
        while (!stack.isEmpty())
        {
            System.out.println("stack element: " + stack.pop());
        }
    }
}
