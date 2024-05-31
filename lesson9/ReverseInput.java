package telran.homework.lesson9;
/*
 Напишите класс который считывает строки с консоли до того момента как встретится строка quit
После этого все до этого введенные строки нужно распечатать в обратном порядке.
Например:
one
two
three
quit
->
three
two
one
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lines = new ArrayList<>();

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("quit")) {
                break;
            }
            lines.add(line);
        }

        for (int i = lines.size() - 1; i >= 0; i--) {
            System.out.println(lines.get(i));
        }

        scanner.close();
    }
}

