package telran.homework.lesson12;
/*
Для элементов списка строк:

выберите только элементы длиной меньше 7 символов
преобразуйте их в верхний регистр
добавьте к ним длину
вызовите функцию которая преобразует строки в обратный порядок

Пример: ["Dima", "Max", "Alexander"] -> ["4-AMID", "3-XAM"]
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class String {
    public static void main(java.lang.String[] args) {
        List<java.lang.String> names = Arrays.asList("Dima", "Max", "Alexander");

        List<java.lang.String> result = names.stream()
                .filter(name -> name.length() < 7)
                .map(name -> name.toUpperCase() + "-" + name.length())
                .map(String::reverseString)
                .collect(Collectors.toList());

        System.out.println(result);
    }

    public static java.lang.String reverseString(java.lang.String input) {
        return new StringBuilder(input).reverse().toString();
    }
    }
